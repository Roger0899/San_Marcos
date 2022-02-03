package com.negocio.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="tb_persona",catalog="Tienda_SM",schema="public")
@NamedQuery(name = "Persona.listarTodos", query = "SELECT p FROM Persona p ")
@NamedQuery(name = "Persona.buscarPorCiudad", query = "SELECT p.ciudad, COUNT(p.ciudad) FROM Persona p GROUP BY p.ciudad")
@NamedQuery(name = "Persona.buscarPorEdad", query = "SELECT p FROM Persona p WHERE p.edad>=25")

public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_per")
	private int identificacion;
	
	@Column(name="nombre_per")
	private String nombre;
	
	@Column(name="ciudad_per")
	private String ciudad;
	
	@Column(name = "edad_per")
	private int edad;
	
	@Column(name="estadocivil_per")
	private String estado_civil;

	
	public Persona() {}
	

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}	
	
	
}
