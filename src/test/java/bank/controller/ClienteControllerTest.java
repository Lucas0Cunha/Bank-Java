package bank.controller;

import bank.models.Cliente;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;


public class ClienteControllerTest {

    @Test
    public void add() {

        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
        cliente.setCpfCnpj("12345");
        clienteController.add(cliente);


        assertNotNull(clienteController.get("12345"));

    }

    @Test (expected = IllegalArgumentException.class)
    public void addClienteNaoExisteException() {

        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
        cliente.setCpfCnpj("123456");
        clienteController.add(cliente);
        clienteController.add(cliente);
    }


    @Test
    public void addClienteNaoExisteExceptionTryCatch() {

        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
        cliente.setCpfCnpj("123456");
        clienteController.add(cliente);

        try {
            clienteController.add(cliente);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }



    }
/*
    @Test
    public void getAll() {
    }

    @Test
    public void get() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void contem() {
    }

    @Test
    public void update() {
    } */
}

