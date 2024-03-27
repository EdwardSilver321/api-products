package com.comercio.electronico.api.products.adapters.out.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que representa la entidad de producto en la base de datos.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_ENTITY")
public class ProductEntity {

    /**
     * Identificador único del producto.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nombre del producto.
     */
    private String name;
}
