package bank.models;

public class ContaCredito {
    final private double saldo=100;
    private int id;
    private String numero;
    private String dataValidade;
    private double limite;


    public void PermissaoCredito(){

        if (saldo==0 ){
            System.out.println("Você não pode usar crédito, pois seu saldo é de 0");
        }else if (saldo<0){
            System.out.println("Você não pode ter crédito pois seu saldo está negativo");
        }else{
            System.out.println("Você está liberado ao uso de crédito");
        }

    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public void setSaldoDevedor(double saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }

    private double saldoDevedor;

    public double getSaldo() {
        return saldo;
    }


}
