package com.negocio.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import com.negocio.entities.Rol;

import java.util.List;

@Stateless
public class RolDao {

	@PersistenceContext
	private EntityManager em;
	
	public List<Rol> listar() {
		TypedQuery<Rol> consulta = em.createNamedQuery("Rol.listarTodos", Rol.class);
		return consulta.getResultList();
	}
}
