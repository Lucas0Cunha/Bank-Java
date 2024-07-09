package bank.models;

public class Cliente extends Pessoa{

    final private double saldo=20;
    private int id;


    public double getSaldo() {
        return saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
