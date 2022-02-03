package com.negocio.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import com.negocio.entities.Persona;

@Stateless
public class PersonasDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void crear(Persona persona){
		em.persist(persona);
		em.refresh(persona);
	}
	public Persona actualizar(Persona persona) {
		return em.merge(persona);
	}
	public void borrar(Integer codigo) {
		Persona persona = em.find(Persona.class, codigo);
		em.remove(persona);
	}
	public Persona buscar(Integer codigo) {
		return em.find(Persona.class, codigo);
	}
	
	@SuppressWarnings("unchecked")
	public Persona I_per(Persona p) {
		Persona persona=null;
		String consulta;
		try{
			consulta="SELECT p FROM Persona p WHERE p.nombre = ?1";
			Query query=em.createQuery(consulta);
			query.setParameter(1, p.getNombre());
			List<Persona> lista=query.getResultList();
			if(!lista.isEmpty()){
				persona=lista.get(0);
			}
		}catch(Exception e)	{
			throw e;
		}
		return persona;
	}
	
	public List<Persona> listar() {
		TypedQuery<Persona> consulta = em.createNamedQuery("Persona.listarTodos", Persona.class);
		return consulta.getResultList();
	}
	
	public List<Persona> buscarPorEdad() {
		TypedQuery<Persona> consulta = em.createNamedQuery("Persona.buscarPorEdad", Persona.class);
		return consulta.getResultList();
	}
	


}
