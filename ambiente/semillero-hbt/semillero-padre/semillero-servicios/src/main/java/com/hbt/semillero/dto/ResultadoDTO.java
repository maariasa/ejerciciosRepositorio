/**
 * ResultadoDTO.java
 */
package com.hbt.semillero.dto;

import java.io.Serializable;

/**
 * Clase que determina el resultado de la transacción
 * @version 
 */
public class ResultadoDTO implements Serializable{
	//Variable que determina si es exitosa
	private boolean exitoso;
	
	//Variable que determina el mensaje de error a mostrar
	private String mensajeError;

	/**
	 * Metodo encargado de retornar el valor del atributo exitoso
	 * @return El exitoso asociado a la clase
	 */
	public boolean isExitoso() {
		return exitoso;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo exitoso
	 * @param exitoso El nuevo exitoso a modificar.
	 */
	public void setExitoso(boolean exitoso) {
		this.exitoso = exitoso;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo mensajeError
	 * @return El mensajeError asociado a la clase
	 */
	public String getMensajeError() {
		return mensajeError;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo mensajeError
	 * @param mensajeError El nuevo mensajeError a modificar.
	 */
	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}
	
	

}
