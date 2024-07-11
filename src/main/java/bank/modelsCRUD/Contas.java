package bank.modelsCRUD;

import java.util.Arrays;

public class Contas {
    private Clientes[] clientes = new Clientes[100];
    private int totalDeClientes=0;

    public void adiciona(Clientes clientes) {
        this.garanteEspaco();
        this.clientes[totalDeClientes]= clientes;
        totalDeClientes++;
    }

    public Clientes pega(int posicao) {

        if(!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("posiçao invalida");
        }

        return clientes[posicao];
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeClientes;
    }


    public void remove(int posicao) {
        for(int i = posicao; i < this.totalDeClientes; i++) {
            this.clientes[i] = this.clientes[i+1];
        }
        totalDeClientes--;
    }

    public boolean contem(Clientes cliente) {
        for (int i = 0; i < totalDeClientes; i++) {
            if (clientes[i].equals(cliente)) {
                return true;
            }
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


