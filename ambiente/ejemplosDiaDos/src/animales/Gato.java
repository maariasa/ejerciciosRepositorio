/**
 * Gato.java
 */
package animales;

import ejemplosDiaDos.pruebainterfaz;
/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Cindy Johanna Castaño Yepes <Mateo Arias Ávila@heinsohn.com.co>
 * @version 
 */
public class Gato extends animal implements pruebainterfaz{

	/**
	 * Constructor de la clase.
	 * @param color
	 * @param peso
	 * @param nombre
	 */
	public Gato(String color, int peso, String nombre) {
		setColor(color);
		setPeso(peso);
		setNombre(nombre);
	}
	
	@Override
	public String mostrarSonido() {
		return "ronronear";
	}

	/** 
	 * @see ejemplosDiaDos.pruebainterfaz#realizarAccion()
	 */
	@Override
	public String realizarAccion() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
