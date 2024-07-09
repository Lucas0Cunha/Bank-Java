package bank.models;

public class Emprestimo {
    private int id;
    private double valor;
    private double taxaJuros;
    private int mesesDuracao;
    private double valorParcela;


    private void emprestimojuros(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxaJuros() {
        return taxaJuros;
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
        return valorParcela;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }
}
