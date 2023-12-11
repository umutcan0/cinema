package com.example.cinema.exception;

public class CommentNotFoundException extends NotFoundException{

    public CommentNotFoundException(String messageName,Long id){
        super("commentNotFoundException", new Object[]{messageName,id});
    }
}
