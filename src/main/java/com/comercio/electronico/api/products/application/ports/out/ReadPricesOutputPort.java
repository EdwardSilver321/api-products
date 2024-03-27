package com.comercio.electronico.api.products.application.ports.out;

import java.util.Date;
import java.util.List;

import com.comercio.electronico.api.products.application.core.domain.Prices;

/**
 * Puerto de salida para consultar precios.
 * Permite recuperar una lista de precios para un producto y una marca en una fecha específica.
 */
public interface ReadPricesOutputPort {

    /**
     * Consulta los precios para un producto y una marca en una fecha específica.
     * @param date La fecha específica para la cual se desean los precios.
     * @param productId El ID del producto para el cual se desean los precios.
     * @param brandId El ID de la marca para la cual se desean los precios.
     * @return Una lista de precios para el producto y la marca dentro de la fecha específicada.
     */
    List<Prices> read(Date date, int productId, int brandId);
}
