package com.comercio.electronico.api.products.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.comercio.electronico.api.products.adapters.out.ReadPricesAdapter;
import com.comercio.electronico.api.products.application.core.usecase.ReadPricesUseCase;

/**
 * Configuración de Spring para la consulta de precios.
 * Esta clase define la configuración necesaria para la inyección de dependencias y la creación de beans relacionados con la consulta de precios en la aplicación.
 */
@Configuration
@ComponentScan(basePackages = "com.comercio.electronico.api.products")
public class ReadPricesConfig {
    
    /**
     * Bean para el caso de uso de consulta de precios.
     * @param readPricesAdapter El adaptador utilizado para consultar los precios.
     * @return Una instancia del caso de uso de consulta de precios.
     */
    @Bean
    public ReadPricesUseCase readPricesUseCase(ReadPricesAdapter readPricesAdapter) {
        return new ReadPricesUseCase(readPricesAdapter);
    }

}
