package com.negocio.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import com.negocio.entities.*;

@Stateless
public class ProductoDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void crear(Producto producto){
		em.persist(producto);
		em.refresh(producto);
	}
	
	public List<Producto> listar() {
		TypedQuery<Producto> consulta = em.createNamedQuery("Producto.listarTodos", Producto.class);
		return consulta.getResultList();
	}
	public List<Producto> agregar(List<Producto> carrito, Producto p) {
		if(carrito==null)
			carrito=new ArrayList<Producto>();
		
		carrito.add(p);
		return carrito;
	}
	public List<Producto> eliminar(List<Producto> carrito, int codigoP) {
		if(carrito==null)
			return null;
		int i=0;
		for (Producto p : carrito) {
			if (p.getCodigo()==codigoP) {
				carrito.remove(i);
				break;
			}
			i++;
		}
		return carrito;
	}
	public double calcular(List<Producto> carrito) {
		double suma=0;
		for (Producto p : carrito) {
			suma+=p.getPrecio();
		}
		return Math.round(suma*100.0)/100.0;
	}
}
