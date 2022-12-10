package ir.mohammadi.exceptions;

public class CantCreateOrder extends RuntimeException{
    public CantCreateOrder(String message) {
        super(message);
    }
}
