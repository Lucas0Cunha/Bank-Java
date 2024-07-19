package bank.repository;

import bank.models.Funcionario;

import java.util.Map;

public interface FuncionarioDAO extends GenericsInterface<Funcionario, String>{

    public Map<String, Funcionario> getAll();

    public void infoDaConta (Funcionario funcionario);


}


