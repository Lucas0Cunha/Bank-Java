package bank.repository.impl;

import bank.models.Funcionario;
import bank.repository.FuncionarioDAO;

import java.util.HashMap;
import java.util.Map;

public class FuncionarioDAOImpl implements FuncionarioDAO {

	Map<String, Funcionario> funcionarios = new HashMap<>();

	@Override
	public void add(Funcionario funcionario) {
		funcionarios.put(funcionario.getCpfCnpj(), funcionario);
	}

	@Override
	public boolean contem(String contem) {
		for (Funcionario funcionario : funcionarios.values()) {
			if (funcionario.getCpfCnpj().equals(contem)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean update(Funcionario update) {
		if (this.contem(update.getCpfCnpj())) {
			funcionarios.put(update.getCpfCnpj(), update);
			return true;
		}
		return false;
	}

	@Override
	public void delete(Funcionario funcionario) {
		funcionarios.remove(funcionario);
	}

	@Override
	public String toString() {
		StringBuilder listaClienteHash = new StringBuilder();
		for (Funcionario funcionario : funcionarios.values()) {
			listaClienteHash.append("Nome: ").append(funcionario.getName()).append(" Cpf:")
					.append(funcionario.getCpfCnpj()).append("\n");
		}

		for (Map.Entry<String, Funcionario> entry : funcionarios.entrySet()) {
			listaClienteHash.append("Nome: ").append(entry.getValue()).append(" Cpf:").append(entry.getKey())
					.append("\n");
		}
		return listaClienteHash.toString();
	}

	public String toStringHash() {
		StringBuilder listaClienteHash = new StringBuilder();
		for (Funcionario funcionario : funcionarios.values()) {
			listaClienteHash.append("Nome: ").append(funcionario.getName()).append(" Cpf:")
					.append(funcionario.getCpfCnpj()).append("\n");
		}

		for (Map.Entry<String, Funcionario> entry : funcionarios.entrySet()) {
			listaClienteHash.append("Nome: ").append(entry.getValue()).append(" Cpf:").append(entry.getKey())
					.append("\n");
		}
		return listaClienteHash.toString();

	}

	@Override
	public Funcionario get(String funcionario) {
		return this.funcionarios.get(funcionario);
	}

	@Override
	public Map<String, Funcionario> getAll() {
		return this.funcionarios;
	}

}
