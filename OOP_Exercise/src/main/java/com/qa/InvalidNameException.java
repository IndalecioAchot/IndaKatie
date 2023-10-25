package com.qa;

public class InvalidNameException extends Exception {
    public InvalidNameException() {
        super("Name does not start with a capital letter");
    }

    public InvalidNameException(String customMessage) {
        super(customMessage);
    }
}
