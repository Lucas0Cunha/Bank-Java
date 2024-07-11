package bank.study2;

import java.util.Arrays;

public class Contas {
    private Clientes[] clientes = new Clientes[3];
    private int totalDeClientes=0;

    public void adiciona(Clientes clientes) {
        this.garanteEspaco();
        this.clientes[totalDeClientes]= clientes;
        //totalDeClientes = totalDeClientes + 1;
        totalDeClientes++;
    }

    public Clientes pega(int posicao) {

        if(!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("posiçao invalida");
        }

        return clientes[posicao];
    }

    public void atualiza(int posicao, Clientes clienteAtualizado) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        clientes[posicao] = clienteAtualizado;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeClientes;
    }

    //[0] = Lucas, [1] = Antonio, [2] = Rodrigo, [3] = null, totalDeClientes = 3
    //[0] = Lucas, [1] = Rodrigo, [2] = null , totalDeClientes = 2
    public void remove(int posicao) {
    	//TODO melhor o algoritmo da remoção
        if (posicao < 0 || posicao >= this.totalDeClientes) {
            throw new IllegalArgumentException("Posição inválida: " + posicao);
        }
        for(int i = posicao; i < this.totalDeClientes-1; i++) {
            this.clientes[i] = this.clientes[i + 1];
        }
        this.clientes[this.totalDeClientes - 1] = null;

        //totalDeClientes = totalDeClientes - 1;
        this.totalDeClientes--;
    }


    public boolean contem(Clientes cliente) {
    	if(cliente != null) {
    		for (int i = 0; i < totalDeClientes; i++) {
                if (clientes[i].getCpfcnpj() == cliente.getCpfcnpj()) {
                    return true;
                }
            }
    	}else {
    		System.out.println("Não é possível utilizar o método (contem) porque o cliente é null");
    	}
        
        return false;
    }


    public String toString() {
        //facilitará na impressão
        return Arrays.toString(clientes);
    }

    private void garanteEspaco() {
        if(totalDeClientes == clientes.length) {
            Clientes[] novoArray = new Clientes[clientes.length*2];
            for(int i = 0; i < clientes.length; i++) {
                novoArray[i] = clientes[i];
            }
            this.clientes= novoArray;
        }

    }



}


