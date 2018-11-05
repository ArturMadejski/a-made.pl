package pl.art.amadepl.exception;

public class BaseMessageSearchException extends Exception {

    public BaseMessageSearchException(String message) {
        super(message);
    }

    public BaseMessageSearchException(Throwable cause) {
        super(cause);
    }
}
