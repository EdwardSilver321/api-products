package com.comercio.electronico.api.products.adapters.in.controller.mapper;

import org.mapstruct.Mapper;

import com.comercio.electronico.api.products.adapters.in.controller.response.PricesResponse;
import com.comercio.electronico.api.products.application.core.domain.Prices;

/**
 * Interfaz que define los métodos para mapear objetos de tipo Prices a PricesResponse.
 */
@Mapper(componentModel = "spring")
public interface PricesMapper {

    /**
     * Convierte un objeto Prices en un objeto PricesResponse.
     *
     * @param prices El objeto Prices que se va a convertir.
     * @return El objeto PricesResponse resultante.
     */
    PricesResponse toPricesResponse(Prices prices);
}
