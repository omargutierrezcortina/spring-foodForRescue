package com.foodForRescue.spring.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Entity implementation class for Entity: Categoria
 *
 */

public class Categoria {
   
	
	private String titulo;
	private String imagen;
    private List<Producto> productos = new ArrayList<>();

	public Categoria() {
		
	}

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public List<Producto> getProductos() {
		return productos;
	}


	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	
}
