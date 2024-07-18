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


	//Ajuda n entendi esse conceito tao bem ainda
	@Override
	public String toString() {
		return  "Tipo Cliente: " + this.tipoCliente +
				", name: " + name;}

	public TipoDeCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoDeCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}


}
