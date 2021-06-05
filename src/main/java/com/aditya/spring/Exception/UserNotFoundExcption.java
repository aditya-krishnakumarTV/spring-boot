package com.aditya.spring.Exception;

public class UserNotFoundExcption extends RuntimeException{
    public UserNotFoundExcption(String message) {
        super(message);
    }
}
