package bank.models;

public class Contapoupanca extends Pessoa{
    double saldo;

    public Contapoupanca(String name, String cpfCnpj) {
        super(name, cpfCnpj);
    }

    public Contapoupanca(String email, String name, String cpfCnpj) {
        super(email, name, cpfCnpj);
    }

    public Contapoupanca(String name, int id) {
        super(name, id);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
