package bank.service.Impl;

import bank.constantstexts.Constants;
import bank.exceptions.ClienteRegraDeNegocio;
import bank.models.Funcionario;
import bank.repository.FuncionarioDAO;
import bank.repository.impl.FuncionarioDAOImpl;
import bank.service.FuncionarioService;
import java.util.Map;

public class FuncionarioServiceImpl implements FuncionarioService {
    private FuncionarioDAO funcionarioDAO = new FuncionarioDAOImpl();

    /**
     * regra de negocio que verifica se não contem, daí adiciona, se não volta erro
     * @param funcionario
     * @throws IllegalArgumentException
     */
    @Override
    public void add(Funcionario funcionario) throws ClienteRegraDeNegocio {
        if (!funcionarioDAO.contem(funcionario.getCpfCnpj())) {
            funcionarioDAO.add(funcionario);
        } else {
            throw new IllegalArgumentException(Constants.existente);
        }
    }

    /**
     * Regra de negocio que verifica se contem, se sim, retorna o desejado, se não volta erro
     * @param contem
     * @return
     * @throws IllegalArgumentException
     */
    @Override
    public boolean contem(String contem)throws ClienteRegraDeNegocio{
        if (funcionarioDAO.contem(contem)) {
            return funcionarioDAO.contem(contem);
        } else {
            throw new IllegalArgumentException(Constants.notfound);
        }
    }

    /**
     * Este metodo serve para atualizar algum dado já existente
     * Regra de negocio: Apenas permite que se atualize se o objeto existir atraves do uso do metodo contem
     * @param update
     * @throws IllegalArgumentException
     */
    @Override
    public boolean update(Funcionario update) {
        return funcionarioDAO.update(update);
    }

    /**
     * Regra de negocio que verifica se o parametro dado existe, dai o deleta. Se não existir retorna erro
     * @param delete
     * @throws IllegalArgumentException
     */
    @Override
    public void delete(Funcionario delete)  throws ClienteRegraDeNegocio{
        //NAO TENHO CTZ SE O USO É CORRETO, AQ ASSUMO Q GETCPFCNPJ É MINHA KEY
        if (funcionarioDAO.contem(delete.getCpfCnpj())) {
            funcionarioDAO.delete(delete);
        } else {
            throw new IllegalArgumentException(Constants.notfound);
        }
    }

    /**
     * Este metodo serve para puxar as informações do objeto
     * @param funcionario
     * @return
     */
    @Override
    public Funcionario get(String funcionario) {
        return funcionarioDAO.get(funcionario);
    }

    /**
     * Metodo que puxa todas informações da lista.
     * @return
     */
    @Override
    public Map<String, Funcionario> getAll() {
        return funcionarioDAO.getAll();
    }
}

