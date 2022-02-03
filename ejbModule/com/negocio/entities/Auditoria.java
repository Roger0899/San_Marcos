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
@Table(name="tb_auditoria",catalog="Tienda_SM",schema="auditoria")
@NamedQuery(name = "Auditoria.listarTodos", query = "SELECT a FROM Auditoria a ")
public class Auditoria implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_aud")
	private int id;
	
	@Column(name="tabla_aud")
	private String tabla;
	
	@Column(name="operacion_aud")
	private String operacion;
	
	@Column(name="valoranterior_aud")
	private String anterior;
	
	@Column(name="valornuevo_aud")
	private String nuevo;
	
	@Column(name="fecha_aud")
	private String fecha;
	
	@Column(name="usuario_aud")
	private String usuario;

	@Column(name="esquema_aud")
	private String esquema;
	
	@Column(name="activar_aud")
	private boolean activar;
	
	@Column(name="trigger_aud")
	private boolean trigger;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTabla() {
		return tabla;
	}

	public void setTabla(String tabla) {
		this.tabla = tabla;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public String getAnterior() {
		return anterior;
	}

	public void setAnterior(String anterior) {
		this.anterior = anterior;
	}

	public String getNuevo() {
		return nuevo;
	}

	public void setNuevo(String nuevo) {
		this.nuevo = nuevo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEsquema() {
		return esquema;
	}

	public void setEsquema(String esquema) {
		this.esquema = esquema;
	}

	public boolean isActivar() {
		return activar;
	}

	public void setActivar(boolean activar) {
		this.activar = activar;
	}

	public boolean isTrigger() {
		return trigger;
	}

	public void setTrigger(boolean trigger) {
		this.trigger = trigger;
	}
	
	
}
