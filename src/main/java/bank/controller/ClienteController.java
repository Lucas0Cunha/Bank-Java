package bank.controller;

import bank.models.Cliente;
import bank.service.ClienteService;
import bank.service.ContaService;
import bank.service.FuncionarioService;
import bank.service.Impl.ClienteServiceImpl;
import bank.service.Impl.ContaServiceImpl;
import bank.service.Impl.FuncionarioServiceImpl;

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
