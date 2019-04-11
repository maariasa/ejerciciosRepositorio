package com.hbt.semillero.dto;

import java.io.Serializable;

/**
 * Clase que determina la Marca de los automóviles
 */
public class MarcaDTO implements Serializable{

	//ID de la Marca
	private Long idMarca;
	
	//Nombre de la Marca
	private String nombre;

	/**
	 * Metodo encargado de retornar el valor del atributo idMarca
	 * @return El idMarca asociado a la clase
	 */
	public Long getIdMarca() {
		return idMarca;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo idMarca
	 * @param idMarca El nuevo idMarca a modificar.
	 */
	public void setIdMarca(Long idMarca) {
		this.idMarca = idMarca;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo nombre
	 * @return El nombre asociado a la clase
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo nombre
	 * @param nombre El nuevo nombre a modificar.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
