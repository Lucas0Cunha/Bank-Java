package bank.models;

public class Contadebito extends Pessoa{
    double saldo;

    public Contadebito(String name, String cpfCnpj) {
        super(name, cpfCnpj);
    }

    public Contadebito(String email, String name, String cpfCnpj) {
        super(email, name, cpfCnpj);
    }

    public Contadebito(String name, int id) {
        super(name, id);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
