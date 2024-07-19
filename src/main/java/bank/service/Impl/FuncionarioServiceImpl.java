package bank.service.Impl;

import bank.models.Funcionario;
import bank.repository.FuncionarioDAO;
import bank.repository.impl.FuncionarioDAOImpl;
import bank.service.FuncionarioService;

import java.util.HashMap;
import java.util.Map;

public class FuncionarioServiceImpl implements FuncionarioService {
    FuncionarioDAO funcionarioDAO = new FuncionarioDAOImpl();
    Map<String, Funcionario> funcionarios = new HashMap<>();

    @Override
    public void add(Funcionario funcionario) {
        funcionarios.put(funcionario.getCpfCnpj(), funcionario);
    }

    @Override
    public boolean contem(String contem) {
        for (Funcionario funcionario : funcionarios.values()) {
            if (funcionario.getCpfCnpj().equals(contem)) {
                return true;
            }
        }
        return false;}

    @Override
    public boolean update(Funcionario update) {
        if (this.contem(update.getCpfCnpj())){
            funcionarios.put(update.getCpfCnpj(), update);
            return true;
        }
        return false;
    }

    @Override
    public void delete(Funcionario delete) {
        funcionarios.remove(delete);
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
    public Funcionario get(String funcionario){
        return this.funcionarios.get(funcionario);
    }


    public enum tipoDeConta {
        CPF, CNPJ;
    }

    @Override
    public void infoDaConta (Funcionario funcionario){
        if (funcionario.getCpfCnpj().length()==5){
            FuncionarioDAOImpl.tipoDeConta tipoDeConta = FuncionarioDAOImpl.tipoDeConta.CNPJ;
            System.out.println("A conta é: "+ funcionario.getName() + "é do tipo" + tipoDeConta);
        }else System.out.println("A conta de "+funcionario.getName() + " é do tipo " + FuncionarioDAOImpl.tipoDeConta.CPF);
    }

    @Override
    public Map<String, Funcionario> getAll() {
        return this.funcionarios;
    }
}
