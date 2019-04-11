/**
 * IConsultasBeanLocal.java
 */
package com.hbt.semillero.servicios.interfaces;

import java.util.List;

import javax.ejb.Local;

import com.hbt.semillero.dto.PersonaDTO;
import com.hbt.semillero.entidades.Linea;
import com.hbt.semillero.entidades.Marca;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Cindy Johanna Castaño Yepes <Mateo Arias Ávila@heinsohn.com.co>
 * @version 
 */

@Local
public interface IConsultasBeanLocal {
	
	public List<Marca> consultarMarcas();
	
	public List<Linea> consultarLineas(Long idMarca);

	/**
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author Cindy Johanna Castaño Yepes <Mateo Arias Ávila@heinsohn.com.co>
	 * 
	 * @param personaDTO
	 */
	public void crearPersona(PersonaDTO personaDTO);

	/**
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author Cindy Johanna Castaño Yepes <Mateo Arias Ávila@heinsohn.com.co>
	 * 
	 * @param personaDTO
	 */
	public void editarPersona(PersonaDTO personaDTO);

}


/**
Debug PERMITE SABER SI LINEA A LINEA SI HAY ERRORES EN EL CODIGO
IDENTIFICAR EL PUERTO PARA ESTAR CONSCIENTE DE LOS DEBUG
\bin\standalone - se revisa con el bloc de notas
**/