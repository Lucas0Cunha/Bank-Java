package bank.study2;

import java.util.ArrayList;
import java.util.List;

public class RepositoryCliente {


    private List<Cliente> dataBase = new ArrayList<>();




    public void adicionaArray(Cliente cliente) {
        dataBase.add(cliente);
    }

    public Cliente pega(int posicao) {

        return dataBase.get(posicao);
    }

    public void remove(int posicao) {

        dataBase.remove(posicao);

    }



    public int tamanho() {
        return dataBase.size();
    }

    public boolean contem(Cliente o) {
        return false;
    }

    @Override
    public String toString () {
        StringBuilder listaCliente = new StringBuilder();
        dataBase.forEach(cliente -> {
            listaCliente.append("Nome: ").append(cliente.getNome()).append(" Cpf: ").append(cliente.getCpfcnpj()).append("\n");
        });
       return listaCliente.toString();
    }
}
