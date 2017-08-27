package com.xdq.exceptions;

/**
 * Created by xu_do on 2017/8/16.
 */
public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
