package bank.repository;

import bank.models.Conta;

public interface ContaDAO {
    public void atualiza(int posicao, Conta contaAtualizada);
    public void remove(int posicao);
    public Conta pega(int posicao);
    public void adiciona(Conta contas);
    public boolean contem(Conta contas);
    public Conta[] getAll();

}
