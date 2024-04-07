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
     * Consulta los precios para la fecha, producto y marca especificados, filtrados por maxima prioridad.
     *
     * @param date     Fecha para la cual se desean obtener los precios.
     * @param productId Identificador del producto.
     * @param brandId  Identificador de la marca.
     * @return Lista de entidades de precios para la fecha, producto y marca especificados.
     */
	@Query("SELECT p FROM PricesEntity p WHERE :date BETWEEN p.startDate AND p.endDate AND p.productId.id = :productId AND p.brandId.id = :brandId AND p.priority = (SELECT MAX(p2.priority) FROM PricesEntity p2 WHERE :date BETWEEN p2.startDate AND p2.endDate AND p2.productId.id = :productId AND p2.brandId.id = :brandId)")
    List<PricesEntity> read(Date date, int productId, int brandId);

}
