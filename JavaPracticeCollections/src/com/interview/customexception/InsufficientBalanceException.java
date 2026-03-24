package com.interview.customexception;
public class InsufficientBalanceException  extends RuntimeException {

    private static final long serialVersionUID = 016546L;

    private final ErrorCode	code;

    public InsufficientBalanceException(ErrorCode code) {
        super();
        this.code = code;
    }

    public InsufficientBalanceException(String message, Throwable cause, ErrorCode code) {
        super(message, cause);
        this.code = code;
    }

    public InsufficientBalanceException(String message, ErrorCode code) {
        super(message);
        this.code = code;
    }

    public InsufficientBalanceException(Throwable cause, ErrorCode code) {
        super(cause);
        this.code = code;
    }

    public ErrorCode getCode() {
        return this.code;
    }
}