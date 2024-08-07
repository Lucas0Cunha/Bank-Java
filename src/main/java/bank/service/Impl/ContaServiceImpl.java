package bank.service.Impl;

import bank.constantstexts.ConstantsConta;
import bank.dto.ContaRequestDTO;
import bank.exceptions.ClienteNaoExisteException;
import bank.models.Conta;
import bank.models.ContaCredito;
import bank.models.ContaPoupanca;
import bank.models.ContaSalario;
import bank.repository.ContaDAO;
import bank.repository.impl.ContaDAOImpl;
import bank.service.ClienteService;
import bank.service.ContaService;

public class ContaServiceImpl implements ContaService {


	private ContaDAO contaDAO = new ContaDAOImpl();
	private ClienteService clienteService = new ClienteServiceImpl();

	//TODO padrão SINGLETON, serve para que essa classe seja instanciada uma vez apenas em toda classe,
	// dando um acesso global em toda classe sem criar novas instancias
	//Ainda preciso que me explique oq fiz



	/**
	 * Este metodo serve para adicionar algum objeto criado.
	 * Regra de negocio: Apenas permite dar um add em objeto conta se ele existir,
	 * @param conta
	 * @throws ClienteNaoExisteException
	 */
	@Override
	//o uso do throws funciona como um aviso ao dev que esse metodo pode vir a lançar um erro, apenas isso.
	public void add(Conta conta) throws ClienteNaoExisteException {
		if (clienteService.contem(conta.getCpfCnpj())) {
			contaDAO.add(conta);
		} else {
			//throw new funciona bascimente para quando for "instanciar" uma classe que representa algum tipo de erro.
			throw new ClienteNaoExisteException(ConstantsConta.inexiste);

		}
	}

	/**
	 * Este metodo serve para puxar as informações do objeto
	 * @param numeroConta
	 * @return
	 */
	@Override
	public Conta get(String numeroConta) {
		return contaDAO.get(numeroConta);
	}

	/**
	 * Este metodo serve para atualizar algum dado já existente
	 * Regra de negocio: Apenas permite que se atualize se o objeto existir atraves do uso do metodo contem
	 * @param contaAtualizada
	 * @throws IllegalArgumentException
	 */
	@Override
	public void update(Conta contaAtualizada) throws IllegalArgumentException{
		if (contaDAO.contem(contaAtualizada.getCpfCnpj())) {
			contaDAO.update(contaAtualizada);
		} else {
			throw new IllegalArgumentException(ConstantsConta.NOT_FOUND);
		}

	}

	// private boolean posicaoOcupada(int posicao) {
	// return contaDAO.
	// }

	// [0] = Lucas, [1] = Antonio, [2] = Rodrigo, [3] = null, totalDeClientes = 3
	// [0] = Lucas, [1] = Rodrigo, [2] = null , totalDeClientes = 2

	/**
	 * Este metodo serve para deletar algum dado ja inserido
	 * Metodo delete que possui regra de negocio para permitir o delete apenas se o objeto existir atraves do uso do contem
	 * @param conta
	 * @throws IllegalArgumentException
	 */
	@Override
	public void delete(Conta conta) throws IllegalArgumentException{
		if (contaDAO.contem(conta.getCpfCnpj())) {
			contaDAO.delete(conta);
		} else {
			throw new IllegalArgumentException(ConstantsConta.NOT_FOUND);
		}
	}

	/**
	 * Este metodo verifica se o valor desejado por parametro existe.
	 * @param numeroConta
	 * @return
	 */
	@Override
	public boolean contem(String numeroConta) {
		return contaDAO.contem(numeroConta);
	}

	/**
	 * Metodo que puxa todas informações da lista.
	 * @return
	 */
	@Override
	public Conta[] getAll() {
		return contaDAO.getAll();
	}


	//metodo de add para inclusao do factory
	// TODO revisar toda essa parte
	@Override
	public void add(ContaRequestDTO contaDTO) {
		Conta c = this.contaFactory(contaDTO);
		this.add(c);
	}

	//Factory dos diferentes objetos retornaveis

	/**
	 * metodo Factory para devolver diferentes objetos atraves de um contaDTO
	 * @param contaDTO
	 * @return
	 */
	private Conta contaFactory(ContaRequestDTO contaDTO) {
		if(contaDTO.saldo() > 200) {
			return new ContaSalario(contaDTO.numeroConta(), contaDTO.cpfCnpj(), contaDTO.saldo());
		}else if(contaDTO.saldo() > 100) {
			return new ContaPoupanca(contaDTO.numeroConta(), contaDTO.cpfCnpj(), contaDTO.saldo());
		}else if(contaDTO.saldo() == 0) {
			return new ContaCredito(contaDTO.numeroConta(), contaDTO.cpfCnpj());
		}
		return null;
	}

	/**
	 * metodo para definir o limite do cartão pelo saldo
	 * @param saldo
	 * @return
	 */
	@Override
	public double limiteget(double saldo) {
		double result;
		if (saldo > 1000) {

			result = saldo * 0.50;
		} else if (saldo > 750) {

			result = saldo * 0.60;
		} else if (saldo > 500) {

			result = saldo * 0.75;
		} else if (saldo > 250) {

			result = saldo * 0.85;
		} else {

			result = saldo;
		}

		return result;
	}

	/**
	 * metodo que retorna o saldo
	 * @return
	 */
	@Override
	public double getSaldo() {
		return getSaldo();
	}


}
