package bank.exceptions;

public class ClienteJaExisteException extends RuntimeException{
    public ClienteJaExisteException(String message) {
        super(message);
    }
}
