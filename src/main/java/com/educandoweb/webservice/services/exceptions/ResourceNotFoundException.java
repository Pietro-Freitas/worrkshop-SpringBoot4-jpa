package com.educandoweb.webservice.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    
    public ResourceNotFoundException(Object id){
        super("Resource not find. Id " + id); 
    }
}
