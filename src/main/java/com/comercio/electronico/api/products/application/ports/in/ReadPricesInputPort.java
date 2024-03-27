package com.comercio.electronico.api.products.application.ports.in;

import java.util.Date;
import java.util.List;

import com.comercio.electronico.api.products.application.core.domain.Prices;

/**
 * Puerto de entrada para consultar precios.
 * Permite recuperar una lista de precios para un producto y una cadena en una fecha específica.
 */
public interface ReadPricesInputPort {

    /**
     * Consulta los precios para un producto y una cadena en una fecha específica.
     * @param date La fecha específica para la cual se desean los precios.
     * @param productId El ID del producto para el cual se desean los precios.
     * @param brandId El ID de la cadena para la cual se desean los precios.
     * @return Una lista de precios para el producto y la marca dentro de la fecha específicada.
     */
    List<Prices> read(Date date, int productId, int brandId);
}
