package bank.repository.impl;

import bank.models.Cliente;
import bank.repository.ClienteDAO;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
    private List<Cliente> dataBase = new ArrayList<>();

    @Override
    public void inserir(Cliente cliente) {
        dataBase.add(cliente);
    }

    @Override
    public Cliente get(String cpfcnpj) {
        for (Cliente cliente : dataBase){
            if (cliente.getCpfCnpj().equalsIgnoreCase(cpfcnpj)){
                return cliente;
            }
        }
        return null;
    }

    @Override
    public String getAll() {
        return dataBase.toString();
    }


    @Override
    public void delete(Cliente cliente) {
        dataBase.remove(cliente);
    }

    @Override
    public boolean contem(Cliente x) {
        for (Cliente cliente : dataBase) {
            if (cliente.equals(x)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(Cliente update) {
        for (int i = 0; i < dataBase.size(); i++) {
            Cliente currentItem = dataBase.get(i);

            if (currentItem.getCpfCnpj() == update.getCpfCnpj()) {
                dataBase.set(i, update);
                return true;
            }
        }
        return false;
    }


    public enum tipoDeConta {
        CPF, CNPJ;
    }

    @Override
    public void infoDaConta (Cliente cliente){
        if (cliente.getCpfCnpj().length()==5){
        tipoDeConta tipoDeConta = ClienteDAOImpl.tipoDeConta.CNPJ;
        System.out.println("A conta é: "+ cliente.getName() + "é do tipo" + tipoDeConta);
    }else System.out.println("A conta de "+cliente.getName() + " é do tipo " + ClienteDAOImpl.tipoDeConta.CPF);
    }


}
