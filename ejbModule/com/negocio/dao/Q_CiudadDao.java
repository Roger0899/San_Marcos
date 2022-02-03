package com.negocio.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import com.negocio.entities.Persona_Ciudad;

@Stateless
public class Q_CiudadDao {

	@PersistenceContext
	private EntityManager em;
	
	public List<Persona_Ciudad> listar() {
		TypedQuery<Persona_Ciudad> consulta = em.createNamedQuery("Persona_Ciudad.listado_ciudades", Persona_Ciudad.class);
		return consulta.getResultList();
	}
}
