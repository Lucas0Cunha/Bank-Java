package bank.gui;

import bank.controller.ClienteController;
import bank.controller.ContaController;
import bank.exceptions.ClienteNaoExisteException;
import bank.models.Cliente;
import bank.models.Conta;
import bank.models.Contadebito;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setCpfCnpj("123");
        cliente.setName("Lucas");

        Conta conta1 = new Contadebito("2","123");
        Conta conta2 = new Contadebito("3","456");

        ClienteController clienteController = new ClienteController();
        clienteController.add(cliente);

        ContaController contaController = new ContaController();
        try {
            contaController.add(conta1);
            contaController.add(conta2);
        }catch (ClienteNaoExisteException e){
            System.out.println(e.getMessage());
        }catch (Exception e1){
            System.out.println("Erro genérico");

            //printStackTrace disserta mais sobre erro, dando um log de onde surgiu o erro e até onde ele vai.
        //    e1.printStackTrace();
        }
        finally {
            System.out.println("Fim do programa");
        }






    }
}
