package bank.study;
import bank.models.Conta;
import bank.models.ContaCredito;
import bank.models.ContaPoupanca;
import bank.models.ContaSalario;
import bank.models.Contadebito;
import bank.repository.ContaDAO;
import bank.repository.impl.ContaDAOImpl;

public class RepositoryConta {
    public static void main(String[] args) {
        ContaDAO contaDAO = new ContaDAOImpl();
        Conta a1 = new ContaCredito("21","5511");
        Conta a2 = new Contadebito("22","1155");
        Conta a3 = new ContaPoupanca("23","33555");
        Conta a4 = new ContaSalario("24","6677");
        contaDAO.adiciona(a1);
        contaDAO.adiciona(a2);
        contaDAO.adiciona(a3);
        contaDAO.adiciona(a4);


        System.out.println(a3.toString());
        Conta[] contas = contaDAO.getAll();
        
        for(Conta conta : contas) {
        	if(conta != null) {
        		System.out.println(conta.toString());
        	}	
        }

        System.out.println(contaDAO.pega(1));

    }
}
