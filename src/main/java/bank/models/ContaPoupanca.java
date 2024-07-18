package bank.models;

import bank.util.TipoConta;

public class ContaPoupanca extends Conta{
    double saldo;

    public ContaPoupanca(String name, String cpfCnpj) {
        super(name, cpfCnpj);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

	@Override
	public TipoConta getTipoConta() {
		return TipoConta.POUPANCA;
	}
}
