package com.negocio.dao;

import java.util.List;
import com.negocio.entities.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class AuditoriaDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Auditoria> listar() {
		TypedQuery<Auditoria> consulta = em.createNamedQuery("Auditoria.listarTodos", Auditoria.class);
		return consulta.getResultList();
	}
	

}
