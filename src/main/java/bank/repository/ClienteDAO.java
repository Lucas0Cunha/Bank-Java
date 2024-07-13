package bank.repository;

import bank.models.Cliente;

import java.util.List;

public interface ClienteDAO {
    public void inserir(Cliente cliente);
    public Cliente get(String cpfcnpj);
    public List<Cliente> getAll();

    //pass




}
