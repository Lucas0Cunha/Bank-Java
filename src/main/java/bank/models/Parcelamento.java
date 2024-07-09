package bank.models;

public class Parcelamento {

    private int id;
    private static double valor;
    private static double taxaJuros;
    private static int mesesDuracao;
    private static double valorParcela;
    private static double valorfinal;


    public static void parcelar() {
        valor = 500;
        taxaJuros = 0.65;
        mesesDuracao = 9;

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

    public static double getValor() {
        return valor;
    }

    public static void setValor(double valor) {
        Parcelamento.valor = valor;
    }

    public static double getTaxaJuros() {
        return taxaJuros;
    }

    public static void setTaxaJuros(double taxaJuros) {
        Parcelamento.taxaJuros = taxaJuros;
    }

    public static int getMesesDuracao() {
        return mesesDuracao;
    }

    public static void setMesesDuracao(int mesesDuracao) {
        Parcelamento.mesesDuracao = mesesDuracao;
    }

    public static double getValorParcela() {
        return valorParcela;
    }

    public static void setValorParcela(double valorParcela) {
        Parcelamento.valorParcela = valorParcela;
    }

    public static double getValorfinal() {
        return valorfinal;
    }

    public static void setValorfinal(double valorfinal) {
        Parcelamento.valorfinal = valorfinal;
    }


}
