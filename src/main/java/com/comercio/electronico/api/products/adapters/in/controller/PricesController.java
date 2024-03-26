package com.comercio.electronico.api.products.adapters.in.controller;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.comercio.electronico.api.products.adapters.in.controller.mapper.PricesMapper;
import com.comercio.electronico.api.products.adapters.in.controller.response.PricesResponse;
import com.comercio.electronico.api.products.application.core.domain.Prices;
import com.comercio.electronico.api.products.application.ports.in.ReadPricesInputPort;

@RestController
@RequestMapping("/api/v1/prices")
public class PricesController {

	@Autowired
	private ReadPricesInputPort readPricesInputPort;
	
	@Autowired
	private PricesMapper pricesMapper;
	
	@GetMapping
	public ResponseEntity<List<PricesResponse>> read(@RequestParam(required = true) @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date,
											        @RequestParam(required = true) Integer productId,
											        @RequestParam(required = true) Integer brandId){
		
        List<Prices> prices = readPricesInputPort.read(date, productId, brandId);

        return ResponseEntity.ok().body(prices.stream()
        						.map(pricesMapper::toPricesResponse)
        						.collect(Collectors.toList()));
	}
}
