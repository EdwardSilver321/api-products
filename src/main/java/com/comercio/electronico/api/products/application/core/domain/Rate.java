package com.comercio.electronico.api.products.application.core.domain;

/**
 * Clase que representa una tarifa.
 */
public class Rate {
	
    /** Identificador de la tarifa. */
	private int id;

    /** Lista de precios asociada a la tarifa. */
	private short priceList;

    /** Nombre de la tarifa. */
	private String name;
	
    /** Constructor vacío de la clase Rate. */
	public Rate() {
	}

    /**
     * Constructor de la clase Rate con parámetros.
     * @param id        Identificador de la tarifa.
     * @param priceList Lista de precios asociada a la tarifa.
     * @param name      Nombre de la tarifa.
     */
	public Rate(int id, short priceList, String name) {
		super();
		this.id = id;
		this.priceList = priceList;
		this.name = name;
	}
	
    // Getters y Setters

    /** Obtiene el identificador de la tarifa. */
	public int getId() {
		return id;
	}

    /** Establece el identificador de la tarifa. */
	public void setId(int id) {
		this.id = id;
	}

    /** Obtiene la lista de precios asociada a la tarifa. */
	public short getPriceList() {
		return priceList;
	}

    /** Establece la lista de precios asociada a la tarifa. */
	public void setPriceList(short priceList) {
		this.priceList = priceList;
	}

    /** Obtiene el nombre de la tarifa. */
	public String getName() {
		return name;
	}

    /** Establece el nombre de la tarifa. */
	public void setName(String name) {
		this.name = name;
	}
}
