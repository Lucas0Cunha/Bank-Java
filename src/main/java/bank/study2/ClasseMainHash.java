package bank.study2;

public class ClasseMainHash {
    public static void main(String[] args) {
        ClienteHash a1 = new ClienteHash("Joao", 123);
        ClienteHash a2 = new ClienteHash("Jose", 456);
        ClienteHash a3 = new ClienteHash("Lucas", 789);

        RepositoryCliente lista = new RepositoryCliente();
        lista.adicionaHash(a1);
        lista.adicionaHash(a2);
        lista.adicionaHash(a3);

        System.out.println(lista.toStringHash());

        System.out.println(lista.contemHash(456));
        System.out.println(lista.contemHash(111));


        String x = lista.pegaHash(789);
        System.out.println(x);

        lista.removeHash(456);
        System.out.println(lista.toStringHash());


        ClienteHash a4 = new ClienteHash("Maria", 654);
        lista.atualizaHashMap(789,a4);
        System.out.println(lista.toStringHash());






    }
}
