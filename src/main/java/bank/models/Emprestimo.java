package bank.models;

public class Emprestimo {

    private int id;
    private static double valor;
    private static double taxaJuros;
    private static int mesesDuracao;
    private static double valorParcela;
    private static double valorfinal;

    public static void parcela(){
    valor = 10000;
    mesesDuracao=10;
    taxaJuros=3;

    for (int i=0;i<9;i++ ){
        valorParcela = (valor)*(taxaJuros/100);
        valorfinal = (valorParcela*mesesDuracao) + valor;
    }
        System.out.println("O valor final pago no empréstimo é de:" +valorfinal);
        System.out.println("Valor excedente é de:" +(valorfinal-valor));

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
