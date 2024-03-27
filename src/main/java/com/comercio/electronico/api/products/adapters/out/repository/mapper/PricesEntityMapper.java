package com.comercio.electronico.api.products.adapters.out.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.comercio.electronico.api.products.adapters.out.repository.entity.PricesEntity;
import com.comercio.electronico.api.products.application.core.domain.Prices;

/**
 * Mapper que convierte la entidad de precios de la base de datos al objeto de dominio de precios de la aplicación.
 */
@Mapper(componentModel = "spring")
public interface PricesEntityMapper {

    /**
     * Convierte una entidad de precios de la base de datos en un objeto de dominio de precios de la aplicación.
     * @param pricesEntity La entidad de precios de la base de datos.
     * @return El objeto de dominio de precios de la aplicación.
     */
    @Mapping(target = "priority", ignore = true)
    @Mapping(target = "curr", ignore = true)
    @Mapping(target = "brandId", source = "brandId.id")
    @Mapping(target = "productId", source = "productId.id")
    Prices toPrices(PricesEntity pricesEntity);
}
