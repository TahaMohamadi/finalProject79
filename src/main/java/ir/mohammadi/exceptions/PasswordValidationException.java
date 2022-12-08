package ir.mohammadi.exceptions;

public class PasswordValidationException extends RuntimeException{
    public PasswordValidationException(String message) {
        super(message);
    }
}
