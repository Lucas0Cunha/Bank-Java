package bank.models;

public class Cliente extends Pessoa {

	public Cliente() {
		super();
	}

	public Cliente(String email, String name, String cpfCnpj) {
		super(email, name, cpfCnpj);
	}


	//Ajuda n entendi esse conceito tao bem ainda
	@Override
	public String toString() {
		return  "CpfCnpj: " + cpfCnpj +
				", name: " + name;}


}
