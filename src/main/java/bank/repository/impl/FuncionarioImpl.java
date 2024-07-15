package bank.repository.impl;

import bank.models.Funcionario;
import bank.repository.FuncionarioDAOImpl;

import java.util.HashMap;
import java.util.Map;

public class FuncionarioImpl implements FuncionarioDAOImpl {
    Map<String, Funcionario> funcionarios = new HashMap<>();

    @Override
    public void adiciona(Funcionario funcionario) {
        funcionarios.put(funcionario.getCpfCnpj(), funcionario);
    }

    @Override
    public boolean contem(String cpfcnpj) {
        return funcionarios.containsKey(cpfcnpj);
    }

    @Override
    public boolean atualiza(String cpfcnpj, Funcionario funcionarioNovo) {
        if (funcionarios.containsKey(cpfcnpj)) {
            funcionarios.put(cpfcnpj, funcionarioNovo);
            return true;
        }
        return false;
    }

    @Override
    public void remove(String cpfcnpj) {
    funcionarios.remove(cpfcnpj);
    }

    @Override
    public String toString() {
        StringBuilder listaClienteHash = new StringBuilder();
        for (Funcionario funcionario : funcionarios.values()) {
            listaClienteHash.append("Nome: ").append(funcionario.getName()).append(" Cpf:").append(funcionario.getCpfCnpj()).append("\n");
        }

        for (Map.Entry<String, Funcionario> entry : funcionarios.entrySet()) {
            listaClienteHash.append("Nome: ").append(entry.getValue()).append(" Cpf:").append(entry.getKey()).append("\n");
        }
        return listaClienteHash.toString();
    }

    @Override
    public int tamanho() {
        return funcionarios.size();
    }

    // RESOLVER ERRO
    @Override
    public String toStringHash() {
        StringBuilder listaClienteHash = new StringBuilder();
        for (Funcionario funcionario : funcionarios.values()) {
            listaClienteHash.append("Nome: ").append(funcionario.getName()).append(" Cpf:").append(funcionario.getCpfCnpj()).append("\n");
        }

        for (Map.Entry<String, Funcionario> entry : funcionarios.entrySet()) {
            listaClienteHash.append("Nome: ").append(entry.getValue()).append(" Cpf:").append(entry.getKey()).append("\n");
        }
        return listaClienteHash.toString();

    }
        @Override
        public Funcionario pega(String cpfCnpj){
            return funcionarios.get(cpfCnpj);
        }











}
