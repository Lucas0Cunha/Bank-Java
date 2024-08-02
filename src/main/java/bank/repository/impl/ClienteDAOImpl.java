package bank.repository.impl;
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
		System.out.println("Cliente adicionado com sucesso!");
	}
//TODO FIZ MAS N ENTENDI 
	public void bubbleSort() {
		int n = dataBase.size();
		boolean swapped;


		for (int i = 0; i < n - 1; i++) {
			swapped = false;

			for (int j = 0; j < n - i - 1; j++) {

				if (dataBase.get(j).getName().compareTo(dataBase.get(j + 1).getName()) > 0) {

					Cliente temp = dataBase.get(j);
					dataBase.set(j, dataBase.get(j + 1));
					dataBase.set(j + 1, temp);
					swapped = true;
				}
			}

			if (!swapped) break;
		}
	}

	public Cliente binarySearch(String nome) {
		int left = 0;
		int right = dataBase.size() - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			Cliente midCliente = dataBase.get(mid);

			int comparison = midCliente.getName().compareTo(nome);

			if (comparison == 0) {
				return midCliente;
			} else if (comparison < 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return null;
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
