package bank.models;

import bank.util.TipoConta;

public class ContaSalario extends Conta{

	private double saldo;

	public ContaSalario(String numero, String cpfCnpj) {
		super(numero, cpfCnpj);
	}

	public ContaSalario() {
	}

	public ContaSalario(String numero, String cpfCnpj, double saldo) {
		super(numero, cpfCnpj);
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public TipoConta getTipoConta() {
		return TipoConta.SALARIO;
	}
	
}
