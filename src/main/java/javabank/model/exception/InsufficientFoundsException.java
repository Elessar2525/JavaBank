package javabank.model.exception;

public class InsufficientFoundsException extends RuntimeException {

    public InsufficientFoundsException(String message) {
        super(message);
    }
}
