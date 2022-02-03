package com.negocio.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.negocio.entities.Compras;
import com.negocio.entities.Usuario;

@Stateless
public class ComprasDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Compras> listar(Usuario us) {
		String consulta;
		List<Compras> lista;
		try{
			consulta="SELECT u FROM Compras u WHERE u.per = ?1 ";
			Query query=em.createQuery(consulta);
			query.setParameter(1, us.getPersona().getIdentificacion());
			lista=query.getResultList();
			
		}catch(Exception e)	{
			throw e;
		}
		return lista;
	}
}
