package bank.models;

public class Empresa extends Pessoa {
    private String cnpj;
    final private double saldo=1000;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getSaldo() {
        return saldo;
    }


}
