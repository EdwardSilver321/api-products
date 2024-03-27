package com.comercio.electronico.api.products.application.core.domain;

/**
 * Clase que representa un producto.
 */
public class Product {

    /** Identificador del producto. */
    private int id;

    /** Nombre del producto. */
    private String name;

    /** Constructor vacío de la clase Product. */
    public Product() {
    }

    /**
     * Constructor de la clase Product con parámetros.
     * @param id   Identificador del producto.
     * @param name Nombre del producto.
     */
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters y Setters

    /** Obtiene el identificador del producto. */
    public int getId() {
        return id;
    }

    /** Establece el identificador del producto. */
    public void setId(int id) {
        this.id = id;
    }

    /** Obtiene el nombre del producto. */
    public String getName() {
        return name;
    }

    /** Establece el nombre del producto. */
    public void setName(String name) {
        this.name = name;
    }
}
