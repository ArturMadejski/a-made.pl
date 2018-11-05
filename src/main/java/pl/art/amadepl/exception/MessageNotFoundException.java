package pl.art.amadepl.exception;

public class MessageNotFoundException extends BaseMessageSearchException {
    public MessageNotFoundException(String message) {
        super("There is not found message with this id, try again :)");
    }

    public MessageNotFoundException(Throwable cause) {
        super(cause);
    }
}
