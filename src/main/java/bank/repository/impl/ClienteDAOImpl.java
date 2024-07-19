package bank.repository.impl;

import bank.models.Cliente;
import bank.repository.ClienteDAO;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
	private List<Cliente> dataBase = new ArrayList<>();

	@Override
	public void add(Cliente cliente) {
		dataBase.add(cliente);
	}

	@Override
	public Cliente get(String clienteget) {
		for (Cliente cliente : dataBase) {
			if (cliente.getCpfCnpj().equalsIgnoreCase(clienteget)) {
				return cliente;
			}
		}
		return null;
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
	public boolean contem(String clientecontem) {
		for (Cliente cliente : dataBase) {
			if (cliente.getCpfCnpj().equals(clientecontem)) {
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
