package pl.art.amadepl.exception;

public class MessageDBException extends BaseMessageSearchException {
    public MessageDBException(String message) {
        super("There is problem during retrieving info from DB");
    }

    public MessageDBException(Throwable cause) {
        super(cause);
    }
}
