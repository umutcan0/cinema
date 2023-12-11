package com.example.cinema.exception;

public class CategoryNotFoundException extends NotFoundException{

    public CategoryNotFoundException(String messageName,Long id){
        super("categoryNotFoundException", new Object[]{messageName,id});
    }
}
