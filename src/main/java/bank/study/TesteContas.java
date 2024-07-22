package bank.study;

import bank.models.Conta;
import bank.models.Contadebito;
import bank.repository.ContaDAO;
import bank.repository.impl.ContaDAOImpl;

public class TesteContas {

	public static void main(String[] args) {
		ContaDAO db = new ContaDAOImpl();
		Conta c1 = new Contadebito("123456", "123");
		Conta c2 = new Contadebito("987654", "123");
		Conta c3 = new Contadebito("456789", "123");
		db.add(c1);
		db.add(c2);
		db.add(c3);
		
		Conta contaGet = db.get("123456");
		System.out.println(contaGet);
		
		System.out.println(contaGet.getCpfCnpj());
		
	}
}
