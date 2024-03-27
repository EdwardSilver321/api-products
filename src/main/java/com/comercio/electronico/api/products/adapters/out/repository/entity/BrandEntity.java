package com.comercio.electronico.api.products.adapters.out.repository.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que representa la entidad de una cadena en la base de datos.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "BRAND_ENTITY")
public class BrandEntity {

    /**
     * Identificador único de la cadena.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    /**
     * Nombre de la cadena.
     */
    private String name;
}
