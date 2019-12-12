package com.foodForRescue.spring.model;

/**
 * Entity implementation class for Entity: Categoria
 *
 */
public enum Categoria {
	LEGUMBRES(1, "Legumbres"), BEBIDAS(2,"Bebidas"), PANADERIA(3,"Panaderia");

	private final int id;
	private final String value;

	Categoria(int id, String value) {
		this.id=id;
		this.value = value;

	}

	public String getValue() {
		return value;
	}

	public int getId() {
		return id;
	}
	
	

}
