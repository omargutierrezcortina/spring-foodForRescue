package com.foodForRescue.spring.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
 * Entity implementation class for Entity: Compra
 *
 */
@Entity
@Table(name="Compra")
@NamedQuery(name="Compra.findAll", query="SELECT c FROM Compra c")
public class Compra implements Serializable {
   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column (name="id")
	private Long id;
	
	@Column (name="precio")
	private double precio;
	
	@Column (name="producto")
	private Producto producto;
	
	//ASOCIACIONES

	@ManyToOne
	@JoinColumn(name = "usuario")
	private Usuario usuario;

	
	@ManyToMany
	@JoinTable(name = "compra_producto",
			joinColumns = @JoinColumn(name = "compra_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "producto_id", referencedColumnName = "id"))
		private List<Producto> productos = new ArrayList<>();

	@OneToOne(cascade =  CascadeType.ALL )
	@JoinColumn(name = "reciclaje")
	private Reciclaje reciclaje;

	
	private static final long serialVersionUID = 1L;

	public Compra() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Reciclaje getReciclaje() {
		return reciclaje;
	}

	public void setReciclaje(Reciclaje reciclaje) {
		this.reciclaje = reciclaje;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Compra [id=" + id + ", precio=" + precio + ", producto=" + producto + ", usuario=" + usuario
				+ ", productos=" + productos + ", reciclaje=" + reciclaje + "]";
	}

	
}
