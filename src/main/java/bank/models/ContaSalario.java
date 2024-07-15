package bank.models;

public class ContaSalario extends Conta{

	private double saldo;

	public ContaSalario(String numero, String cpfCnpj) {
		super(numero, cpfCnpj);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
