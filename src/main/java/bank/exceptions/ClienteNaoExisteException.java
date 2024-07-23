package bank.exceptions;


//criada classe por boas praticas, facilitando o entendimento para proximos dev's, poderia até ter utilizado o runtimeException diretamente nas
//classes ContaServiceImpl dentro do metodo de add e a mesma coisa no TesteCliente dentro do catch.
public class ClienteNaoExisteException extends RuntimeException{
    public ClienteNaoExisteException(String message) {
        super(message);
    }
}
