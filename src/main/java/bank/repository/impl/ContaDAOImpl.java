package bank.repository.impl;
import bank.models.Conta;
import bank.repository.ContaDAO;

public class ContaDAOImpl implements ContaDAO {
    // PADRAO SINGLETON, FUNCIONARIA PARA MANTER A BASE DE DADOS UNICA (O MESMO USO DO STATIC NESSE CASO)
    //TODO ONDE EU VEJO A ALTERAÇÃO 
    private static ContaDAOImpl instance;

    private Conta[] contas = new Conta[50];
    private int totalDeContas =0;


    public static synchronized ContaDAOImpl getInstance() {
        if (instance == null) {
            instance = new ContaDAOImpl();
        }
        return instance;
    }

    @Override
    public void add(Conta contas) {
        this.garanteEspaco();
        this.contas[totalDeContas]= contas;
        //totalDeClientes = totalDeClientes + 1;
        totalDeContas++;
    }

//TODO APLICAR BINARY AND BUBBLE
    @Override
    public Conta get(String numeroConta) {

    	for (int i = 0; i < this.totalDeContas; i++) {
        	Conta contaIdx = this.contas[i];
            if (contaIdx.getNumero().equals(numeroConta)) {
                return contaIdx;
            }
        }
    	return null;
    }


    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeContas;
    }

    //[0] = Lucas, [1] = Antonio, [2] = Rodrigo, [3] = null, totalDeClientes = 3
    //[0] = Lucas, [1] = Rodrigo, [2] = null , totalDeClientes = 2

//Alterar metodo para buscar o numero da conta


    @Override
    public void delete(Conta conta) {

        if (conta.getId() < 0 || conta.getId() >= this.totalDeContas) {
            throw new IllegalArgumentException("Posição inválida: " + conta);
        }
        for(int i = conta.getId(); i < this.totalDeContas -1; i++) {
            this.contas[i] = this.contas[i + 1];
        }
        this.contas[this.totalDeContas - 1] = null;

        //totalDeClientes = totalDeClientes - 1;
        this.totalDeContas--;
    }

     @Override
     public boolean contem(String numeroConta) {
        if(contas != null) {
            for (int i = 0; i < totalDeContas; i++) {
            	Conta contaIdx = this.contas[i];
                if (contaIdx.getNumero().equals(numeroConta)) {
                    return true;
                }
            }
        }

        return false;
    }

    private void garanteEspaco() {
        if(totalDeContas == contas.length) {

            Conta[] novoArray = new Conta[contas.length*2];
            for(int i = 0; i < contas.length; i++) {
                novoArray[i] = contas[i];
            }
            this.contas = novoArray;
        }
    }

    @Override
    public Conta[] getAll()    {
    	return this.contas;
    }

	@Override
	public boolean update(Conta novaConta) {
		
		if(this.contem(novaConta.getNumero())) {
			
			for (int i = 0; i < this.totalDeContas; i++) {
            	Conta contaIdx = this.contas[i];
                if (contaIdx.getNumero().equals(novaConta.getNumero())) {
                	this.contas[i] = novaConta;
                    return true;
                }
            }
		}

        return false;
	}

}

