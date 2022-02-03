package com.negocio.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.negocio.entities.Menu;

@Stateless
public class MenuDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Menu> listar() {
		TypedQuery<Menu> consulta = em.createNamedQuery("Menu.listarTodos", Menu.class);
		return consulta.getResultList();
	}
	
}
