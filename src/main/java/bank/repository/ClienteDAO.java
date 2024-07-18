package bank.repository;

import java.util.List;

import bank.models.Cliente;

public interface ClienteDAO {
	public void inserir(Cliente cliente);

	public Cliente get(String cpfcnpj);

	public List<Cliente> getAll();

	public void delete(Cliente cliente);

	public boolean update(Cliente update);

	public boolean contem(String cpfCnpj);

}
