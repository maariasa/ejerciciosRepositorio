/**
 * ClasePrueba.java
 */
package ejemplosDiaDos;

//Esta documentacion se genera escribiendo "/**" y presionando ENter

/**
 * 
 * <b>Descripción:<b> Esta clase es de prueba
 * <b>Caso de Uso:<b> 
 * @author Cindy Johanna Castaño Yepes <Mateo Arias Ávila@heinsohn.com.co>
 * @version
 */
public class ClasePrueba {
	/**
	 * Valor de la clase
	 */
	private int valor; //atributo
	//private static final int CONSTANTE = 10;
	
	/**
	 * Constructor de la clase.
	 * @param valor
	 */
	public ClasePrueba(int valor) { //Constructor
		super();
		this.valor = valor;
	}
	
	int obtenervalor() { //metodo
		return 0;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo valor
	 * @return El valor asociado a la clase
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo valor
	 * @param valor El nuevo valor a modificar.
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	
}
