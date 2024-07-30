package bank.controller;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import bank.exceptions.ClienteNaoExisteException;
import bank.exceptions.ClienteRegraDeNegocio;
import bank.models.Cliente;
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

    //TODO
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

    //TODO
    @Test
    public void getNaoExisteCliente() {
        ClienteController clienteController = new ClienteController();
        try {
            clienteController.get("123456");
        } catch (ClienteNaoExisteException e) {
            System.out.println(e.getMessage());
        }

    }

    //TODO
    @Test
    public void get() {
        ClienteController clienteController = new ClienteController();
        Cliente cliente = new Cliente();
      /*  cliente.setCpfCnpj("123456");
        cliente.setName("Lucas");
        clienteController.add(cliente);*/
        try {
            clienteController.get("123456");
        } catch (ClienteNaoExisteException e) { 
        	System.out.println(e.getMessage());
        }

    }

    @Test
    public void contem() {
        ClienteController clienteController = new ClienteController();
        assertTrue(clienteController.contem("123456"));
    }

    @Test
    public void Naocontem() {
        ClienteController clienteController = new ClienteController();
        assertFalse(clienteController.contem("1234567"));
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

    @Test
    public void delete() {
        ClienteController clienteController = new ClienteController();
        Cliente c = clienteController.get("123456");
        clienteController.delete(c);
        Cliente cGet = clienteController.get("123456");
        assertNull(cGet);
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

