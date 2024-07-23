package bank.service;

import bank.models.Conta;

public interface ContaService {
    public void add(Conta contas);
    public boolean contem(String numeroConta);
    public void update(Conta contaAtualizada);
    public void delete(Conta conta);
    public Conta[] getAll();
    public Conta get(String numeroConta);
}
