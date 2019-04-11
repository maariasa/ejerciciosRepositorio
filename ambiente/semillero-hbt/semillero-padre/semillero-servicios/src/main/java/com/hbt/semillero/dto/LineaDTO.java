/**
 * LineaDTO.java
 */
package com.hbt.semillero.dto;

import java.io.Serializable;

/**
 *  Clase que determina la línea de los automóviles
 */
public class LineaDTO implements Serializable{
	
	//ID de la línea
	private Long idLinea;
	
	//nombre de la línea
	private String nombre;
	
	//cilindraje de la línea
	private int cilindraje;
	
	//Marca de la línea (de la clase MarcaDTO)
	private MarcaDTO marca;

	/**
	 * Metodo encargado de retornar el valor del atributo idLinea
	 * @return El idLinea asociado a la clase
	 */
	public Long getIdLinea() {
		return idLinea;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo idLinea
	 * @param idLinea El nuevo idLinea a modificar.
	 */
	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
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

	/**
	 * Metodo encargado de retornar el valor del atributo cilindraje
	 * @return El cilindraje asociado a la clase
	 */
	public int getCilindraje() {
		return cilindraje;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo cilindraje
	 * @param cilindraje El nuevo cilindraje a modificar.
	 */
	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo marca
	 * @return El marca asociado a la clase
	 */
	public MarcaDTO getMarca() {
		return marca;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo marca
	 * @param marca El nuevo marca a modificar.
	 */
	public void setMarca(MarcaDTO marca) {
		this.marca = marca;
	}
	
	

}
