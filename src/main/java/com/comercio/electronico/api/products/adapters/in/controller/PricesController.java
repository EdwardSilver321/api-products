package com.comercio.electronico.api.products.adapters.in.controller;

import java.util.Date;

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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

/**
 * Controlador para manejar las solicitudes relacionadas con los productos.
 */
@RestController
@RequestMapping("/api/v1/prices")
public class PricesController {

    @Autowired
    private ReadPricesInputPort readPricesInputPort;

    @Autowired
    private PricesMapper pricesMapper;

    /**
     * Maneja la solicitud para consultar los precios de los productos para una fecha, producto y marca especificados.
     *
     * @param date      Fecha para la cual se desean obtener los precios.
     * @param productId Identificador del producto.
     * @param brandId   Identificador de la marca.
     * @return Respuesta HTTP con el precio o un mensaje de error si no se encuentran precios.
     */
    @Operation(summary = "Consultar precios", description = "Consulta los precios de los productos para una fecha, producto y marca especificados.")
    @ApiResponses(value = {
    	    @ApiResponse(responseCode = "200", description = "Lista de precios devuelta con éxito", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PricesResponse.class))),
    	    @ApiResponse(responseCode = "404", description = "No se encontraron precios para los parámetros especificados", content = @Content(mediaType = "application/json"))
    	})
    @GetMapping
    public ResponseEntity<PricesResponse> read(@Parameter(description = "Fecha para la cual se desean obtener los precios en formato 'yyyy-MM-dd HH:mm:ss'", required = true) @RequestParam(required = true) @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date,
			            @Parameter(description = "Identificador del producto") @RequestParam(required = true) Integer productId,
			            @Parameter(description = "Identificador de la marca") @RequestParam(required = true) Integer brandId) {
    	
        Prices price = readPricesInputPort.read(date, productId, brandId);
       
        // Mapea Prices a PricesResponse y lo devuelve en una respuesta HTTP
        return ResponseEntity.ok().body(pricesMapper.toPricesResponse(price));
    }
}
