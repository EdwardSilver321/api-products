package com.comercio.electronico.api.products.adapters.out;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.comercio.electronico.api.products.adapters.out.repository.PricesRepository;
import com.comercio.electronico.api.products.adapters.out.repository.entity.PricesEntity;
import com.comercio.electronico.api.products.adapters.out.repository.mapper.PricesEntityMapper;
import com.comercio.electronico.api.products.application.core.domain.Prices;
import com.comercio.electronico.api.products.application.ports.out.ReadPricesOutputPort;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Adaptador para consultar precios desde el repositorio.
 */
@Component
public class ReadPricesAdapter implements ReadPricesOutputPort {
    
    private static final Logger log = LogManager.getLogger(ReadPricesAdapter.class);
    
    @Autowired
    private PricesRepository pricesRepository;
    
    @Autowired
    private PricesEntityMapper pricesEntityMapper;

    /**
     * Consulta los precios desde el repositorio para la fecha, producto y marca especificados.
     *
     * @param date     Fecha para la cual se desean obtener los precios.
     * @param productId Identificador del producto.
     * @param brandId  Identificador de la marca.
     * @return Lista de precios para la fecha, producto y marca especificados.
     */
    @Override
    public List<Prices> read(Date date, int productId, int brandId) {
        List<PricesEntity> pricesEntity = pricesRepository.read(date, productId, brandId);
        
        log.info("ReadPricesAdapter ejecutó con éxito la llamada al repositorio pricesRepository");
        return pricesEntity.stream().map(pricesEntityMapper::toPrices).collect(Collectors.toList());
    }

}
