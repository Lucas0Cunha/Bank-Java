package bank.service.Impl;

import bank.models.Funcionario;
import bank.repository.FuncionarioDAO;
import bank.repository.impl.FuncionarioDAOImpl;
import bank.service.FuncionarioService;
import java.util.Map;

public class FuncionarioServiceImpl implements FuncionarioService {
    private FuncionarioDAO funcionarioDAO = new FuncionarioDAOImpl();

    @Override
    public void add(Funcionario funcionario) throws IllegalArgumentException{
        if (!funcionarioDAO.contem(funcionario.getCpfCnpj())) {
            funcionarioDAO.add(funcionario);
        } else {
            throw new IllegalArgumentException("CPF ou CNPJ já cadastrado no sistema.");
        }
    }


    @Override
    public boolean contem(String contem)throws IllegalArgumentException{
        if (funcionarioDAO.contem(contem)) {
            return funcionarioDAO.contem(contem);
        } else {
            throw new IllegalArgumentException("Cliente não encontrado para atualização.");
        }
    }

    @Override
    public boolean update(Funcionario update) {
        return funcionarioDAO.update(update);
    }

    @Override
    public void delete(Funcionario delete)  throws IllegalArgumentException{
        //NAO TENHO CTZ SE O USO É CORRETO, AQ ASSUMO Q GETCPFCNPJ É MINHA KEY
        if (funcionarioDAO.contem(delete.getCpfCnpj())) {
            funcionarioDAO.delete(delete);
        } else {
            throw new IllegalArgumentException("Cliente não encontrado para exclusão.");
        }
    }

    @Override
    public Funcionario get(String funcionario) {
        return funcionarioDAO.get(funcionario);
    }

    @Override
    public Map<String, Funcionario> getAll() {
        return funcionarioDAO.getAll();
    }
}

