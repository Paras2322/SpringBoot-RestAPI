package com.RestAPI.exception;

public class NoEmployeesFoundException extends RuntimeException {
    public NoEmployeesFoundException(String message) {
        super(message);
    }

    public NoEmployeesFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
