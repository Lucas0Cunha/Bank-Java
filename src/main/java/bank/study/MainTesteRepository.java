package bank.study;

import bank.models.Cliente;
import bank.repository.ClienteDAO;
import bank.repository.impl.ClienteDAOImpl;

public class MainTesteRepository {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAOImpl();
        Cliente a1 = new Cliente();
        a1.setCpf("123");
        a1.setName("Lucas");
        Cliente a2 = new Cliente();
        a2.setCpf("456");
        a2.setName("Luis");
        clienteDAO.inserir(a1);
        clienteDAO.inserir(a2);

        ClienteDAO dataBase = new ClienteDAOImpl();
        //isso precisa funcionar como o anterior
        System.out.println(dataBase.get("123").getName());
    }
}
