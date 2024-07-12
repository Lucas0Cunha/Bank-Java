package bank.study;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Lucas");
        nomes.add("Lucas");
        nomes.add("Mario");
        nomes.add("Lucas");

        System.out.println(nomes.toString());

        Set<String> nomesSet = new HashSet<>();
        //n imprime repetidos e tbm imprime de forma aleatoria.


        nomes.forEach(nome -> {
           nomesSet.add(nome);
        });

        nomesSet.forEach(lista -> {
            System.out.println(lista);
        });
    }





}
