package br.com.exception;

public class NumeroInvalidoException extends RuntimeException {
    public NumeroInvalidoException(String message) {
        super(message);
    }
}
