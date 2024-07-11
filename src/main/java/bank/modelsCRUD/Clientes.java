package bank.modelsCRUD;

import java.util.Arrays;

public class Clientes {
    String nome;
    int id;
    int cpfcnpj;
    double saldo;

    public Clientes() {
    }

    public Clientes(String nome) {
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

    @Override
    public boolean equals(Object obj) {
        Clientes outro = (Clientes) obj;
        return outro.getNome().equals(this.nome);
    }

    @Override
    public String toString() {
        return nome;
    }


}
