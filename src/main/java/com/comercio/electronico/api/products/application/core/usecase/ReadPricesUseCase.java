package com.comercio.electronico.api.products.application.core.usecase;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

import com.comercio.electronico.api.products.application.core.domain.Prices;
import com.comercio.electronico.api.products.application.core.domain.exception.NoPricesFoundException;
import com.comercio.electronico.api.products.application.ports.in.ReadPricesInputPort;
import com.comercio.electronico.api.products.application.ports.out.ReadPricesOutputPort;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Caso de uso para consultar precios de productos.
 */
public class ReadPricesUseCase implements ReadPricesInputPort {

    private static final Logger log = LogManager.getLogger(ReadPricesUseCase.class);

    private final ReadPricesOutputPort readPricesOutputPort;
    private final ResourceBundle messages;

    /**
     * Constructor para el caso de uso.
     *
     * @param readPricesOutputPort Puerto de salida para consultar precios.
     */
    public ReadPricesUseCase(ReadPricesOutputPort readPricesOutputPort) {
        this.readPricesOutputPort = readPricesOutputPort;
        this.messages = ResourceBundle.getBundle("error-messages");
    }

    /**
     * Consulta los precios para la fecha, producto y cadena especificados.
     *
     * @param date     Fecha para la cual se desean obtener los precios.
     * @param productId Identificador del producto.
     * @param brandId  Identificador de la cadena.  n                      
     * @return Lista de precios para la fecha, producto y marca especificados.
     * @throws NoPricesFoundException Excepción lanzada si no se encuentran registros para los parámetros especificados.
     */
    @Override
    public List<Prices> read(Date date, int productId, int brandId)  {

        List<Prices> prices = readPricesOutputPort.read(date, productId, brandId);

        if (Objects.isNull(prices) || prices.isEmpty()) {
            String errorMessage = messages.getString("error.noPricesFound");
            log.error(errorMessage);
            throw new NoPricesFoundException(errorMessage);
        }

        log.info("ReadPricesUseCase ejecutado con éxito");
        return prices;
    }
}
