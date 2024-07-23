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
    public void add(Cliente cliente) {
    	
        //if (cliente.getName().length()>5){
            clienteDAO.add(cliente);
       // }
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
    public void delete(Cliente cliente) {
    	clienteDAO.delete(cliente);
    }

    @Override
    public boolean contem(String clientecontem) {
    	return clienteDAO.contem(clientecontem);
    }

    @Override
    public boolean update(Cliente update) {
    	return clienteDAO.update(update);
    }


}
