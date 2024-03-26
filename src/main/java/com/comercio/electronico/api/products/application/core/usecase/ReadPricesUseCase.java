package com.comercio.electronico.api.products.application.core.usecase;

import java.util.Date;
import java.util.List;

import com.comercio.electronico.api.products.application.core.domain.Prices;
import com.comercio.electronico.api.products.application.ports.in.ReadPricesInputPort;
import com.comercio.electronico.api.products.application.ports.out.ReadPricesOutputPort;

public class ReadPricesUseCase implements ReadPricesInputPort{

	private final ReadPricesOutputPort readPricesOutputPort; 
	
	public ReadPricesUseCase(ReadPricesOutputPort readPricesOutputPort) {
		this.readPricesOutputPort = readPricesOutputPort;
	}

	@Override
	public List<Prices> read(Date date, int productId, int brandId){
		return readPricesOutputPort.read(date, productId, brandId)
				.orElseThrow(() -> new RuntimeException("No existen registros"));
	}
}
