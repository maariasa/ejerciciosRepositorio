/**
 * ConsultasBean.java
 */
package com.hbt.semillero.servicios.ejb;

import java.util.Calendar;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.PersonaDTO;
import com.hbt.semillero.entidades.Comprador;
import com.hbt.semillero.entidades.Linea;
import com.hbt.semillero.entidades.Marca;
import com.hbt.semillero.entidades.Persona;
import com.hbt.semillero.entidades.Vendedor;
import com.hbt.semillero.servicios.interfaces.IConsultasBeanLocal;

/**
 * <b>Descripción:<b> Clase tipo EJB que determina las consultas
 * @version 
 */

@Stateless
public class ConsultasBean implements IConsultasBeanLocal{
	@PersistenceContext
	private EntityManager entityManager;
	
	/**
	 * Método que consulta la Marca de los automóviles
	 * @see com.hbt.semillero.servicios.interfaces.IConsultasBeanLocal#consultarMarcas()
	 */
	
	public List<Marca> consultarMarcas(){
		return entityManager.createQuery("SELECT ma FROM Marca ma").getResultList();	}
	
	/**
	 * Método que consulta las línea de los automóviles
	 * @see com.hbt.semillero.servicios.interfaces.IConsultasBeanLocal#consultarLineas(java.lang.Long)
	 */
	public List<Linea> consultarLineas(Long idMarca){
		
		return entityManager.createQuery("SELECT ln FROM linea ln WHERE ln.marca.idLinea =.ID_LINEA")
				.setParameter("ID_LINEA", idMarca)
				.setParameter("Parametro2", idMarca)
				.getResultList();
	}
	
	/**
	 * Método que crea una persona en la base de datos
	 * @see com.hbt.semillero.servicios.interfaces.IConsultasBeanLocal#crearPersona(com.hbt.semillero.dto.PersonaDTO)
	 */
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void crearPersona(PersonaDTO personaDTO) {
		Persona persona = new Persona();
		persona.setNombres(personaDTO.getNombres());
		persona.setApellidos(personaDTO.getApellidos());
		persona.setNumeroIdentificacion(personaDTO.getNumeroIdentificacion());
		persona.setTipoIdentificacion(personaDTO.getTipoIdentificacion());
		persona.setNumeroTelefonico(personaDTO.getNumeroTelefonico());
		persona.setEdad(personaDTO.getEdad());
		
		entityManager.persist(persona);
		
		if (personaDTO.isComprador()) {
			Comprador comprador = new Comprador();
			comprador.setFechaAfiliacion(Calendar.getInstance());
			comprador.setPersona(persona);
			entityManager.persist(comprador);
		}
		
		if (personaDTO.isVendedor()) {
			Vendedor vendedor = new Vendedor();
			vendedor.setFechaIngreso(Calendar.getInstance());
			vendedor.setPersona(persona);
			entityManager.persist(vendedor);
		}
	}
	
	/**
	 * 
	 * Metodo encargado de editar las personas en la base de datos
	 *
	 */
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void editarPersona(PersonaDTO personaDTO) {
		
		Persona persona = entityManager.find(Persona.class, personaDTO.getIdPersona());
		
		persona.setNombres(personaDTO.getNombres());
		persona.setApellidos(personaDTO.getApellidos());
		persona.setNumeroIdentificacion(personaDTO.getNumeroIdentificacion());
		persona.setTipoIdentificacion(personaDTO.getTipoIdentificacion());
		persona.setNumeroTelefonico(personaDTO.getNumeroTelefonico());
		persona.setEdad(personaDTO.getEdad());
		
		entityManager.merge(persona);
	}
	
	/**
	 * 
	 * Metodo encargado de la gestión de las personas
	 * 
	 * @param personaDTO
	 */
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void gestionPersona(PersonaDTO personaDTO) {
		
		Persona persona = entityManager.find(Persona.class, personaDTO.getIdPersona());
		
		persona.getNombres();
		persona.getApellidos();
		persona.getNumeroIdentificacion();
		persona.getTipoIdentificacion();
		persona.getNumeroTelefonico();
		persona.getEdad();
		
		
	}
}
