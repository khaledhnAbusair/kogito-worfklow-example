package com.progressoft.abusair;

public class NullArgumentException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NullArgumentException(String argumentName) {
        super(argumentName + " cannot be null");
    }
}