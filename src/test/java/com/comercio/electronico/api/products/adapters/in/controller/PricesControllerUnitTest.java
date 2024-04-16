package com.comercio.electronico.api.products.adapters.in.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.comercio.electronico.api.products.adapters.in.controller.mapper.PricesMapper;
import com.comercio.electronico.api.products.application.core.domain.Prices;
import com.comercio.electronico.api.products.application.ports.in.ReadPricesInputPort;


/**
 * Casos de prueba unitarios para la clase PricesController.
 */
@ExtendWith(MockitoExtension.class)
public class PricesControllerUnitTest {
    
    @InjectMocks
    PricesController pricesController;
    
    @Mock
    private ReadPricesInputPort readPricesInputPort;
    
    @Mock
    private PricesMapper pricesMapper;
    
    private MockMvc mockMvc;
    private Integer productId;
    private Integer brandId;
    SimpleDateFormat sdf;
    
    /**
     * Método de configuración para inicializar MockMvc.
     */
    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(pricesController)
                .alwaysDo(print())
                .build();
        
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        productId = 35455;
        brandId = 1;
    }
    
    /**
     * Test de coberura de controlador
     * 
     */
    @Test
    public void returnPriceOK() throws Exception {
        Prices price = new Prices(1, new Date(), new Date(), (short) 1, 35455, (short) 1, 33, "EUR");
         
        when(readPricesInputPort.read(eq(sdf.parse("2020-06-14 10:00:00")), eq(productId), eq(brandId))).thenReturn(price);
        
        MvcResult mvcResult = mockMvc.perform(get("/api/v1/prices")
						                .param("date", "2020-06-14 10:00:00")
						                .param("productId", "35455")
						                .param("brandId", "1"))
						        		.andExpect(status().isOk())
						        		.andReturn();
        
        //Obtener la respuesta real
        MockHttpServletResponse response = mvcResult.getResponse();
        // Verificar que la respuesta devuelta coincide con lo esperado
        assertEquals(200, response.getStatus());

        // Verifica que se llamó al método pricesMapper.toPricesResponse con los objetos Prices esperados
        verify(pricesMapper, times(1)).toPricesResponse(price);
    }
}
