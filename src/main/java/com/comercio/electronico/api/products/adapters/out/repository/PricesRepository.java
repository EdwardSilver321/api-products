package com.comercio.electronico.api.products.adapters.out.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.comercio.electronico.api.products.adapters.out.repository.entity.PricesEntity;

/**
 * Repositorio para acceder a la entidad PricesEntity en la base de datos.
 */
public interface PricesRepository extends JpaRepository<PricesEntity, Long>{
    
    /**
     * Consulta los precios para la fecha, producto y marca especificados.
     *
     * @param date     Fecha para la cual se desean obtener los precios.
     * @param productId Identificador del producto.
     * @param brandId  Identificador de la marca.
     * @return Lista de entidades de precios para la fecha, producto y marca especificados.
     */
    @Query("SELECT p FROM PricesEntity p WHERE :date BETWEEN p.startDate AND p.endDate AND p.productId.id = :productId AND p.brandId.id = :brandId")
    List<PricesEntity> read(Date date, int productId, int brandId);

}
