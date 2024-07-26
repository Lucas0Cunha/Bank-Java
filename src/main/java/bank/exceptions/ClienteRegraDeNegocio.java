package bank.exceptions;

public class ClienteRegraDeNegocio extends IllegalArgumentException{
    public ClienteRegraDeNegocio(String back) {
        super(back);
    }
}
