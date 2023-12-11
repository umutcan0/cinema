package com.example.cinema.exception;

public class UserNotFoundException extends NotFoundException{

    public UserNotFoundException(String messageName,Long id){
        super("userNotFoundException", new Object[]{messageName,id});
    }
}
