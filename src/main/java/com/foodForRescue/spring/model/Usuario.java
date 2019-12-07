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
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;



/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity
@Table(name="usuario")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column (name="id")
	private Long id;
	
	@Column (name="nombre")
	private String nombre;
	
	@Column (name="dni")
	private String dni;
	
	@Column (name="fechaNacimiento")
	private String fechaNacimiento;
	
	@Column (name="email")
	private String email;
	
	@Column (name="password")
	private String password;
	
	// ASOCIACIONES USUARIO

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	List<Compra> compras = new ArrayList<>();



	
	private static final long serialVersionUID = 1L;

	public Usuario() {
		super();
	}

	public Usuario(Long id, String nombre, String dni, String fechaNacimiento, String email, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento
				+ "]";
	}  
	
	
	
	
	
}
