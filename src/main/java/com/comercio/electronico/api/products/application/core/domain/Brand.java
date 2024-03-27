package com.comercio.electronico.api.products.application.core.domain;

/**
 * Clase que representa una cadena de producto.
 */
public class Brand {

    /**
     * Identificador único de la cadena.
     */
    private int id;

    /**
     * Nombre de la cadena.
     */
    private String name;

    /**
     * Constructor vacío de la clase Brand.
     */
    public Brand() {
    }

    /**
     * Constructor de la clase Brand con parámetros.
     * @param id   El identificador único de la cadena.
     * @param name El nombre de la cadena.
     */
    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters y Setters

    /**
     * Obtiene el identificador único de la cadena.
     * @return El identificador único de la cadena.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único de la cadena.
     * @param id El identificador único de la cadena.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de la cadena.
     * @return El nombre de la cadena.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre de la cadena.
     * @param name El nombre de la cadena.
     */
    public void setName(String name) {
        this.name = name;
    }
}
