package bank.models;

public class Parcelamento {
    private int id;
    private int numeroparcelas;
    private double jurosc;
    private double valor;


    public void parcelar(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroparcelas() {
        return numeroparcelas;
    }

    public void setNumeroparcelas(int numeroparcelas) {
        this.numeroparcelas = numeroparcelas;
    }

    public double getJurosc() {
        return jurosc;
    }

    public void setJurosc(double jurosc) {
        this.jurosc = jurosc;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
