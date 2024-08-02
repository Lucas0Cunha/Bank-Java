package bank.models;

import bank.util.TipoConta;

public class ContaCredito extends Conta {

	private String dataValidade;
	private double limite;

	public ContaCredito(String numero, String cpfCnpj) {
		super(numero, cpfCnpj);
	}

	public ContaCredito() {
	}

	public void PermissaoCredito(double saldo) {

		if (saldo == 0) {
			System.out.println("Você não pode usar crédito, pois seu saldo é de 0");
		} else if (saldo < 0) {
			System.out.println("Você não pode ter crédito pois seu saldo está negativo");
		} else {
			System.out.println("Você está liberado ao uso de crédito");
		}

	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public TipoConta getTipoConta() {
		return TipoConta.CREDITO;
	}

}
