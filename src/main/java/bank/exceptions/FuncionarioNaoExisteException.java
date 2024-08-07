package bank.exceptions;

public class FuncionarioNaoExisteException extends RuntimeException{
    public FuncionarioNaoExisteException(String message) {
        super(message);
    }
}
