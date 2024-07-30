package bank.repository.impl;

import bank.constantstexts.Constants;
import bank.exceptions.ClienteNaoExisteException;
import bank.models.Cliente;
import bank.repository.ClienteDAO;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
	private static List<Cliente> dataBase = new ArrayList<>();

	@Override
	public void add(Cliente cliente) {
		dataBase.add(cliente);
	}

	@Override
	public Cliente get(String cpfCnpj) {
		for (Cliente cliente : dataBase) {
			if (cliente.getCpfCnpj().equalsIgnoreCase(cpfCnpj)) {
				return cliente;
			}
		}
		throw new ClienteNaoExisteException("Cliente com CPF/CNPJ " + cpfCnpj + " não encontrado.");
	}

	@Override
	public List<Cliente> getAll() {
		return this.dataBase;
	}

	@Override
	public void delete(Cliente cliente) {
		dataBase.remove(cliente);
	}

	@Override
	public boolean contem(String cpfCnpj) {
		for (Cliente cliente : dataBase) {
			if (cliente.getCpfCnpj().equals(cpfCnpj)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean update(Cliente update) {
		for (int i = 0; i < dataBase.size(); i++) {
			Cliente currentItem = dataBase.get(i);

			if (currentItem.getCpfCnpj().equals(update.getCpfCnpj())) {
				dataBase.set(i, update);
				return true;
			}
		}
		return false;
	}

}
