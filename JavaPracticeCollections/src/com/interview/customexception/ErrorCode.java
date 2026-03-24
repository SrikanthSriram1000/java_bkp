package com.interview.customexception;

public enum ErrorCode {
	INVALID_INPUT(1001, "Invalid input"),
    RESOURCE_NOT_FOUND(1002, "Resource not found"),
    PERMISSION_DENIED(1003, "Permission denied");

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
