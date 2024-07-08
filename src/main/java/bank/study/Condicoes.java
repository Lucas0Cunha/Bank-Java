package bank.study;

public class Condicoes {
    public static void main(String[] args) {
        int valor = 10;

        // condicional SE oq eu determinei dentro dos () for real ele cai em if, se n cai em else if e assim por diante.
        if (valor==10){
            System.out.println("O valor é igual");
        }else if (valor<12){
            System.out.println("O valor é menor");
        }else {
            System.out.println("O valor é maior");
        }

        //operador ternário, basicamente questiona a condição anterior com um ? e depois insere um boolean SE a condição for verdadeira : SE a condição for falsa
        System.out.println(valor>=10 ? "Valor maior ou igual 10" : "Valor menor que 10");


        //switch recebe um valor bruto e os case X verifica se for o mesmo, se sim cai nele.
        switch (valor){
            case 5:
                System.out.println("É igual a 5");
                break;
            case 10:
                System.out.println("É igual a 10");
                break;
            default:
                System.out.println("Não é nenhum dos casos anteriores");
        }

    }
}
