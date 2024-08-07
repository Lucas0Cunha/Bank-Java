package bank.exceptions;

public class ContaJaExisteException extends RuntimeException{
    public ContaJaExisteException(String message) {
        super(message);
    }
}
