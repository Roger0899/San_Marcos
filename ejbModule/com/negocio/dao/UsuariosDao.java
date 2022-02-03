package com.negocio.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.negocio.entities.Usuario;

@Stateless
public class UsuariosDao {

	@PersistenceContext
	private EntityManager em;
	
	public void crear(Usuario usuario){
		em.persist(usuario);
		em.refresh(usuario);
	}
	
	public Usuario actualizar(Usuario usuario) {
		return em.merge(usuario);
	}
	
	public void borrar(Integer codigo) {
		Usuario persona = em.find(Usuario.class, codigo);
		em.remove(persona);
	}
	
	public Usuario buscar(Integer codigo) {
		return em.find(Usuario.class, codigo);
	}
	
	public List<Usuario> listar() {
		TypedQuery<Usuario> consulta = em.createNamedQuery("Usuario.listarTodos", Usuario.class);
		return consulta.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public Usuario Iniciar_Sesion(Usuario us) {
		Usuario usuario=null;
		String consulta;
		try{
			consulta="SELECT u FROM Usuario u WHERE u.correo = ?1 AND u.clave= ?2";
			Query query=em.createQuery(consulta);
			query.setParameter(1, us.getCorreo());
			query.setParameter(2, us.getClave());
			List<Usuario> lista=query.getResultList();
			if(!lista.isEmpty()){
				usuario=lista.get(0);
			}
		}catch(Exception e)	{
			throw e;
		}
		return usuario;
	}
	
	@SuppressWarnings("unchecked")
	public boolean Cuenta (Usuario us) {
		boolean usuario=false;
		String consulta;
		try{
			consulta="SELECT u FROM Usuario u WHERE u.correo = ?1";
			Query query=em.createQuery(consulta);
			query.setParameter(1, us.getCorreo());
			List<Usuario> lista=query.getResultList();
			if(!lista.isEmpty()){
				usuario=true;
			}
		}catch(Exception e)	{
			throw e;
		}
		return usuario;
	}
}
