package bank.study2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public boolean contem(Cliente x) {
        for (Cliente cliente : dataBase) {
            if (cliente.equals(x)) {
                return true;
            }
        }
        return false;
    }

    public boolean update(Cliente update) {
        for (int i = 0; i < dataBase.size(); i++) {
            Cliente currentItem = dataBase.get(i);

            if (currentItem.getCpfcnpj() == update.cpfcnpj) {
                  dataBase.set(i, update);
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        StringBuilder listaCliente = new StringBuilder();
        dataBase.forEach(cliente -> {
            listaCliente.append("Nome: ").append(cliente.getNome()).append(" Cpf: ").append(cliente.getCpfcnpj()).append("\n");
        });
        return listaCliente.toString();
    }

    private Map<Integer, ClienteHash> dataBaseMap = new HashMap<>();

    public void adicionaHash(ClienteHash cliente) {
        dataBaseMap.put(cliente.getCpfcnpj(), cliente);
    }

    public String toStringHash() {
        StringBuilder listaClienteHash = new StringBuilder();
        for (ClienteHash cliente : dataBaseMap.values()) {
            listaClienteHash.append("Nome: ").append(cliente.getNome()).append(" Cpf:").append(cliente.getCpfcnpj()).append("\n");
        }

       /* for (Map.Entry<Integer, ClienteHash> entry : dataBaseMap.entrySet()) {
            listaClienteHash.append("Nome: ").append(entry.getValue()).append(" Cpf:").append(entry.getKey()).append("\n");
        }*/
        return listaClienteHash.toString();
    }

    public ClienteHash pegaHash(Integer cpfcnpj) {
        return dataBaseMap.get(cpfcnpj);
    }

    public void removeHash(Integer cpfcnpj) {

        dataBaseMap.remove(cpfcnpj);
    }

    public int tamanhoHash() {
        return dataBaseMap.size();
    }

    public boolean contemHash(Integer cpfcnpj) {
        return dataBaseMap.containsKey(cpfcnpj);
    }

    public boolean atualizaHashMap(Integer cpfcnpj, ClienteHash novoCliente) {
        if (dataBaseMap.containsKey(cpfcnpj)) {
            dataBaseMap.put(cpfcnpj, novoCliente);
            return true;
        }
        return false;
    }


}