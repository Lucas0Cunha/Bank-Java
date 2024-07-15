package bank.repository;

import bank.models.Funcionario;

public interface FuncionarioDAOImpl {
    //Fazer com HashMap
    public void adiciona(Funcionario funcionario);
    public boolean contem(String cpfcnpj);
    public boolean atualiza(String cpfcnpj, Funcionario funcionarioNovo);
    public void remove(String cpfcnpj);
    public int tamanho();
    public String toStringHash();
    Funcionario pega(String cpfCnpj);
}

//tentar aplicar Enum
