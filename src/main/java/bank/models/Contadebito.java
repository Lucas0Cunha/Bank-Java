package bank.models;

import bank.util.TipoConta;

public class Contadebito extends Conta{
    double saldo;

    public Contadebito(String name, String cpfCnpj) {
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
		return TipoConta.DEBITO;
	}
}
