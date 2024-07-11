package bank.study2;

import java.util.ArrayList;

public class ClasseMain {
    public static void main(String[] args) {
        FuncoesConta lista = new FuncoesConta();

        System.out.println(lista);
        lista.adiciona(511,"Paulo");
        System.out.println(lista);
        lista.adiciona(511,"Paulo");
        System.out.println(lista);
        lista.adiciona(511,"Paulo");
        System.out.println(lista);

        System.out.println(lista.tamanho());

        //Object x = lista.pega(2);
        //System.out.println(x);
    }
}
