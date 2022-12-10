package ir.mohammadi.exceptions;

public class CantFindSubService extends RuntimeException {
    public CantFindSubService(String message) {
        super(message);
    }
}
