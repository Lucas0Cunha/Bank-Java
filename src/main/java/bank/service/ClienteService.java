package bank.service;

import bank.exceptions.ClienteNaoExisteException;
import bank.models.Cliente;

import java.util.List;

public interface ClienteService {

    /**
     * Este metodo serve para adicionar algum objeto criado.
     * Regra de negocio: Apenas permite dar um add em objeto conta se ele existir,
     * @param cliente
     * @throws ClienteNaoExisteException
     */
    public void add(Cliente cliente);

    /**
     * Metodo que percorre a lista.
     * @return
     */
    public List<Cliente> getAll();

    /**
     * Este metodo serve para puxar as informações do objeto
     * @param clienteget
     * @return
     */
    public Cliente get(String clienteget);

    /**
     * Este metodo serve para deletar algum dado ja inserido
     * Metodo delete que possui regra de negocio para permitir o delete apenas se o objeto existir atraves do uso do contem
     * @param cliente
     * @throws IllegalArgumentException
     */
    public void delete(Cliente cliente);

    /**
     * Este metodo verifica se o valor desejado por parametro existe.
     * @param clientecontem
     * @return
     */
    public boolean contem(String clientecontem);

    /**
     * Este metodo serve para atualizar algum dado já existente
     * Regra de negocio: Apenas permite que se atualize se o objeto existir atraves do uso do metodo contem
     * @param update
     * @throws IllegalArgumentException
     */
    public boolean update(Cliente update);

}
