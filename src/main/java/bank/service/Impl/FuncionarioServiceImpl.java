package bank.service.Impl;

import bank.models.Funcionario;
import bank.repository.FuncionarioDAO;
import bank.repository.impl.FuncionarioDAOImpl;
import bank.service.FuncionarioService;
import java.util.Map;

public class FuncionarioServiceImpl implements FuncionarioService {
    private FuncionarioDAO funcionarioDAO = new FuncionarioDAOImpl();

    @Override
    public void add(Funcionario funcionario) {
       funcionarioDAO.add(funcionario);
    }

    @Override
    public boolean contem(String contem) {
    return funcionarioDAO.contem(contem);
    }

    @Override
    public boolean update(Funcionario update) {
      return funcionarioDAO.update(update);
    }

    @Override
    public void delete(Funcionario delete) {
      funcionarioDAO.delete(delete);
    }

    @Override
    public Funcionario get(String funcionario){
      return funcionarioDAO.get(funcionario);
    }

    @Override
    public Map<String, Funcionario> getAll() {
      return funcionarioDAO.getAll();
    }
}
