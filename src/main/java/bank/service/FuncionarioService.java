package bank.service;

import bank.models.Funcionario;

import java.util.Map;

public interface FuncionarioService {
    public void add(Funcionario funcionario);
    public boolean contem(String contem);
    public boolean update(Funcionario update);
    public void delete(Funcionario delete);
    public String toString();
    public Funcionario get(String funcionario);
    public void infoDaConta (Funcionario funcionario);
    public Map<String, Funcionario> getAll();


}
