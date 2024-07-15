package bank.models;

public class Conta {

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

}
