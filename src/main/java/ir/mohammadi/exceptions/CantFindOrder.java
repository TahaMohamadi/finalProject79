package ir.mohammadi.exceptions;

public class CantFindOrder extends RuntimeException{
    public CantFindOrder(String message) {
        super(message);
    }
}
