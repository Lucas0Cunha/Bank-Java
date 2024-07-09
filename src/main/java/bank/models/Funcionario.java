package bank.models;

public class Funcionario extends Pessoa {

	private String cargo;
	private double salario;

	public Funcionario() {
		super();
	}

	public Funcionario(String email, String name, int id, String cpf) {
		super(email, name, id, cpf);
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
