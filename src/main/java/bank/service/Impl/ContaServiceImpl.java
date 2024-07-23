package bank.service.Impl;

import bank.models.Conta;
import bank.repository.ContaDAO;
import bank.repository.impl.ContaDAOImpl;
import bank.service.ContaService;


// TODO fazer uma validacao para apenas permitir inserir contas que tenham clientes existentes

public class ContaServiceImpl implements ContaService {
   ContaDAO contaDAO = new ContaDAOImpl();

    @Override
    public void add(Conta contas) {
        if (contas.getNumero().equalsIgnoreCase(String.valueOf(contaDAO.contem(contas.toString())))){
       contaDAO.add(contas);}
        else {
            System.out.println("Não foi possível adicionar esta conta"); ;
        }
    }

    //Alterar metodo para buscar o numero da conta
    @Override
    public Conta get(Conta conta) {

       return contaDAO.get(conta.toString());
    }



    @Override
    public void update(Conta conta, Conta contaAtualizada) {
      contaDAO.update(contaAtualizada);
    }


   // private boolean posicaoOcupada(int posicao) {
   //  return contaDAO.
   // }

    //[0] = Lucas, [1] = Antonio, [2] = Rodrigo, [3] = null, totalDeClientes = 3
    //[0] = Lucas, [1] = Rodrigo, [2] = null , totalDeClientes = 2



    @Override
    public void delete(Conta conta) {

        contaDAO.delete(conta);
    }

    @Override
    public boolean contem(Conta conta) {
     return contaDAO.contem(conta.toString());
    }



    @Override
    public Conta[] getAll()    {
       return contaDAO.getAll();
    }

}
