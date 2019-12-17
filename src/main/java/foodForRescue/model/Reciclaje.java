package foodForRescue.model;

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
	
	@Column (name="id_usuario")
	private Long id_usuario;
	
	@Column (name="id_material")
	private Long id_material;
	
	private String descripcion;
	
	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}
 
	public Long getId_material() {
		return id_material;
	}

	public void setId_material(Long id_material) {
		this.id_material = id_material;
	}

	@Column (name="tipo")
	private String tipo;
	
	@Column (name="descuento")
	private Long descuento;
	
	@Column (name="peso")
	private int peso;
	
	// ASOCIACIONES RECICLAJE
//		@OneToOne(cascade = { CascadeType.ALL })
//		@JoinColumn(name = "compra")
//		private Compra compra;
		
		@OneToOne(cascade = { CascadeType.ALL })
		@JoinColumn(name = "usuario")
		private Usuario usuario;

	
	private static final long serialVersionUID = 1L;

	public Reciclaje() {
		super();
	}

	public Reciclaje(Long id, String tipo, Long descuento, int peso, Long idUsuario) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.descuento = descuento;
		this.peso = peso;
		this.id_usuario = idUsuario;
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

	public Long getDescuento() {
		return descuento;
	}

	public void setDescuento(Long descuento) {
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

	public String getDescripcion() {
		return tipo + " - " + peso + " - "+ descuento;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
