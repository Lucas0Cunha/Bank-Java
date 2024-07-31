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

import java.util.List;

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
        assertTrue(clienteController.contem("123456"));
    }

    @Test (expected = ClienteRegraDeNegocio.class)
    public void Naocontem() {
        ClienteController clienteController = new ClienteController();
        clienteController.contem("1234567");
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

    //TODO FIQUEI CONFUSO DO PQ É REGRA DE NEGOCIO PQ ELE N DEIXA USAR O ASSETNULL E FICA DE OLHO NO NOME
    @Test(expected = ClienteRegraDeNegocio.class)
    public void delete() {
        ClienteController clienteController = new ClienteController();
        Cliente c = new Cliente();
        c.setName("Lucas");
        c.setCpfCnpj("123456");
        clienteController.delete(c);
        Cliente cGet = clienteController.get("123456");
        //assertNull(cGet);
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

