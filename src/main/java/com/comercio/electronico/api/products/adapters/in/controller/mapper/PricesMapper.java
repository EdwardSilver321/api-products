package com.comercio.electronico.api.products.adapters.in.controller.mapper;

import org.mapstruct.Mapper;

import com.comercio.electronico.api.products.adapters.in.controller.response.PricesResponse;
import com.comercio.electronico.api.products.application.core.domain.Prices;

@Mapper(componentModel = "spring")
public interface PricesMapper {

	PricesResponse toPricesResponse(Prices prices);
}
