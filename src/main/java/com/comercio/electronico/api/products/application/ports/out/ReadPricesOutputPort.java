package com.comercio.electronico.api.products.application.ports.out;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.comercio.electronico.api.products.application.core.domain.Prices;

public interface ReadPricesOutputPort {

	 Optional<List<Prices>> read(Date date, int productId, int brandId);
}
