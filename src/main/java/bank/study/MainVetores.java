package bank.study;

public class MainVetores {
    public static void main(String[] args) {
        int[] numeros;

        numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;


        for (int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);}

        String[] nomes = new String[5];
        nomes[0]= "Lucas";

        nomes[2]= "Camila";
        nomes[3]= "Joao";

        for (int i=0; i<nomes.length; i++){
            if (nomes[i]!=null){
            System.out.println(nomes[i]);
        }}

        // Acessar e imprimir elementos do vetor
        System.out.println("O primeiro número é: " + numeros[0]);
        System.out.println("O terceiro número é: " + numeros[2]);
    }

    }

