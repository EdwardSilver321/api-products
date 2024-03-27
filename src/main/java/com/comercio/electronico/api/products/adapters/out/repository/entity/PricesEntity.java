package com.comercio.electronico.api.products.adapters.out.repository.entity;

import java.util.Date;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que representa la entidad de precios en la base de datos.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "PRICES_ENTITY")
public class PricesEntity {

    /**
     * Identificador único de los precios.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    /**
     * Cadena asociada a los precios.
     */
    @ManyToOne
    @JoinColumn(name = "BRAND_ID", referencedColumnName = "ID")
    private BrandEntity brandId;

    /**
     * Fecha de inicio vigencia de los precios.
     */
    private Date startDate;

    /**
     * Fecha de fin de vigencia de los precios.
     */
    private Date endDate;

    /**
     * Tarifas a aplicar.
     */
    private short priceList;

    /**
     * Producto asociado.
     */
    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "ID")
    private ProductEntity productId;

    /**
     * Prioridad de los precios.
     */
    private short priority;

    /**
     * Precio.
     */
    private double price;

    /**
     * Moneda.
     */
    private String curr;
}
