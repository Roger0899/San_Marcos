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
@Table(name="Q_ESTADOCIVIL",catalog="Tienda_SM",schema="public")
@NamedQuery(name = "Persona_EstadoCivil.listado_estadocivil", query = "SELECT q FROM Persona_EstadoCivil q")
public class Persona_EstadoCivil implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "estado_civil")
	private String estadocivil;
	@Column(name = "cantidad")
	private int cant;
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	
}
