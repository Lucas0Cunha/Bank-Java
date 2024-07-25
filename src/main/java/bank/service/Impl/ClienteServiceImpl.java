package bank.service.Impl;

import java.util.List;

import bank.models.Cliente;
import bank.repository.ClienteDAO;
import bank.repository.impl.ClienteDAOImpl;
import bank.service.ClienteService;

/**
 * Camada de regra de negocio
 * @author Lucas
 *
 */
public class ClienteServiceImpl implements ClienteService {
    private ClienteDAO clienteDAO = new ClienteDAOImpl(); 
    
    @Override
    public void add(Cliente cliente) throws IllegalArgumentException{

        if (!clienteDAO.contem(cliente.getCpfCnpj())) {
            clienteDAO.add(cliente);
        } else {
            throw new IllegalArgumentException("CPF ou CNPJ já cadastrado no sistema.");
        }
    }

    @Override
    public List<Cliente> getAll() {
        return clienteDAO.getAll();
    }

    @Override
    public Cliente get(String clienteget) {
    	return clienteDAO.get(clienteget);
    }


    @Override
    public void delete(Cliente cliente) throws IllegalArgumentException{
        if (clienteDAO.contem(cliente.getCpfCnpj())) {
            clienteDAO.delete(cliente);
        } else {
            throw new IllegalArgumentException("Cliente não encontrado para exclusão.");
        }
    }


    @Override
    public boolean contem(String clientecontem) {
    	return clienteDAO.contem(clientecontem);
    }

    @Override
    public boolean update(Cliente update) throws IllegalArgumentException{
        if (clienteDAO.contem(update.getCpfCnpj())) {
            return clienteDAO.update(update);
        } else {
            throw new IllegalArgumentException("Cliente não encontrado para atualização.");
        }
    }
    }



