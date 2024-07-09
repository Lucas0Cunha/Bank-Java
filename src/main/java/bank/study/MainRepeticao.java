package bank.study;

import java.util.ArrayList;
import java.util.List;

public class MainRepeticao {
    public static void main(String[] args) {

        for (int i = 0; i<10; i++) {
            System.out.println(i);

        }

        List<String> nomes = new ArrayList<>();

        nomes.add("Lucas");
        nomes.add("Antonio");
        nomes.add("Camila");

        for (int i =0;i< nomes.size();i++){
            String nome= nomes.get(i);

            System.out.println(nome);
        }

        //foreach
        for (String nome : nomes){
            System.out.println(nome);
        }

        nomes.forEach(nome->{
            System.out.println(nome);
        });


        
        int contador = 0;
        while (contador<10/*true*/){
            System.out.println(contador);
            contador++;
        /*    if (contador>10){
                break;
            } */

        }

        //roda pelo menos uma vez o codigo do DO para ver se entra na regra do while
        do {
            System.out.println(contador);
            contador++;
        }while (contador<10);


    }


}
