/**
 * Perro.java
 */
package animales;

import ejemplosDiaDos.pruebainterfaz;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Cindy Johanna Castaño Yepes <Mateo Arias Ávila@heinsohn.com.co>
 * @version 
 */
public class Perro extends animal implements pruebainterfaz{

	/** 
	 * @see ejemplosDiaDos.pruebainterfaz#realizarAccion()
	 */
	public Perro(String color, int peso, String nombre) {
		setColor(color);
		setPeso(peso);
		setNombre(nombre);
	}
	
	@Override
	public String realizarAccion() {
		// TODO Auto-generated method stub
		return "muerda!";
	}

	/** 
	 * @see animales.animal#mostrarSonido()
	 */
	@Override
	public String mostrarSonido() {
		// TODO Auto-generated method stub
		return "guauguau";
	}

	/**
	 * Constructor de la clase.
	 * @param color
	 * @param peso
	 * @param nombre
	 */
	
	
}
