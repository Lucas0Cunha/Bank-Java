package bank.repository.impl;

import bank.exceptions.ClienteNaoExisteException;
import bank.service.ClienteFactoryNull;
import bank.models.Cliente;
import bank.repository.ClienteDAO;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
    private static List<Cliente> dataBase = new ArrayList<>();
    private ClienteFactoryNull clienteFactory;

   /* // este facotry tem a ideia de facilitar no futuro a criação de novos tipo de clientes, sem precisar ficar criando uma classe distinta para cada um deles
    // basta eu mudar no meu pacote factory oq os novos tipos de clientes precisarão e adicionar o metodo aqui
    public ClienteDAOImpl() {
        this.clienteFactory = new DefaultClienteFactory();
    }

    public Cliente createCliente(String email, String name, String cpfCnpj) {
        return clienteFactory.createCliente(email, name, cpfCnpj);
    } */


    @Override
    public void add(Cliente cliente) {
        dataBase.add(cliente);
        System.out.println("Cliente adicionado com sucesso!");
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
