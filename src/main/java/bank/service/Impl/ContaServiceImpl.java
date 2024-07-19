package bank.service.Impl;

import bank.models.Conta;
import bank.service.ContaService;

public class ContaServiceImpl implements ContaService {
    private Conta[] contas = new Conta[3];
    private int totalDeContas =0;

    @Override
    public void add(Conta contas) {
        this.garanteEspaco();
        this.contas[totalDeContas]= contas;
        //totalDeClientes = totalDeClientes + 1;
        totalDeContas++;
    }

    //Alterar metodo para buscar o numero da conta
    @Override
    public Conta get(String conta) {

        if(!posicaoOcupada(conta.getId())) {
            throw new IllegalArgumentException("posiçao invalida");
        }

        return contas[Integer.parseInt(conta)];
    }



    @Override
    public void update(Conta conta, Conta contaAtualizada) {
        if (!posicaoOcupada(conta.getId())) {
            throw new IllegalArgumentException("Posição inválida");
        }

        contas[conta.getId()] = contaAtualizada;
    }


    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeContas;
    }

    //[0] = Lucas, [1] = Antonio, [2] = Rodrigo, [3] = null, totalDeClientes = 3
    //[0] = Lucas, [1] = Rodrigo, [2] = null , totalDeClientes = 2



    @Override
    public void delete(Conta conta) {

        if (conta.getId() < 0 || conta.getId() >= this.totalDeContas) {
            throw new IllegalArgumentException("Posição inválida: " + conta);
        }
        for(int i = conta.getId(); i < this.totalDeContas -1; i++) {
            this.contas[i] = this.contas[i + 1];
        }
        this.contas[this.totalDeContas - 1] = null;

        //totalDeClientes = totalDeClientes - 1;
        this.totalDeContas--;
    }

    @Override
    public boolean contem(String nome) {
        if(contas != null) {
            for (int i = 0; i < totalDeContas; i++) {
                Conta contaIdx = this.contas[i];
                if (nome.getId() == contaIdx.getId()) {
                    return true;
                }
            }
        }else {
            System.out.println("Não é possível utilizar o método (contem) porque o cliente é null");
        }

        return false;
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

    @Override
    public Conta[] getAll()    {
        return this.contas;
    }

}
