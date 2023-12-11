package com.example.cinema.exception;

public class NotFoundException extends RuntimeException{

    private final Object[] args;

    private final String messageName;

    public NotFoundException(String messageName, Object[] args) {
        super(messageName);
        this.messageName = messageName;
        this.args = args;
    }

    public Object[] getArgs() {
        return args;
    }

    public String getMessageName() {
        return messageName;
    }
}
