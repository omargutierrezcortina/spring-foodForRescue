package com.foodForRescue.spring.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * Entity implementation class for Entity: Producto
 *
 */
@Entity

@Table(name="producto")
public class Producto implements Serializable {
	
	private static final long serialVersionUID = 1L;

   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column (name="id")
	private Long id;
	
	@Column (name="referencia")
	private String referencia;
	
	@Column (name="peso")
	private int peso;
	
	@Column (name="precio")
	private double precio;
	
	
	@Column (name="categoria")
	private String categoria;
	
	@Column (name="fabricante")
	private String fabricante;
	
	@Column (name="descuento")
	private int descuento;
	
	@Column (name="denominacion")
	private String denominacion;

	@Column (name="cantidad")
	private int cantidad;
	
	@Column (name="idCategoria")
	private int idCategoria;
	
	@Column (name="foto1")
	private String foto1;
	
	@Column (name="foto2")
	private String foto2;
	
	
	// ASOCIACIONES
//	@ManyToMany(mappedBy = "compra")
//	private List<Compra> compras = new ArrayList<>();

	
//	@ManyToMany
//	@JoinTable(name = "productos",
//	joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
//	inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id"))
	
//	private List<Tag> tags = new ArrayList<>();

	

	public Producto() {
		super();
	}

	public Producto(Long id, String referencia, int peso, double precio, String categoria, String fabricante,
			int descuento, String denominacion, int idCategoria, String foto1, String foto2) {
		super();
		this.id = id;
		this.referencia = referencia;
		this.peso = peso;
		this.precio = precio;
		this.categoria = categoria;
		this.fabricante = fabricante;
		this.descuento = descuento;
		this.denominacion = denominacion;
		this.idCategoria = idCategoria;
		this.foto1 = foto1;
		this.foto2 = foto2;
	}

	 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	

	public String getFoto1() {
		return foto1;
	}

	public void setFoto1(String foto1) {
		this.foto1 = foto1;
	}

	public String getFoto2() {
		return foto2;
	}

	public void setFoto2(String foto2) {
		this.foto2 = foto2;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", referencia=" + referencia + ", peso=" + peso + ", precio=" + precio
				+ ", categoria=" + categoria + ", fabricante=" + fabricante + ", descuento=" + descuento
				+ ", denominacion=" + denominacion + ", cantidad=" + cantidad + ", idCategoria=" + idCategoria + "]";
	}

	
	
}
