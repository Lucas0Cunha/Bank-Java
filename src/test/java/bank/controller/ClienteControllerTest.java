package bank.controller;


import bank.exceptions.ClienteJaExisteException;
import bank.exceptions.ClienteNaoExisteException;
import org.junit.Test;



import bank.exceptions.ClienteRegraDeNegocio;
import bank.models.Cliente;

import java.util.List;

import static org.junit.Assert.*;


public class ClienteControllerTest {

    @Test
    public void add() {

        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
        cliente.setName("Lucas");
        cliente.setCpfCnpj("12345");
        clienteController.add(cliente);
       // assertNotNull(clienteController.get("12345"));
        Cliente clienteGet = clienteController.get("12345");
        assertNotNull(clienteGet);
        assertEquals(clienteGet.getName(),"Lucas");
        assertEquals(clienteGet.getCpfCnpj(),"12345");
    }

    @Test(expected = ClienteJaExisteException.class)
    public void addClienteJaExisteException() {

        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
        cliente.setCpfCnpj("123456");
        clienteController.add(cliente);
        clienteController.add(cliente);
    }


    @Test(expected = ClienteJaExisteException.class)
    public void addClienteJaExisteExceptionTryCatch() {

        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
        cliente.setCpfCnpj("123456");
        clienteController.add(cliente);
        clienteController.add(cliente);
    }

    //TODO
    @Test
    public void getAll() {
        ClienteController clienteController = new ClienteController();

        Cliente cliente = new Cliente();
        cliente.setCpfCnpj("123456");
        clienteController.add(cliente);
        List<?> result = clienteController.getAll();
        assertFalse(result.isEmpty());
    }

    //TODO feito


    @Test
    public void getNaoExisteCliente() {
        ClienteController clienteController = new ClienteController();
        List<?> result = clienteController.getAll();
        assertTrue(result.isEmpty());

    }


    //TODO feito

    @Test
    public void get() {
        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
        cliente.setCpfCnpj("123456");
        cliente.setName("Lucas");

        clienteController.add(cliente);
        clienteController.get("123456");



    }

    @Test
    public void contem() {
        ClienteController clienteController = new ClienteController();

        Cliente cliente = new Cliente();
        cliente.setCpfCnpj("123456");
        clienteController.add(cliente);
        assertTrue(clienteController.contem("123456"));
    }

    @Test
    public void Naocontem() {
        ClienteController clienteController = new ClienteController();
        assertFalse(clienteController.contem("123456"));
    }


    @Test
    public void update() {
        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
        cliente.setCpfCnpj("123456789");
        cliente.setName("Lucas");

        clienteController.add(cliente);
        Cliente clienteGet = clienteController.get("123456789");
        clienteGet.setName("Roger");
        assertTrue(clienteController.update(clienteGet));
    }

    //TODO FIQUEI CONFUSO DO PQ É REGRA DE NEGOCIO PQ ELE N DEIXA USAR O ASSERTNULL E FICA DE OLHO NO NOME
    @Test (expected = ClienteNaoExisteException.class)
    public void delete() {
        ClienteController clienteController = new ClienteController();

        Cliente c = new Cliente();
        c.setName("Lucas");
        c.setCpfCnpj("123456");
        clienteController.add(c);
        clienteController.delete(c);
        clienteController.get(c.getCpfCnpj());

       /* Cliente cGet=null;
        try {
            cGet = clienteController.get("123456");
        }catch (ClienteNaoExisteException e){
            assertNull(cGet);
        } */



    }

    @Test(expected = ClienteRegraDeNegocio.class)
    public void updateNaoExisteCliente() {
        ClienteController clienteController = new ClienteController();

        Cliente cliente = new Cliente();
        cliente.setCpfCnpj("12345679454165465");
        cliente.setName("Lucas");
        clienteController.update(cliente);
    }

}

//TODO ME AJUDAR COM O ASSERT EQUALS DE INFORMAÇÕES
