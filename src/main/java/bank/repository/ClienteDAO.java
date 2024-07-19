package bank.repository;

import java.util.List;

import bank.models.Cliente;

public interface ClienteDAO extends GenericsInterface<Cliente,String>{

	public List<Cliente> getAll();



}
