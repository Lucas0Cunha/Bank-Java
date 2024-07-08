package bank.study;

public class MainStatic  {
    public static void main(String[] args) {

        //o metodo static é aplicado nessa situação por exemplo quando eu NÃO precisei instanciar a classe contador para dentro do meu main.

        Contador.incrementar();
        System.out.println(Contador.quantidade);




    }
}
