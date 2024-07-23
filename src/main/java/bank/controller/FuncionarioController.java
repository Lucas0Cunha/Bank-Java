package bank.controller;

import bank.models.Funcionario;
import bank.service.FuncionarioService;
import bank.service.Impl.FuncionarioServiceImpl;

import java.util.Map;

public class FuncionarioController {
    private FuncionarioService funcionarioService= new FuncionarioServiceImpl();


    public void add(Funcionario funcionario){
        funcionarioService.add(funcionario);
    }
    public boolean contem(String contem){
        return funcionarioService.contem(contem);
    }
    public boolean update(Funcionario update){
        return funcionarioService.update(update);
    }
    public void delete(Funcionario delete){
        funcionarioService.delete(delete);
    }

    public Funcionario get(String funcionario){
        return funcionarioService.get(funcionario);
    }
    public Map<String, Funcionario> getAll(){
        return funcionarioService.getAll();
    }

}
