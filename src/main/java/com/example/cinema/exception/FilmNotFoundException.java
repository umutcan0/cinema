package com.example.cinema.exception;

public class FilmNotFoundException extends NotFoundException{

    public FilmNotFoundException(String messageName,Long id){
        super("filmNotFoundException", new Object[]{messageName,id});
    }
}
