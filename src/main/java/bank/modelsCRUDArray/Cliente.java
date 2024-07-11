package bank.modelsCRUDArray;

public class Cliente {
    String nome;
    int id;
    int cpfcnpj;
    double saldo;

    public Cliente(int cpfcnpj,String nome) {
        this.cpfcnpj = cpfcnpj;

        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }



    public int getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(int cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
