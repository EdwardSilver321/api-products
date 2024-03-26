package com.comercio.electronico.api.products.application.ports.in;

import java.util.Date;
import java.util.List;

import com.comercio.electronico.api.products.application.core.domain.Prices;

public interface ReadPricesInputPort {

	List<Prices> read(Date date, int productId, int brandId);
}
