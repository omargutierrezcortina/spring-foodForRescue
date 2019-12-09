package com.foodForRescue.spring.model;

/**
 * Entity implementation class for Entity: Reciclaje
 *
 */
public enum TipoReciclaje {
	CARTON("Carton"), VIDRIO("Vidrio"), PLASTICO("Plastico");

	private final String value;

	TipoReciclaje(String value) {
		this.value = value;

	}

	public String getValue() {
		return value;
	}

}
