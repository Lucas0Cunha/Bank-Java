package bank.service.Impl;

import bank.exceptions.ClienteNaoExisteException;
import bank.models.Conta;
import bank.repository.ContaDAO;
import bank.repository.impl.ContaDAOImpl;
import bank.service.ClienteService;
import bank.service.ContaService;

public class ContaServiceImpl implements ContaService {

	private ContaDAO contaDAO = new ContaDAOImpl();
	private ClienteService clienteService = new ClienteServiceImpl();

	/**
	 *
	 * @param conta
	 * @throws ClienteNaoExisteException
	 */
	@Override
	//o uso do throws funciona como um aviso ao dev que esse metodo pode vir a lançar um erro, apenas isso.
	//TODO pedir para explicar novamente a regra de negocio desse add
	public void add(Conta conta) throws ClienteNaoExisteException {
		if (clienteService.contem(conta.getCpfCnpj())) {
			contaDAO.add(conta);
		} else {
			//throw new funciona bascimente para quando for "instanciar" uma classe que representa algum tipo de erro.
			throw new ClienteNaoExisteException("Não existe cliente para a conta: " + conta.getNumero());
		}
	}

	@Override
	public Conta get(String numeroConta) {
		return contaDAO.get(numeroConta);
	}

	@Override
	public void update(Conta contaAtualizada) throws IllegalArgumentException{
		if (contaDAO.contem(contaAtualizada.getCpfCnpj())) {
			contaDAO.update(contaAtualizada);
		} else {
			throw new IllegalArgumentException("Cliente não encontrado para atualização.");
		}

	}

	// private boolean posicaoOcupada(int posicao) {
	// return contaDAO.
	// }

	// [0] = Lucas, [1] = Antonio, [2] = Rodrigo, [3] = null, totalDeClientes = 3
	// [0] = Lucas, [1] = Rodrigo, [2] = null , totalDeClientes = 2

	@Override
	public void delete(Conta conta) throws IllegalArgumentException{
		if (contaDAO.contem(conta.getCpfCnpj())) {
			contaDAO.delete(conta);
		} else {
			throw new IllegalArgumentException("Cliente não encontrado para exclusão.");
		}
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
