package bank.controller;

import bank.dto.ContaRequestDTO;
import bank.models.Conta;
import bank.repository.impl.ContaDAOImpl;
import bank.service.ContaService;
import bank.service.Impl.ContaServiceImpl;

public class ContaController {
	private ContaService contaService = new ContaServiceImpl();


	public void add(Conta contas) {
		contaService.add(contas);
	}
	
	public void add(ContaRequestDTO contaDTO) {
		contaService.add(contaDTO);
	}

	public boolean contem(String numeroConta) {
		return contaService.contem(numeroConta);
	}

	public void update(Conta contaAtualizada) {
		contaService.update(contaAtualizada);
	}

	public void delete(Conta conta) {
		contaService.delete(conta);
	}

	public Conta[] getAll() {
		return contaService.getAll();
	}

	public Conta get(String numeroConta) {
		return contaService.get(numeroConta);
	}

	public double calcularLimite(double saldo) {
		return ContaDAOImpl.getInstance().limiteget(saldo);
	}

	public double getSaldo(String numeroConta) {
		return getSaldo(numeroConta);
	}



}
