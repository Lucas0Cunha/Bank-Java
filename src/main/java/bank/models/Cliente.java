package bank.models;

import bank.util.TipoDeCliente;

public class Cliente extends Pessoa {
	
	private TipoDeCliente tipoCliente;

	public Cliente() {
		super();
	}

	public Cliente(String email, String name, String cpfCnpj) {
		super(email, name, cpfCnpj);
	}



	@Override
	public String toString() {
		return  "Nome: " + name;}

	public TipoDeCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoDeCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}


}
