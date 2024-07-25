package bank.study;

import java.util.Scanner;

import bank.controller.ClienteController;
import bank.controller.ContaController;
import bank.dto.ContaRequestDTO;
import bank.models.Cliente;
import bank.models.Conta;


public class TesteContaDTO {

	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       
	       ContaController contaController = new ContaController();
	       
	       ClienteController clienteController = new ClienteController();
	       
	       Cliente cliente = new Cliente();
	       
	       cliente.setCpfCnpj("123");
	       cliente.setName("antonio");
	       
	       clienteController.add(cliente);
	       
	       
	       System.out.println("START");
	       System.out.println("Digite o numero da conta:");
	       String numeroConta = scanner.next();
	       System.out.println("Digite o cpf da conta:");
	       String cpfCnpj = scanner.next();
	       System.out.println("Digite o saldo da conta:");
	       double saldo = scanner.nextDouble();
	       
	       ContaRequestDTO contaDTO = new ContaRequestDTO(numeroConta, cpfCnpj, saldo);
	       contaController.add(contaDTO);
	       System.out.println("Conta para fazer get");
	       String numeroContaGet = scanner.next();
	       
	       Conta contaGet = contaController.get(numeroContaGet);
	       System.out.println(contaGet.getTipoConta());

	}

}
