package com.comercio.electronico.api.products.adapters.in.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.comercio.electronico.api.products.adapters.in.controller.mapper.PricesMapper;
import com.comercio.electronico.api.products.application.core.domain.Prices;
import com.comercio.electronico.api.products.application.core.domain.exception.NoPricesFoundException;
import com.comercio.electronico.api.products.application.ports.in.ReadPricesInputPort;


/**
 * Casos de prueba para la clase PricesController.
 */
@ExtendWith(MockitoExtension.class)
public class PricesControllerTest {
    
    @InjectMocks
    PricesController pricesController;
    
    @Mock
    private ReadPricesInputPort readPricesInputPort;
    
    @Mock
    private PricesMapper pricesMapper;
    
    MockMvc mockMvc;
    
    private Integer productId;
    private Integer brandId;
    
    /**
     * Método de configuración para inicializar MockMvc.
     */
    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(pricesController)
                .alwaysDo(print())
                .build();
        
        productId = 35455;
        brandId = 1;
    }
    
    @Test
    public void testPeticion10AM_Dia14_Producto35455_Brand1_ZARA() throws Exception {
        List<Prices> prices = new ArrayList<>();
        prices.add(new Prices(1, new Date(), new Date(), (short) 1, 35455, (short) 1, 33, "EUR"));
        when(readPricesInputPort.read(any(Date.class), eq(productId), eq(brandId))).thenReturn(prices);
        
        mockMvc.perform(get("/api/v1/prices")
                .param("date", "2020-06-14 10:00:00")
                .param("productId", "35455")
                .param("brandId", "1"))
        		.andExpect(status().isOk())
        		.andExpect(content().contentType(MediaType.APPLICATION_JSON));
        
        // Verifica que se llamó al método pricesMapper.toPricesResponse con los objetos Prices esperados
        verify(pricesMapper, times(1)).toPricesResponse(prices.get(0));
        	
    }
    
    @Test
    public void testPeticion16PM_Dia14_Producto35455_Brand1_ZARA() throws Exception {
        List<Prices> prices = new ArrayList<>();
        prices.add(new Prices(1, new Date(), new Date(), (short) 1, 35455, (short) 1, 33, "EUR"));
        when(readPricesInputPort.read(any(Date.class), eq(productId), eq(brandId))).thenReturn(prices);
        
        mockMvc.perform(get("/api/v1/prices")
                .param("date", "2020-06-14 16:00:00")
                .param("productId", "35455")
                .param("brandId", "1"))
        		.andExpect(status().isOk())
        		.andExpect(content().contentType(MediaType.APPLICATION_JSON));
        
        // Verifica que se llamó al método pricesMapper.toPricesResponse con los objetos Prices esperados
        verify(pricesMapper, times(1)).toPricesResponse(prices.get(0));
        	
    }

    @Test
    public void testPeticion21PM_Dia14_Producto35455_Brand1_ZARA() throws Exception {
        List<Prices> prices = new ArrayList<>();
        prices.add(new Prices(1, new Date(), new Date(), (short) 1, 35455, (short) 1, 33, "EUR"));
        when(readPricesInputPort.read(any(Date.class), eq(productId), eq(brandId))).thenReturn(prices);
        
        mockMvc.perform(get("/api/v1/prices")
                .param("date", "2020-06-14 21:00:00")
                .param("productId", "35455")
                .param("brandId", "1"))
        		.andExpect(status().isOk())
        		.andExpect(content().contentType(MediaType.APPLICATION_JSON));
        
      // Verifica que se llamó al método pricesMapper.toPricesResponse con los objetos Prices esperados
       verify(pricesMapper, times(1)).toPricesResponse(prices.get(0));
    }

    @Test
    public void testPeticion10AM_Dia15_Producto35455_Brand1_ZARA() throws Exception {
        List<Prices> prices = new ArrayList<>();
        prices.add(new Prices(1, new Date(), new Date(), (short) 1, 35455, (short) 1, 33, "EUR"));
        when(readPricesInputPort.read(any(Date.class), eq(productId), eq(brandId))).thenReturn(prices);
        
        mockMvc.perform(get("/api/v1/prices")
                .param("date", "2020-06-15 10:00:00")
                .param("productId", "35455")
                .param("brandId", "1"))
    			.andExpect(status().isOk())
    			.andExpect(content().contentType(MediaType.APPLICATION_JSON));
        
        // Verifica que se llamó al método pricesMapper.toPricesResponse con los objetos Prices esperados
        verify(pricesMapper, times(1)).toPricesResponse(prices.get(0));
    }

    @Test
    public void testPeticion21PM_Dia16_Producto35455_Brand1_ZARA() throws Exception {
        List<Prices> prices = new ArrayList<>();
        prices.add(new Prices(1, new Date(), new Date(), (short) 1, 35455, (short) 1, 33, "EUR"));
        when(readPricesInputPort.read(any(Date.class), eq(productId), eq(brandId))).thenReturn(prices);
        
        mockMvc.perform(get("/api/v1/prices")
                .param("date", "2020-06-16 21:00:00")
                .param("productId", "35455")
                .param("brandId", "1"))
    			.andExpect(status().isOk())
    			.andExpect(content().contentType(MediaType.APPLICATION_JSON));
        
        // Verifica que se llamó al método pricesMapper.toPricesResponse con los objetos Prices esperados
        verify(pricesMapper, times(1)).toPricesResponse(prices.get(0));
    }
    
    /**
     * Caso de prueba para verificar la respuesta de error cuando no se encuentran precios.
     */
    @Test
    public void returnPricesNOK() throws Exception {
        when(readPricesInputPort.read(any(Date.class), eq(productId), eq(brandId)))
                .thenThrow(new NoPricesFoundException("No se encontraron precios para los parámetros especificados"));
        
		mockMvc.perform(get("/api/v1/prices")
		        .param("date", "2020-06-27 10:00:00")
		        .param("productId", "35455")
		        .param("brandId", "1"))
				.andExpect(status().isNotFound());	
    }

}
