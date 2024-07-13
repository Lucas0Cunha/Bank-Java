package bank.repository.impl;

import bank.models.Cliente;
import bank.repository.ClienteDAO;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
    private List<Cliente> dataBase = new ArrayList<>();
    @Override
    public void inserir(Cliente cliente) {
        dataBase.add(cliente);
    }

    @Override
    public Cliente get(String cpfcnpj) {
        for (Cliente cliente : dataBase){
            if (cliente.getCpf().equalsIgnoreCase(cpfcnpj)){
                return cliente;
            }
        }
        return null;
    }

    @Override
    public List<Cliente> getAll() {
        return dataBase;
    }

    //construção dos CRUDS


}
