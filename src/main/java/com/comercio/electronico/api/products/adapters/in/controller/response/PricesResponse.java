package com.comercio.electronico.api.products.adapters.in.controller.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que representa la respuesta de los precios de un producto.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PricesResponse {

    /**
     * Identificador de la cadena.
     */
    private int brandId;

    /**
     * Fecha de inicio de la vigencia del precio.
     */
    private Date startDate;

    /**
     * Fecha de fin de la vigencia del precio.
     */
    private Date endDate;

    /**
     * Tarifa a aplicada.
     */
    private short priceList;

    /**
     * Identificador del producto.
     */
    private int productId;

    /**
     * Precio del producto.
     */
    private double price;
}
