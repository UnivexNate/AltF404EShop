package com.example.catalogue.exception;

public class ProduitInvalideException extends RuntimeException {
    public ProduitInvalideException(String message) {
        super(message);
    }
}
