/**
 * animal.java
 */
package animales;

import ejemplosDiaDos.pruebainterfaz;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Cindy Johanna Castaño Yepes <Mateo Arias Ávila@heinsohn.com.co>
 * @version 
 */
public abstract class animal implements pruebainterfaz{
	public String color;
	
	public int peso;
	
	public String nombre;
	
	
	
	/**
	 * Constructor de la clase.
	 * @param color
	 * @param peso
	 * @param nombre
	 */
	
	/*
	public animal(String color, int peso, String nombre) {
		super();
		this.color = color;
		this.peso = peso;
		this.nombre = nombre;
	}
	*/
	
	public abstract String mostrarSonido();
	
	public String mostrarNombreYColor() {
		return nombre + "" + color;
	}
	
	/*
	public String mostrarSonido() {
		return "";
	}
	*/


	/**
	 * Metodo encargado de retornar el valor del atributo color
	 * @return El color asociado a la clase
	 */
	public String getColor() {
		return color;
	}



	/**
	 * Metodo encargado de modificar el valor del atributo color
	 * @param color El nuevo color a modificar.
	 */
	public void setColor(String color) {
		this.color = color;
	}



	/**
	 * Metodo encargado de retornar el valor del atributo peso
	 * @return El peso asociado a la clase
	 */
	public int getPeso() {
		return peso;
	}



	/**
	 * Metodo encargado de modificar el valor del atributo peso
	 * @param peso El nuevo peso a modificar.
	 */
	public void setPeso(int peso) {
		this.peso = peso;
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
