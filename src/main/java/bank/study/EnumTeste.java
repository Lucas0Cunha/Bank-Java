package bank.study;

public enum EnumTeste {
    Lucas("Lu",20) /* {
   /*     @Override
        public String info() {
            return "Nome: Lucas, Idade: 20" ;
        }
    }*/,
    Joao("Jv",18) /* {
     /*   @Override
        public String info() {
            return "Nome: Joao, Idade: 18";
        }
    }*/,
    Maria("Mah",17)/*;
    {
        @Override
        public String info() {
            return "";
        }
    }*/
    ,
    Leticia("Le",25);
    /* {
        @Override
        public String info() {
            return "";
        }
    },;  */

    private String abr;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public String getAbr() {
        return abr;
    }

    EnumTeste(String abr, int idade) {
        this.abr=abr;
        this.idade=idade;
    }

    // public abstract String info();



}


