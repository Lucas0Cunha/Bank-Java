package bank.repository.impl;

import bank.models.Cliente;
import bank.models.Conta;
import bank.repository.ContaDAO;

public class ContaDAOImpl implements ContaDAO {


    private Conta [] contas = new Conta[3];
    private int totalDeContas =0;

    
    public void adiciona(Conta contas) {
        this.garanteEspaco();
        this.contas[totalDeContas]= contas;
        //totalDeClientes = totalDeClientes + 1;
        totalDeContas++;
    }

    public Conta pega(int posicao) {

        if(!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("posiçao invalida");
        }

        return contas[posicao];
    }

    public void atualiza(int posicao, Conta contaAtualizada) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        contas[posicao] = contaAtualizada;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeContas;
    }

    //[0] = Lucas, [1] = Antonio, [2] = Rodrigo, [3] = null, totalDeClientes = 3
    //[0] = Lucas, [1] = Rodrigo, [2] = null , totalDeClientes = 2
    public void remove(int posicao) {

        if (posicao < 0 || posicao >= this.totalDeContas) {
            throw new IllegalArgumentException("Posição inválida: " + posicao);
        }
        for(int i = posicao; i < this.totalDeContas -1; i++) {
            this.contas[i] = this.contas[i + 1];
        }
        this.contas[this.totalDeContas - 1] = null;

        //totalDeClientes = totalDeClientes - 1;
        this.totalDeContas--;
    }

    //ERRADO NA PARTE DO IF MAS N SEI ARRUMAR
       public boolean contem(Conta contas) {
        if(contas != null) {
            for (int i = 0; i < totalDeContas; i++) {
                if (contas.getCpfCnpj() == contas.getCpfCnpj()) {
                    return true;
                }
            }
        }else {
            System.out.println("Não é possível utilizar o método (contem) porque o cliente é null");
        }

        return false;
    }


    public String toString() {
        StringBuilder clientes = new StringBuilder();

        /*
        for (int i=0; i<this.clientes.length;i++){
            Clientes cliente = this.clientes[i];

            if (cliente!= null)
                clientes.append("Nome: ").append(cliente.getNome()).append(" Cpf: ").append(cliente.getCpfcnpj()).append("\n");
        } */

        for (Conta conta :this.contas){
            if (conta != null)
                clientes.append("Numero da conta: ").append(conta.getNumero()).append(" Cpf ou Cnpj: ").append(conta.getCpfCnpj()).append("\n");

        }
        return clientes.toString();
    }

    private void garanteEspaco() {
        if(totalDeContas == contas.length) {

            Conta[] novoArray = new Conta[contas.length*2];
            for(int i = 0; i < contas.length; i++) {
                novoArray[i] = contas[i];
            }
            this.contas = novoArray;
        }
    }

        public void listar()    {
        for (int i=0; i<contas.length; i++){
            if (contas[i]!=null){
                System.out.println(contas[i]);
                 }
            }
        }




}

