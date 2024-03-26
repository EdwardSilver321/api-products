package com.comercio.electronico.api.products.application.core.domain;

/**
 * Cadena del grupo
 */
public class Brand {

	private int id;
	private String name;
	
	//CONSTRUCTORS
	public Brand() {
	}

	public Brand(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//GETTERS AND SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
