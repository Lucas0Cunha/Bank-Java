package bank.repository.impl;

import bank.constantstexts.Constants;
import bank.models.Funcionario;
import bank.repository.FuncionarioDAO;

import java.util.HashMap;
import java.util.Map;

public class FuncionarioDAOImpl implements FuncionarioDAO {

	//STATIC funciona pertencendo a CLASSE e não ao OBJETO, ou seja, funcionarios(nosso bd) não é algo nulo(zerado) quando a classe for instanciada
	//ele vai com cada dado inserido por cada um dos distintos objetos que a utiliza.
	private static Map<String, Funcionario> funcionarios = new HashMap<>();



	@Override
	public void add(Funcionario funcionario) {
		funcionarios.put(funcionario.getCpfCnpj(), funcionario);
	}

	@Override
	public boolean contem(String contem) {
		for (Funcionario funcionario : funcionarios.values()) {
			if (funcionario.getCpfCnpj().equals(contem)) {
				return true;
			}else {
				System.out.println(Constants.inexiste);
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
		funcionarios.remove(funcionario.getCpfCnpj());
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
