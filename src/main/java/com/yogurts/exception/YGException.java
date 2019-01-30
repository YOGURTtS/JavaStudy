package com.yogurts.exception;

public class YGException extends Exception {

    public YGException() {
    }

    public YGException(String message) {
        super(message);
    }

    public YGException(String message, Throwable cause) {
        super(message, cause);
    }

    public YGException(Throwable cause) {
        super(cause);
    }

    public YGException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static void main(String[] args) {

    }
}
