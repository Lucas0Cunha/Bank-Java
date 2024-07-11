package bank.study2;

public class FuncoesConta {

    private Cliente nome = null;
    private int totalDeClientes = 0;

    public void adiciona(int cpfcnpj,String nome) {
    Cliente cliente = new Cliente(cpfcnpj,nome);
    this.nome= cliente;

    this.totalDeClientes++;
    }

   /* public Cliente pega(int posicao) {

        return this.pega(posicao).getNome();
    }  */



    /* public void remove(int posicao) {

        for(int i = posicao; i < this.totalDeClientes; i++) {
            this.cliente[i] = this.cliente[i+1];
        }
        totalDeClientes--;
    }   */



    public int tamanho() {
        return this.totalDeClientes;
    }

    public boolean contem(Cliente o) {
        return false;
    }

    @Override
    public String toString () {

        if(this.totalDeClientes == 0) {
            return "[]";
        }

        Cliente atual = nome;

        StringBuilder builder = new StringBuilder("[");

        for(int i = 0; i < totalDeClientes; i++) {
            builder.append(atual.getNome());
            builder.append(",");

        }

        builder.append("]");

        return builder.toString();
    }
}
