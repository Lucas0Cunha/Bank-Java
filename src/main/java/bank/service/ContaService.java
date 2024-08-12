package bank.service;

import bank.dto.ContaRequestDTO;
import bank.exceptions.ClienteNaoExisteException;
import bank.models.Conta;

public interface ContaService {
    /**
     * Este metodo serve para adicionar algum objeto criado.
     * Regra de negocio: Apenas permite dar um add em objeto conta se ele existir,
     * @param contas
     * @throws ClienteNaoExisteException
     */
    public void add(Conta contas);
    //Metodo precisa ser adicionado ao service

    /**
     * metodo Factory para devolver diferentes objetos atraves de um contaDTO
     * @param contaDTO
     * @return
     */
    //Metodo para o conta request
    public void add(ContaRequestDTO contaDTO);

    /**
     * Este metodo verifica se o valor desejado por parametro existe.
     * @param numeroConta
     * @return
     */
    public boolean contem(String numeroConta);

    /**
     * Este metodo serve para atualizar algum dado já existente
     * Regra de negocio: Apenas permite que se atualize se o objeto existir atraves do uso do metodo contem
     * @param contaAtualizada
     * @throws IllegalArgumentException
     */
    public void update(Conta contaAtualizada);

    /**
     * Este metodo serve para deletar algum dado ja inserido
     * Metodo delete que possui regra de negocio para permitir o delete apenas se o objeto existir atraves do uso do contem
     * @param conta
     * @throws IllegalArgumentException
     */
    public void delete(Conta conta);

    /**
     * Metodo que percorre a lista.
     * @return
     */
    public Conta[] getAll();

    /**
     * Este metodo serve para puxar as informações do objeto
     * @param numeroConta
     * @return
     */
    public Conta get(String numeroConta);


    /**
     * Metodo que define qual limite disponivel em conta
     *
     * @param saldo
     * @return
     */
    public double limiteget(double saldo);

    double getSaldo();
}
