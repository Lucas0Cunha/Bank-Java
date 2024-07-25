package bank.controller;

import bank.models.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

class ClienteControllerTest {

    @Test
    public void add() {

        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
        cliente.setCpfCnpj("12345");
        clienteController.add(cliente);


        assertNotNull(clienteController.get("12345"));

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

