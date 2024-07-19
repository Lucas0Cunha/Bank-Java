package bank.service;

import bank.models.Cliente;

import java.util.List;

public interface ClienteService {

    public void add(Cliente cliente);
    public List<Cliente> getAll();
    public Cliente get(String clienteget);
    public void delete(Cliente cliente);
    public boolean contem(String clientecontem);
    public boolean update(Cliente update);

}
