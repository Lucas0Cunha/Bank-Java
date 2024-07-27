package bank.service;

import bank.exceptions.ClienteNaoExisteException;
import bank.models.Funcionario;

import java.util.Map;

public interface FuncionarioService {


    /**
     * Este metodo serve para adicionar algum objeto criado.
     * Regra de negocio: Apenas permite dar um add em objeto conta se ele existir,
     * @param funcionario
     * @throws ClienteNaoExisteException
     */
    public void add(Funcionario funcionario);

    /**
     * Este metodo verifica se o valor desejado por parametro existe.
     * @param contem
     * @return
     */
    public boolean contem(String contem);

    /**
     * Este metodo serve para atualizar algum dado já existente
     * Regra de negocio: Apenas permite que se atualize se o objeto existir atraves do uso do metodo contem
     * @param update
     * @throws IllegalArgumentException
     */
    public boolean update(Funcionario update);

    /**
     * Este metodo serve para deletar algum dado ja inserido
     * Metodo delete que possui regra de negocio para permitir o delete apenas se o objeto existir atraves do uso do contem
     * @param delete
     * @throws IllegalArgumentException
     */
    public void delete(Funcionario delete);

    public String toString();

    /**
     * Este metodo serve para puxar as informações do objeto
     * @param funcionario
     * @return
     */
    public Funcionario get(String funcionario);

    /**
     * Metodo que percorre a lista.
     * @return
     */
    public Map<String, Funcionario> getAll();


}
