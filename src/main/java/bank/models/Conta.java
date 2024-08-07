package bank.models;

import bank.util.TipoConta;

public abstract class Conta {

	private double saldo;
	private int id;
	private String numero;
	private String cpfCnpj;


	public Conta(String numero, String cpfCnpj) {
		this.numero = numero;
		this.cpfCnpj = cpfCnpj;
	}

	public Conta() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	
	public abstract TipoConta getTipoConta();

	
	@Override
	public String toString() {
		return "Conta [tipo: "+ this.getTipoConta() +", id=" + id + ", numero=" + numero + ", cpfCnpj=" + cpfCnpj + "]";
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
