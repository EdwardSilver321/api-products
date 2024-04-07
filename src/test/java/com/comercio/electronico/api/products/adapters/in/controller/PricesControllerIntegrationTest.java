package com.comercio.electronico.api.products.adapters.in.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;

import com.comercio.electronico.api.products.adapters.in.controller.response.PricesResponse;


/**
 * Casos de prueba de integración para la clase PricesController.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureTestDatabase
public class PricesControllerIntegrationTest {
    
	@Autowired
	private TestRestTemplate testRestTemplate;
	
    private Integer productId;
    private Integer brandId;
    SimpleDateFormat sdf;
	
    @BeforeEach
    public void setup() {
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		productId = 35455;
		brandId = 1;
    }
	  
	
    /**
     * Test para verificar el precio en una petición a las 10 AM del día 14.
     */
    @Test
    public void testPeticion10AM_Dia14_Producto35455_Brand1_ZARA() throws Exception {
        // Realiza la llamada al endpoint
		List<PricesResponse> responseEntity = testRestTemplate.exchange(
												    	        "/api/v1/prices?date={date}&productId={productId}&brandId={brandId}",
												    	        HttpMethod.GET,
												    	        null,
												    	        new ParameterizedTypeReference<List<PricesResponse>>() {},
												    	        "2020-06-14 10:00:00",
												    	        productId,
												    	        brandId).getBody();
		
		assertNotNull(responseEntity);
		assertEquals(1, responseEntity.size());
		
		PricesResponse pricesResponse = responseEntity.get(0);
		Date date = sdf.parse("2020-06-14 10:00:00");
		assertTrue(pricesResponse.getStartDate().before(date));
		assertTrue(pricesResponse.getEndDate().after(date));
		assertEquals(35455, pricesResponse.getProductId());
		assertEquals(1, pricesResponse.getBrandId());

        	
    }
    
    /**
     * Test para verificar el precio en una petición a las 16 PM del día 14.
     */
    @Test
    public void testPeticion16PM_Dia14_Producto35455_Brand1_ZARA() throws Exception {
 
		List<PricesResponse> responseEntity = testRestTemplate.exchange(
												    	        "/api/v1/prices?date={date}&productId={productId}&brandId={brandId}",
												    	        HttpMethod.GET,
												    	        null,
												    	        new ParameterizedTypeReference<List<PricesResponse>>() {},
												    	        "2020-06-14 16:00:00",
												    	        35455,
												    	        1).getBody(); 	

		assertNotNull(responseEntity);
		assertEquals(1, responseEntity.size());
		
		PricesResponse pricesResponse = responseEntity.get(0);
		Date date = sdf.parse("2020-06-14 16:00:00");
		assertTrue(pricesResponse.getStartDate().before(date));
		assertTrue(pricesResponse.getEndDate().after(date));
		assertEquals(35455, pricesResponse.getProductId());
		assertEquals(1, pricesResponse.getBrandId());
	
    }

    /**
     * Test para verificar el precio en una petición a las 21 PM del día 14.
     */
    @Test
    public void testPeticion21PM_Dia14_Producto35455_Brand1_ZARA() throws Exception {

		List<PricesResponse> responseEntity = testRestTemplate.exchange(
												    	        "/api/v1/prices?date={date}&productId={productId}&brandId={brandId}",
												    	        HttpMethod.GET,
												    	        null,
												    	        new ParameterizedTypeReference<List<PricesResponse>>() {},
												    	        "2020-06-14 21:00:00",
												    	        35455,
												    	        1).getBody();

		assertNotNull(responseEntity);
		assertEquals(1, responseEntity.size());
		
		PricesResponse pricesResponse = responseEntity.get(0);
		Date date = sdf.parse("2020-06-14 21:00:00");
		assertTrue(pricesResponse.getStartDate().before(date));
		assertTrue(pricesResponse.getEndDate().after(date));
		assertEquals(35455, pricesResponse.getProductId());
		assertEquals(1, pricesResponse.getBrandId());

    }

    /**
     * Test para verificar el precio en una petición a las 10 AM del día 15.
     */
    @Test
    public void testPeticion10AM_Dia15_Producto35455_Brand1_ZARA() throws Exception {
    	List<PricesResponse> responseEntity = testRestTemplate.exchange(
												    	        "/api/v1/prices?date={date}&productId={productId}&brandId={brandId}",
												    	        HttpMethod.GET,
												    	        null,
												    	        new ParameterizedTypeReference<List<PricesResponse>>() {},
												    	        "2020-06-15 10:00:00",
												    	        35455,
												    	        1).getBody();

    	assertNotNull(responseEntity);
		assertEquals(1, responseEntity.size());
		
		PricesResponse pricesResponse = responseEntity.get(0);
		Date date = sdf.parse("2020-06-15 10:00:00");
		assertTrue(pricesResponse.getStartDate().before(date));
		assertTrue(pricesResponse.getEndDate().after(date));
		assertEquals(35455, pricesResponse.getProductId());
		assertEquals(1, pricesResponse.getBrandId());

    }

    /**
     * Test para verificar el precio en una petición a las 21 PM del día 16.
     */
    @Test
    public void testPeticion21PM_Dia16_Producto35455_Brand1_ZARA() throws Exception {
    	List<PricesResponse> responseEntity = testRestTemplate.exchange(
												    	        "/api/v1/prices?date={date}&productId={productId}&brandId={brandId}",
												    	        HttpMethod.GET,
												    	        null,
												    	        new ParameterizedTypeReference<List<PricesResponse>>() {},
												    	        "2020-06-16 21:00:00",
														    	35455,
														    	1).getBody();

    	assertNotNull(responseEntity);
		assertEquals(1, responseEntity.size());
		
		PricesResponse pricesResponse = responseEntity.get(0);
		Date date = sdf.parse("2020-06-16 21:00:00");
		assertTrue(pricesResponse.getStartDate().before(date));
		assertTrue(pricesResponse.getEndDate().after(date));
		assertEquals(35455, pricesResponse.getProductId());
		assertEquals(1, pricesResponse.getBrandId());

    }
    
    /**
     * Test para verificar que no existen precios para la fecha de petición.
     */
    @Test
    public void testPeticionNoPrices() throws Exception {
    	List<PricesResponse> responseEntity = testRestTemplate.exchange(
								    	        "/api/v1/prices?date={date}&productId={productId}&brandId={brandId}",
								    	        HttpMethod.GET,
								    	        null,
								    	        new ParameterizedTypeReference<List<PricesResponse>>() {},
								    	        "2020-05-16 21:00:00",
										    	35455,
										    	1).getBody();

		assertNull(responseEntity);
    }
}
