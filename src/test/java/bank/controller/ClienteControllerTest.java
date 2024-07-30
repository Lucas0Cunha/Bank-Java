package bank.controller;

import bank.exceptions.ClienteNaoExisteException;
import bank.models.Cliente;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
//CORRECAO TOTAL OU METODO POR METODO
//DUVIDA, ALGUMAS COISAS ESTOU TRATANDO AQUI, DEVO JOGAR NOS METODOS PARA BLINDA-LOS...
public class ClienteControllerTest {

    @Test
    public void add() {

        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
        cliente.setCpfCnpj("12345");
        clienteController.add(cliente);


        assertNotNull(clienteController.get("12345"));

    }

    @Test(expected = IllegalArgumentException.class)
    public void addClienteNaoExisteException() {

        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
        cliente.setCpfCnpj("123456");
        clienteController.add(cliente);
        clienteController.add(cliente);
    }


    @Test(expected = IllegalArgumentException.class)
    public void addClienteNaoExisteExceptionTryCatch() {

        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
        cliente.setCpfCnpj("123456");
        clienteController.add(cliente);
        clienteController.add(cliente);
        }

    @Test
    public void getAll() {
        ClienteController clienteController = new ClienteController();

        Cliente cliente = new Cliente();
      /*  cliente.setCpfCnpj("123");
        cliente.setName("Lucas");
        clienteController.add(cliente);*/
        //ME DEVOLVE O TIPO DE CLIENTE NULL COMO RESOLVER
        System.out.println(clienteController.getAll());
    }

    //NAO PRECISO COLOCAR UM EXPECTED PQ...
    @Test
    public void GetAllNaoExisteClientes() {
        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
        System.out.println(clienteController.getAll());
    }



// COMO FAZER SE O Q DESEJA SER DELETADO NAO EXISTE
    /*
    @Test (expected = .class)
    public void deleteClienteNaoExiste() {
        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
        cliente.setCpfCnpj("123456");
        clienteController.add(cliente);
        clienteController.get("123456");
        clienteController.delete(cliente2);


    }*/


    @Test
    public void getNaoExisteCliente() {
        ClienteController clienteController = new ClienteController();
        try {
            clienteController.get("123456");
        } catch (ClienteNaoExisteException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void get() {
        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
      /*  cliente.setCpfCnpj("123456");
        cliente.setName("Lucas");
        clienteController.add(cliente);*/
        try {
            System.out.println(clienteController.get("123456"));
        } catch (ClienteNaoExisteException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void contem() {
        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
      /*  cliente.setCpfCnpj("123456");
        cliente.setName("Lucas");
        clienteController.add(cliente);*/
        System.out.println(clienteController.contem("123456"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void Naocontem() {
        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
       /* cliente.setCpfCnpj("123456");
        cliente.setName("Lucas");
        clienteController.add(cliente);*/
        try {
            clienteController.contem("1234567");
        } catch (ClienteNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }


    @Test
    public void update() {
        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
        cliente.setCpfCnpj("123456");
        cliente.setName("Lucas");
        //clienteController.add(cliente);
        cliente.setName("Roger");
        clienteController.update(cliente);
        System.out.println(clienteController.get("123456"));
    }

    @Test
    public void delete() {
        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
        cliente.setCpfCnpj("123456");

        clienteController.get("123456");
        clienteController.delete(cliente);

    }

    /*mesma coisa do delete
    @Test
    public void updateNaoExisteCliente() {
        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
        cliente.setCpfCnpj("123456");
        cliente.setName("Lucas");
        clienteController.add(cliente);
        cliente.setName("Roger");

        try {
            clienteController.update(cliente1);
        }catch ()
        System.out.println(clienteController.get("123456"));
    } */
}

