package bank.study;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Lucas");
        nomes.add("Mario");
        nomes.add("Joao");

        for (int i=0;i<nomes.size();i++){
            System.out.println(nomes.get(i));

        }
        String teste = "Lucas";
        System.out.println(teste.substring(0,1));

    }
}
