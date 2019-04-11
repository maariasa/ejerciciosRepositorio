/**
 * PersonaDTO.java
 */
package com.hbt.semillero.dto;

import java.io.Serializable;

/**
 * <b>Descripción:<b> Clase que determina las persona
 * @version 
 */
public class PersonaDTO implements Serializable {
	
	//Variable que determina la ID de la persona
	private Long idPersona;

	//Variable que determina la ID de la persona
	private String numeroIdentificacion;

	//Variable que determina el tipo de identificación
	private String tipoIdentificacion;

	//Variable que determina el numero de telefono
	private String numeroTelefonico;

	//Variable que determina el nombre
	private String nombres;
	
	//Variable que determina el apellido
	private String apellidos;
	
	//Variable que determina si es comprador
	private boolean comprador;

	//Variable que determina si es vendedor
	private boolean vendedor;
	
	//Variable que determina la edad
	private Long edad;

	/**
	 * Metodo encargado de retornar el valor del atributo idPersona
	 * @return El idPersona asociado a la clase
	 */
	public Long getIdPersona() {
		return idPersona;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo idPersona
	 * @param idPersona El nuevo idPersona a modificar.
	 */
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo numeroIdentificacion
	 * @return El numeroIdentificacion asociado a la clase
	 */
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo numeroIdentificacion
	 * @param numeroIdentificacion El nuevo numeroIdentificacion a modificar.
	 */
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo tipoIdentificacion
	 * @return El tipoIdentificacion asociado a la clase
	 */
	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo tipoIdentificacion
	 * @param tipoIdentificacion El nuevo tipoIdentificacion a modificar.
	 */
	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo numeroTelefonico
	 * @return El numeroTelefonico asociado a la clase
	 */
	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo numeroTelefonico
	 * @param numeroTelefonico El nuevo numeroTelefonico a modificar.
	 */
	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo nombres
	 * @return El nombres asociado a la clase
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo nombres
	 * @param nombres El nuevo nombres a modificar.
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo apellidos
	 * @return El apellidos asociado a la clase
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo apellidos
	 * @param apellidos El nuevo apellidos a modificar.
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo comprador
	 * @return El comprador asociado a la clase
	 */
	public boolean isComprador() {
		return comprador;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo comprador
	 * @param comprador El nuevo comprador a modificar.
	 */
	public void setComprador(boolean comprador) {
		this.comprador = comprador;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo vendedor
	 * @return El vendedor asociado a la clase
	 */
	public boolean isVendedor() {
		return vendedor;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo vendedor
	 * @param vendedor El nuevo vendedor a modificar.
	 */
	public void setVendedor(boolean vendedor) {
		this.vendedor = vendedor;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo edad
	 * @return El edad asociado a la clase
	 */
	public Long getEdad() {
		return edad;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo edad
	 * @param edad El nuevo edad a modificar.
	 */
	public void setEdad(Long edad) {
		this.edad = edad;
	}
	
	
}
