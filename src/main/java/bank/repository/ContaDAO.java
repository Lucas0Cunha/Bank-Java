package bank.repository;

import bank.models.Conta;

public interface ContaDAO extends GenericsInterface<Conta,String>{

       public Conta[] getAll();

       public double limiteget(double saldo);
}
