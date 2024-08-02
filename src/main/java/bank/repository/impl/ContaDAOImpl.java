package bank.repository.impl;

import bank.models.Cliente;
import bank.models.Conta;
import bank.repository.ContaDAO;

public class ContaDAOImpl implements ContaDAO {
    // PADRAO SINGLETON, FUNCIONARIA PARA MANTER A BASE DE DADOS UNICA (O MESMO USO DO STATIC NESSE CASO)
    //TODO ONDE EU VEJO A ALTERAÇÃO
    private static ContaDAOImpl instance;

    private Conta[] contas = new Conta[50];
    private int totalDeContas = 0;


    public void bubbleSort() {
        //ordenação de array
        Conta aux;
        int tamanho = totalDeContas;

        //percorre a lista de vetores
        for (int i = 0; i < tamanho; i++) {

            //loop dentro de loop, ele vai rodar esse processo até bater o tamanho da array assim a organizando
            for (int j = 0; j < tamanho - 1; j++) {
                //passa o valor de string para int e depois compara se o proximo index tem um numero maior, se tiver ele troca o proximo pelo atual e atual pelo proximo
                //se n tiver ele volta pro loop
                if (Long.parseLong(contas[j].getNumero()) > Long.parseLong(contas[j + 1].getNumero())) {
                    aux = contas[j];
                    //aq ele troca os lugares
                    contas[j] = contas[j + 1];
                    contas[j + 1] = aux;

                }
            }


        }
    }

    private Conta binarySearch(String numeroConta) {
        int tamanho = totalDeContas;
        int esquerda = 0;
        int direita = tamanho - 1;


        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;

            if (contas[meio].getNumero().equals(numeroConta)) {
                return contas[meio];
            } else if (Long.parseLong(contas[meio].getNumero()) < Long.parseLong(numeroConta)) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }

        } return null;
    }

    public static synchronized ContaDAOImpl getInstance() {
        if (instance == null) {
            instance = new ContaDAOImpl();
        }
        return instance;
    }

    //aplicado o bubbleSort para poder organizar a array sempre que for adicionado uma conta
    @Override
    public void add(Conta contas) {
        this.garanteEspaco();
        this.contas[totalDeContas] = contas;
        //totalDeClientes = totalDeClientes + 1;
        totalDeContas++;
        this.bubbleSort();
    }

//aplicado o binary para pegar o numero da conta
    @Override
    public Conta get(String numeroConta) {

        this.binarySearch(numeroConta);
        return null;
    }


    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeContas;
    }

    //[0] = Lucas, [1] = Antonio, [2] = Rodrigo, [3] = null, totalDeClientes = 3
    //[0] = Lucas, [1] = Rodrigo, [2] = null , totalDeClientes = 2

//Alterar metodo para buscar o numero da conta


    @Override
    public void delete(Conta conta) {

        if (conta.getId() < 0 || conta.getId() >= this.totalDeContas) {
            throw new IllegalArgumentException("Posição inválida: " + conta);
        }
        for (int i = conta.getId(); i < this.totalDeContas - 1; i++) {
            this.contas[i] = this.contas[i + 1];
        }
        this.contas[this.totalDeContas - 1] = null;

        //totalDeClientes = totalDeClientes - 1;
        this.totalDeContas--;
    }

    @Override
    public boolean contem(String numeroConta) {
        if (contas != null) {
            for (int i = 0; i < totalDeContas; i++) {
                Conta contaIdx = this.contas[i];
                if (contaIdx.getNumero().equals(numeroConta)) {
                    return true;
                }
            }
        }

        return false;
    }

    private void garanteEspaco() {
        if (totalDeContas == contas.length) {

            Conta[] novoArray = new Conta[contas.length * 2];
            for (int i = 0; i < contas.length; i++) {
                novoArray[i] = contas[i];
            }
            this.contas = novoArray;
        }
    }

    @Override
    public Conta[] getAll() {
        return this.contas;
    }

    @Override
    public boolean update(Conta novaConta) {

        if (this.contem(novaConta.getNumero())) {

            for (int i = 0; i < this.totalDeContas; i++) {
                Conta contaIdx = this.contas[i];
                if (contaIdx.getNumero().equals(novaConta.getNumero())) {
                    this.contas[i] = novaConta;
                    return true;
                }
            }
        }

        return false;
    }

}

