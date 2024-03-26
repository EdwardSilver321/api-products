package com.comercio.electronico.api.products.adapters.out.repository.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.comercio.electronico.api.products.adapters.out.repository.entity.PricesEntity;
import com.comercio.electronico.api.products.application.core.domain.Prices;

@Mapper(componentModel = "spring")
public interface PricesEntityMapper {

	@Mapping(target = "id", 	  ignore = true)
	@Mapping(target = "priority", ignore = true)
	@Mapping(target = "curr", 	  ignore = true)
	Prices toPrices(PricesEntity pricesEntity);
}
