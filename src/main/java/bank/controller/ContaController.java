package bank.controller;

import bank.models.Conta;
import bank.service.ContaService;
import bank.service.Impl.ContaServiceImpl;

public class ContaController {
    ContaService contaService = new ContaServiceImpl();

    public void add(Conta contas){
        contaService.add(contas);
    }
    public boolean contem(Conta conta){
        return contaService.contem(conta);
    }
    public void update(Conta conta, Conta contaAtualizada){
        contaService.update(conta,contaAtualizada);
    }
    public void delete(Conta conta){
        contaService.delete(conta);
    }

    public Conta[] getAll(){
        return contaService.getAll();
    }
    public Conta get(Conta conta){
        return contaService.get(conta);
    }

}
