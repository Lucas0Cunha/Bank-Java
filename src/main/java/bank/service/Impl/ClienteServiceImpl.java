package bank.service.Impl;

import java.util.List;

import bank.exceptions.ClienteJaExisteException;
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

    /**
     * regra de negocio que verifica se não contem, daí adiciona, se não volta erro
     * @param cliente
     * @throws IllegalArgumentException
     */
    @Override
    public void add(Cliente cliente) throws ClienteRegraDeNegocio {
//add esta com descrição de generics interface
        if (!clienteDAO.contem(cliente.getCpfCnpj())) {
            clienteDAO.add(cliente);
        } else {

            throw new ClienteJaExisteException("CPF ou CNPJ já cadastrado no sistema para este" + cliente);
        }
    }

    /**
     * Metodo que retorna a lista toda percorrida.
     * @return
     */
    @Override
    public List<Cliente> getAll() {
        return clienteDAO.getAll();
    }

    /**
     * Este metodo serve para puxar as informações do objeto
     * @param clienteget
     * @return
     */
    @Override
    public Cliente get(String clienteget) {
        return clienteDAO.get(clienteget);
    }


    /**
     * Regra de negocio que verifica se o parametro dado existe, dai o deleta. Se não existir retorna erro
     * @param cliente
     * @throws IllegalArgumentException
     */
    @Override
    public void delete(Cliente cliente) throws ClienteRegraDeNegocio {
        if (clienteDAO.contem(cliente.getCpfCnpj())) {
            clienteDAO.delete(cliente);
        } else {
            throw new ClienteRegraDeNegocio("Cliente" + cliente + " não encontrado para exclusão.");
        }
    }

    /**
     * Regra de negocio que verifica se contem, se sim, retorna o desejado, se não volta erro
     * @param clientecontem
     * @return
     * @throws IllegalArgumentException
     */
    @Override
    public boolean contem(String clientecontem) {
        if (clienteDAO.contem(clientecontem)) {
            return clienteDAO.contem(clientecontem);
        } else {
            return false;//TODO throw new ClienteRegraDeNegocio("Cliente " + clientecontem + " não encontrado para atualização.");
        }
    }

    /**
     * Este metodo serve para atualizar algum dado já existente
     * Regra de negocio: Apenas permite que se atualize se o objeto existir atraves do uso do metodo contem
     * @param update
     * @throws IllegalArgumentException
     */
    @Override
    public boolean update(Cliente update) throws ClienteRegraDeNegocio {
        if (clienteDAO.contem(update.getCpfCnpj())) {
            return clienteDAO.update(update);
        } else {
            throw new ClienteRegraDeNegocio("Cliente não encontrado para atualização.");
        }
    }


}