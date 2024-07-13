package bank.study;

public class MainEnum {
    public static void main(String[] args) {
      /*  EnumTeste nomeEnum = EnumTeste.Joao;
        System.out.println(nomeEnum.name());

        for (EnumTeste nome : EnumTeste.values()){
            System.out.println(nome.name());
        } */

        String teste = "Jv";
        for (EnumTeste nome : EnumTeste.values()){
            if (teste.equalsIgnoreCase(nome.getAbr())){
                System.out.println(nome);
                break;
            }

        }



    }
}
