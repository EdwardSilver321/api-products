package com.comercio.electronico.api.products.adapters.out.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que representa la entidad de tarifa en la base de datos.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "RATE_ENTITY")
public class RateEntity {

    /**
     * Identificador único de la tarifa.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Tarifa aplicada.
     */
    private short priceList;

    /**
     * Nombre de la tarifa.
     */
    private String name;
}
