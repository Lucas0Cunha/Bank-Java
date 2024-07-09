package bank.study;

import bank.models.Cliente;
import bank.models.Funcionario;
import bank.models.Pessoa;

public class MainAbstract {

	public static void main(String[] args) {
		Pessoa pessoa = new Cliente();
		
		Pessoa pessoa2 = new Funcionario();
		
		if(pessoa2 instanceof Cliente) {
			System.out.println("Pessoa1 é um cliente");
		}else if(pessoa2 instanceof Funcionario) {
			System.out.println("Pessoa1 é um Funcionario");
		}
	}

}
