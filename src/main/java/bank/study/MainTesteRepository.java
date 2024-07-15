package bank.study;

import bank.models.Cliente;
import bank.models.Conta;
import bank.repository.ClienteDAO;
import bank.repository.ContaDAO;
import bank.repository.impl.ClienteDAOImpl;
import bank.repository.impl.ContaDAOImpl;

public class MainTesteRepository {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAOImpl();
        Cliente a1 = new Cliente();
        a1.setCpfCnpj("123");
        a1.setName("Lucas");
        Cliente a2 = new Cliente();
        a2.setCpfCnpj("456");
        a2.setName("Luis");
        clienteDAO.inserir(a1);
        clienteDAO.inserir(a2);

        ClienteDAO dataBase = new ClienteDAOImpl();
        //isso precisa funcionar como o anterior  //n sei se era essa a resolução esperada
        Cliente a3 = new Cliente();
        a3.setCpfCnpj("321");
        a3.setName("Sabrina");
        Cliente a4 = new Cliente();
        a4.setCpfCnpj("654");
        a4.setName("Luisa");
        dataBase.inserir(a3);
        dataBase.inserir(a4);
        System.out.println(dataBase.get("654").getName());
    }


        //NAO SEI RESOLVER, MUDEI A CONTA TIRANDO O ABSTRACT (CONCEITO NÃO PEGOU LEGAL COMIGO N SEI PQ)
        ContaDAO contaDAO = new ContaDAOImpl();
        Conta b1 = new Conta();
       //  b1.setCpfCnpj("789");



}
