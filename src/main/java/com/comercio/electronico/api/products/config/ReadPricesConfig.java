package com.comercio.electronico.api.products.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.comercio.electronico.api.products.adapters.out.ReadPricesAdapter;
import com.comercio.electronico.api.products.application.core.usecase.ReadPricesUseCase;

@Configuration
@ComponentScan(basePackages = "com.comercio.electronico.api.products")
public class ReadPricesConfig {
	
	@Bean
	public ReadPricesUseCase readPricesUseCase(ReadPricesAdapter readPricesAdapter) {
		return new ReadPricesUseCase(readPricesAdapter);
		
	}

}
