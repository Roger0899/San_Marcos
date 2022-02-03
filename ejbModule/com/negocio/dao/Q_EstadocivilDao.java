package com.negocio.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.negocio.entities.Persona_EstadoCivil;

@Stateless
public class Q_EstadocivilDao {
	@PersistenceContext
	private EntityManager em;
	
	public List<Persona_EstadoCivil> listar() {
		TypedQuery<Persona_EstadoCivil> consulta = em.createNamedQuery("Persona_EstadoCivil.listado_estadocivil", Persona_EstadoCivil.class);
		return consulta.getResultList();
	}
}
