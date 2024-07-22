package bank.service;

import bank.models.Conta;

public interface ContaService {
    public void add(Conta contas);
    public boolean contem(Conta conta);
    public void update(Conta conta, Conta contaAtualizada);
    public void delete(Conta conta);

    public Conta[] getAll();
    public Conta get(Conta conta);
}
