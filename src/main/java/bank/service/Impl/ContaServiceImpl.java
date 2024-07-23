package bank.service.Impl;

import bank.models.Conta;
import bank.repository.ContaDAO;
import bank.repository.impl.ContaDAOImpl;
import bank.service.ClienteService;
import bank.service.ContaService;

// TODO fazer uma validacao para apenas permitir inserir contas que tenham clientes existentes

public class ContaServiceImpl implements ContaService {

	private ContaDAO contaDAO = new ContaDAOImpl();
	private ClienteService clienteService = new ClienteServiceImpl();

	@Override
	public void add(Conta conta) {
		if (clienteService.contem(conta.getCpfCnpj())) {
			contaDAO.add(conta);
		} else {
			System.out.println("Não foi possível adicionar esta conta");
		}
	}

	@Override
	public Conta get(String numeroConta) {
		return contaDAO.get(numeroConta);
	}

	@Override
	public void update(Conta contaAtualizada) {
		contaDAO.update(contaAtualizada);
	}

	// private boolean posicaoOcupada(int posicao) {
	// return contaDAO.
	// }

	// [0] = Lucas, [1] = Antonio, [2] = Rodrigo, [3] = null, totalDeClientes = 3
	// [0] = Lucas, [1] = Rodrigo, [2] = null , totalDeClientes = 2

	@Override
	public void delete(Conta conta) {
		contaDAO.delete(conta);
	}

	@Override
	public boolean contem(String numeroConta) {
		return contaDAO.contem(numeroConta);
	}

	@Override
	public Conta[] getAll() {
		return contaDAO.getAll();
	}

}
