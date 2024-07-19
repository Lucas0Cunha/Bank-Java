package bank.service;

import bank.models.Conta;

public interface ContaService {
    public void add(Conta contas);
    public Conta get(String conta);
    public void update(Conta conta, Conta contaAtualizada);
    public void delete(Conta conta);
    public boolean contem(String nome);
    public Conta[] getAll();
}
