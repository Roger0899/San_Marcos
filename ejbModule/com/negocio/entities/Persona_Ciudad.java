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
@Table(name="Q_CIUDAD",catalog="Tienda_SM",schema="public")
@NamedQuery(name = "Persona_Ciudad.listado_ciudades", query = "SELECT q FROM Persona_Ciudad q")
public class Persona_Ciudad implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ciudad")
	private String ciudad;
	@Column(name = "cantidad")
	private int cant;
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}

}
