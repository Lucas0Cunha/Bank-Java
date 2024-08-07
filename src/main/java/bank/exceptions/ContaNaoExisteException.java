package bank.exceptions;

public class ContaNaoExisteException extends RuntimeException{
    public ContaNaoExisteException(String message) {
        super(message);
    }
}
