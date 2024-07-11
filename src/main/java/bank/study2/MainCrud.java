package bank.study2;

public class MainCrud {
    public static void main(String[] args) {
        Clientes a1 = new Clientes("Joao", 123);
        Clientes a2 = new Clientes("Jose", 456);
        Clientes a3 = new Clientes("Lucas", 789);
        Contas lista = new Contas();

        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);

        System.out.println(lista);

        System.out.println(lista.contem(null));
        System.out.println(lista.contem(a3));


        Clientes x = lista.pega(0);
        System.out.println(x);

        lista.remove(1);
        System.out.println(lista);


        Clientes a4 = new Clientes("Maria", 654);
        lista.atualiza(0, a4);
        System.out.println(lista);

        System.out.println(lista.toString());





    }

    }

