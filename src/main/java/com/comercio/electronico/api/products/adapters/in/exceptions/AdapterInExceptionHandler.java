package com.comercio.electronico.api.products.adapters.in.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.comercio.electronico.api.products.application.core.domain.exception.NoPricesFoundException;

/**
 * Clase que maneja excepciones específicas de la capa de adaptadores de entrada.
 */
@ControllerAdvice
public class AdapterInExceptionHandler {

    /**
     * Maneja la excepción {@code NoPricesFoundException}.
     * Devuelve una respuesta HTTP con el código de estado 404 (Not Found) y un encabezado personalizado que contiene el mensaje de error de la excepción.
     *
     * @param ex La excepción {@code NoPricesFoundException} lanzada.
     * @return Una respuesta HTTP con el código de estado 404 (Not Found) y un encabezado personalizado que contiene el mensaje de error de la excepción.
     */
    @ExceptionHandler(NoPricesFoundException.class)
    @ResponseBody
    public ResponseEntity<String> handleMyCustomException(NoPricesFoundException ex) {
        return ResponseEntity.notFound().header("X-Error-Message", ex.getMessage()).build();
    }
}
