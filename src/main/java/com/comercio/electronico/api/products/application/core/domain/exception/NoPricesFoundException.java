package com.comercio.electronico.api.products.application.core.domain.exception;

/**
 * Excepción lanzada cuando no se encuentran los precios consultados.
 */
@SuppressWarnings("serial")
public class NoPricesFoundException extends RuntimeException {

    /**
     * Constructor de la excepción con un mensaje descriptivo.
     * @param message El mensaje descriptivo de la excepción.
     */
    public NoPricesFoundException(String message) {
        super(message);
    }
}
