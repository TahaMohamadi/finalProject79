package ir.mohammadi.exceptions;

public class ServiceIsExist extends RuntimeException{
    public ServiceIsExist(String message) {
        super(message);
    }
}
