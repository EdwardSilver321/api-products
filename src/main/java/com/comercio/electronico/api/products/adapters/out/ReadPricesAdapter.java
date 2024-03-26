package com.comercio.electronico.api.products.adapters.out;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.comercio.electronico.api.products.adapters.out.repository.PricesRepository;
import com.comercio.electronico.api.products.adapters.out.repository.entity.PricesEntity;
import com.comercio.electronico.api.products.adapters.out.repository.mapper.PricesEntityMapper;
import com.comercio.electronico.api.products.application.core.domain.Prices;
import com.comercio.electronico.api.products.application.ports.out.ReadPricesOutputPort;

@Component
public class ReadPricesAdapter implements ReadPricesOutputPort{
	
	@Autowired
	private PricesRepository pricesRepository;
	
	@Autowired
	private PricesEntityMapper pricesEntityMapper;

	@Override
	public Optional<List<Prices>> read(Date date, int productId, int brandId) {
		Optional<List<PricesEntity>> pricesEntity = pricesRepository.read(date, productId, brandId);
		
		return pricesEntity.map(entities -> entities.stream()
                 .map(pricesEntityMapper::toPrices)
                 .collect(Collectors.toList()));
	}

}
