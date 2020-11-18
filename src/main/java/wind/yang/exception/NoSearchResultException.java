package wind.yang.exception;


public class NoSearchResultException extends RuntimeException {
    public NoSearchResultException() {
    }

    public NoSearchResultException(String message) {
        super(message);
    }
}

