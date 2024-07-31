package bank.exceptions;
//TODO PERGUNTA NOVAMENTE SOBRE OS TIPOS DE EXCEÇÕES
public class ClienteJaExisteException extends RuntimeException{
    public ClienteJaExisteException(String message) {
        super(message);
    }
}
