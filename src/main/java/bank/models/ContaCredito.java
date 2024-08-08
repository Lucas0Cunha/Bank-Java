package bank.models;

import bank.util.TipoConta;

public class ContaCredito extends Conta {

	private double limite;
	private String dataValidade;


	public ContaCredito(String numero, String cpfCnpj) {
		super(numero, cpfCnpj);
	}

	public ContaCredito() {
	}


	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}





	@Override
	public TipoConta getTipoConta() {
		return TipoConta.CREDITO;
	}


	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}
