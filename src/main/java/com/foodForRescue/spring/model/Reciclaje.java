package com.foodForRescue.spring.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Reciclaje
 *
 */
@Entity
@Table(name="reciclaje")
@NamedQuery(name="Reciclaje.findAll", query="SELECT r FROM Reciclaje r")
public class Reciclaje implements Serializable {
   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column (name="id")
	private Long id;
	
	@Column (name="tipo")
	private String tipo;
	
	@Column (name="descuento")
	private int descuento;
	
	@Column (name="peso")
	private int peso;
	
	// ASOCIACIONES RECICLAJE
		@OneToOne(cascade = { CascadeType.ALL })
		@JoinColumn(name = "compra")
		private Compra compra;

	
	private static final long serialVersionUID = 1L;

	public Reciclaje() {
		super();
	}

	public Reciclaje(Long id, String tipo, int descuento, int peso) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.descuento = descuento;
		this.peso = peso;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Reciclaje [id=" + id + ", tipo=" + tipo + ", descuento=" + descuento + ", peso=" + peso + "]";
	}
	
	
}
