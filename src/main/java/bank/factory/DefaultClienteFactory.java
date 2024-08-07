package bank.factory;

import bank.models.Cliente;

public class DefaultClienteFactory implements ClienteFactory {


    // este facotry tem a ideia de facilitar no futuro a criação de novos tipo de clientes, sem precisar ficar criando uma classe distinta para cada um deles
    // basta eu mudar no meu pacote factory oq os novos tipos de clientes precisarão e adicionar o metodo aqui
    @Override
    public Cliente createCliente(String email, String name, String cpfCnpj) {
        return new Cliente(email,name,cpfCnpj);
    }
}
