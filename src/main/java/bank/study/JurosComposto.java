package bank.study;

public class JurosComposto {
    public static void main(String[] args) {

        double saldo;
        double juros;
        int tempo;


        saldo = 250;
        juros = 0.85;
        tempo = 24;


        double resultado = saldo;


        for (int i = 0; i < 24; i++) {
       resultado = resultado * (1+(juros/100));
        }
        System.out.println("O resultado é:" + resultado);
    }
}
