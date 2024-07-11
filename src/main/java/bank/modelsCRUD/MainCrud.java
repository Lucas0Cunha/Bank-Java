package bank.modelsCRUD;

public class MainCrud {
    public static void main(String[] args) {
        Clientes a1 = new Clientes("Joao");
        Clientes a2 = new Clientes("Jose");
        Clientes a3 = new Clientes("Lucas");
        Contas lista = new Contas();

        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista);

        System.out.println(lista.contem(a2));
        System.out.println(lista.contem(a3));


        Clientes x = lista.pega(1);
        System.out.println(x);

        lista.remove(1);
        System.out.println(lista);


    }

    }

