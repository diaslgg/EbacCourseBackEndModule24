package br.com.diaslgg.exceptions;

public class DataAccessException extends RuntimeException{

    public DataAccessException () {
        super("Cannot finish the operation. Database inaccessible.");
    }
}
