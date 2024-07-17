package bank.repository;
import bank.models.Conta;
import bank.repository.impl.ContaDAOImpl;

public class RepositoryConta {
    public static void main(String[] args) {
        ContaDAO contaDAO = new ContaDAOImpl();
        Conta a1 = new Conta("21","5511");
        Conta a2 = new Conta("22","1155");
        Conta a3 = new Conta("23","3355");
        Conta a4 = new Conta("24","6677");
        contaDAO.adiciona(a1);
        contaDAO.adiciona(a2);
        contaDAO.adiciona(a3);
        contaDAO.adiciona(a4);


      //  System.out.println(contaDAO.listar());

        System.out.println(contaDAO.pega(1));




    }
}
