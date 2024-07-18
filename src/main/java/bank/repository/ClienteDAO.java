package bank.repository;

import bank.models.Cliente;

public interface ClienteDAO {
    public void inserir(Cliente cliente);
    public Cliente get(String cpfcnpj);
    public String getAll();
    public void delete(Cliente cliente);
    public boolean update(Cliente update);
    public boolean contem(Cliente x);
    public void infoDaConta (Cliente cliente);




}
