package bank.service;

import bank.models.Cliente;


// este facotry tem a ideia de facilitar no futuro a criação de novos tipo de clientes, sem precisar ficar criando uma classe distinta para cada um deles
// basta eu mudar no meu pacote factory oq os novos tipos de clientes precisarão e adicionar o metodo aqui
public interface ClienteFactoryNull {
    Cliente createCliente(String email, String name, String cpfCnpj);
}
