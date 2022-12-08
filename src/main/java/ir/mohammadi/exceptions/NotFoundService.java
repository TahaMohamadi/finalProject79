package ir.mohammadi.exceptions;

public class NotFoundService extends RuntimeException{
    public NotFoundService(String message) {
        super(message);
    }
}
