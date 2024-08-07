/* package bank.study;

import bank.models.Cliente;
import bank.repository.ClienteDAO;
import bank.repository.impl.ClienteDAOImpl;
import bank.util.TipoDeCliente;


public class RepositoryCliente {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAOImpl();
        Cliente a1 = new Cliente();
        a1.setCpfCnpj("123");
        a1.setName("Lucas");
        Cliente a2 = new Cliente();
        a2.setCpfCnpj("456");
        a2.setName("Luis");
        clienteDAO.add(a1);
        clienteDAO.add(a2);
        System.out.println(clienteDAO.getAll());

        //acredito que não deveria funcionar assim
        System.out.println(clienteDAO.get("123").getName());

        ClienteDAO dataBase = new ClienteDAOImpl();

        System.out.println(dataBase.get("456").getName());
    }






} */
