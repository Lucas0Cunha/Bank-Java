package bank.models;

public class Parcelamento {

    private int id;
    private double valor;
    private double taxaJuros;
    private int mesesDuracao;
    private double valorParcela;
    private double valorfinal;

    //TODO constructor

    public void parcelar() {

        for (double i = 0; i < mesesDuracao; i++) {
            valorParcela = valor * (1 + (taxaJuros / 100));
        }
       // System.out.println("O valor da parcela é de:"parcelar());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
    	this.valor = valor;
    }

    public double getTaxaJuros() {
        return this.taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
    	this.taxaJuros = taxaJuros;
    }

    public int getMesesDuracao() {
        return mesesDuracao;
    }

    public void setMesesDuracao(int mesesDuracao) {
    	this.mesesDuracao = mesesDuracao;
    }

    public double getValorParcela() {
        return this.valorParcela;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public double getValorfinal() {
        return valorfinal;
    }

    public void setValorfinal(double valorfinal) {
    	this.valorfinal = valorfinal;
    }


}
