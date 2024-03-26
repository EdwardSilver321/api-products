package com.comercio.electronico.api.products.application.core.domain;

/**
 * Tarifas
 */
public class Rate {
	
	private int id;
	private short priceList;
	private String name;
	
	//CONSTRUCTORS
	public Rate() {
	}

	public Rate(int id, short priceList, String name) {
		super();
		this.id = id;
		this.priceList = priceList;
		this.name = name;
	}
	
	//GETTERS AND SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public short getPriceList() {
		return priceList;
	}
	public void setPriceList(short priceList) {
		this.priceList = priceList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
