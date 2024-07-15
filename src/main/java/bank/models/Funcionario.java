package bank.models;

public class Funcionario extends Pessoa {

	private String cargo;
	private double salario;


	public Funcionario() {
	}

	public Funcionario(String name, String cpf) {
		super(name, cpf);
	}

	public Funcionario(String email, String name, String cpf) {
		super(email, name,cpf);
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
