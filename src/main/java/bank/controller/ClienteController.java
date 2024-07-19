package bank.controller;

import bank.models.Cliente;
import bank.service.ClienteService;
import bank.service.Impl.ClienteServiceImpl;

import java.util.List;

public class ClienteController {
    private ClienteService clienteService = new ClienteServiceImpl();

    public void add(Cliente cliente){
        clienteService.add(cliente);
    }
    public List<Cliente> getAll(){
        return clienteService.getAll();
    }

}
