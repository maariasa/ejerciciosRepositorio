/**
 * PruebaApp.java
 */
package animales;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Cindy Johanna Castaño Yepes <Mateo Arias Ávila@heinsohn.com.co>
 * @version 
 */
public class PruebaApp {
	public static void main(String args[]) {
		animal gato = new Gato("Rojo", 5, "Boris");
		//new gato("Rojo", 5, "Boris");
		animal perro = new Perro("Gris", 2, "Yepes");
		//animal pajaro = new Pajaro("Azul", 3, "Pajaro");
		
		animal[] Animales = new animal[2];
		Animales[0] = gato;
		Animales[1] = perro;
		//Animales[2] = pajaro;
		
		//Uso del polimorfismo, reutiliza codigo
		//el resultado sera el mismo que poner las instrucciones para cada individuo (gato y perro)
		for (animal animal : Animales) {
			System.out.println(animal.getNombre());
			System.out.println(animal.mostrarSonido());
			System.out.println(animal.mostrarNombreYColor());
			System.out.println("--");
		}
		
		
	}
}
