package bank.study;

import bank.models.Conta;
import bank.models.ContaDebito;
import bank.repository.ContaDAO;
import bank.repository.impl.ContaDAOImpl;

public class TesteContas {

	public static void main(String[] args) {
		ContaDAO db = new ContaDAOImpl();
		Conta c1 = new ContaDebito("123456", "123");
		Conta c2 = new ContaDebito("987654", "123");
		Conta c3 = new ContaDebito("456789", "123");
		db.add(c1);
		db.add(c2);
		db.add(c3);
		
		Conta contaGet = db.get("123456");
		System.out.println(contaGet);
		
		System.out.println(contaGet.getCpfCnpj());
		
	}
}
