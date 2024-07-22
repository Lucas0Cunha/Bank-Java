package bank.repository;

import bank.models.Funcionario;

import java.util.Map;

public interface FuncionarioDAO extends GenericsInterface<Funcionario, String>{

    public Map<String, Funcionario> getAll();

}


