package bank.service.Impl;

import java.util.List;

import bank.exceptions.ClienteRegraDeNegocio;
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

//javadocs p explicar a regra de negocio
    @Override
    public void add(Cliente cliente) throws ClienteRegraDeNegocio {
//add esta com descrição de generics interface
        if (!clienteDAO.contem(cliente.getCpfCnpj())) {
            clienteDAO.add(cliente);
        } else {

            throw new ClienteRegraDeNegocio("CPF ou CNPJ já cadastrado no sistema para este" + cliente);
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
    public void delete(Cliente cliente) throws ClienteRegraDeNegocio {
        if (clienteDAO.contem(cliente.getCpfCnpj())) {
            clienteDAO.delete(cliente);
        } else {
            throw new ClienteRegraDeNegocio("Cliente" + cliente + " não encontrado para exclusão.");
        }
    }


    @Override
    public boolean contem(String clientecontem) {
        if (clienteDAO.contem(clientecontem)) {
            return clienteDAO.contem(clientecontem);
        } else {
            throw new ClienteRegraDeNegocio("Cliente" + clientecontem + " não encontrado para atualização.");
        }
    }

    @Override
    public boolean update(Cliente update) throws ClienteRegraDeNegocio {
        if (clienteDAO.contem(update.getCpfCnpj())) {
            return clienteDAO.update(update);
        } else {
            throw new ClienteRegraDeNegocio("Cliente" + update + "não encontrado para atualização.");
        }
    }


}