package bank.study2;

public class ClienteHash {

        String nome;
        int id;
        Integer cpfcnpj;
        double saldo;

        public ClienteHash(String nome,Integer cpfcnpj ) {
            this.cpfcnpj = cpfcnpj;

            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getId() {
            return id;
        }



        public Integer getCpfcnpj() {
            return cpfcnpj;
        }

        public void setCpfcnpj(Integer cpfcnpj) {
            this.cpfcnpj = cpfcnpj;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
    }


