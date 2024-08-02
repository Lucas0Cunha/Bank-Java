package bank.models;

import bank.util.TipoConta;

public class ContaDebito extends Conta{
    double saldo;

    public ContaDebito(String numero, String cpfCnpj) {
        super(numero, cpfCnpj);
    }
    
    public ContaDebito(String numero, String cpfCnpj, double saldo) {
        super(numero, cpfCnpj);
        this.saldo = saldo;
    }

    public ContaDebito() {
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
