package com.hbt.semillero.servicios.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.entidades.Linea;
import com.hbt.semillero.entidades.Marca;
import com.hbt.semillero.dto.MarcaDTO;
import com.hbt.semillero.dto.PersonaDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.dto.LineaDTO;
import com.hbt.semillero.servicios.interfaces.IConsultasBeanLocal;

/**
 * ServiciosRest.java
 */

/**
 * <b>Descripción:<b> Clase que determina los Servicios REST de la Aplicación
 * @version 
 */

@Path("/ServiciosRest")
public class ServiciosRest {
	
	@EJB
	private IConsultasBeanLocal consultasBean;
	
	/**
	 * 
	 * Metodo encargado de consultar las marcas con sus respectivos atributos
	 * 
	 * @return
	 */
	@GET
	@Path("/consultarMarcas")
	@Produces(MediaType.APPLICATION_JSON)
	public List<MarcaDTO> consultarMarcas(){
		List<Marca> marcas = consultasBean.consultarMarcas();
		List<MarcaDTO> retorno = new ArrayList<>();
		for (Marca marca : marcas) {
			MarcaDTO marcaDTO = new MarcaDTO();
			marcaDTO.setIdMarca(marca.getIdMarca());
			marcaDTO.setNombre(marca.getNombre());
			retorno.add(marcaDTO);
		}
		return retorno;
		
	}
	
	/**
	 * 
	 * Metodo encargado de consultar las líneas de automóviles con sus respectivos atributos
	 * 
	 * @return
	 */
	@GET
	@Path("/consultarLineas")
	@Produces(MediaType.APPLICATION_JSON)
	public List<LineaDTO> consultarLineas(@QueryParam(value = "idMarca") Long idMarca){
		List<Linea> lineas = consultasBean.consultarLineas(idMarca);
		List<LineaDTO> retorno = new ArrayList<>();
		for (Linea linea : lineas) {
			LineaDTO lineaDTO = new LineaDTO();
			lineaDTO.setIdLinea(linea.getIdLinea());
			lineaDTO.setCilindraje(linea.getCilindraje());
			lineaDTO.setNombre(linea.getNombre());
			MarcaDTO marcaDTO = construirMarcaDTO(linea.getMarca());
			lineaDTO.setMarca(marcaDTO);
			retorno.add(lineaDTO);
		}
		return retorno;
		
	}
	
	
	/**
	 * 
	 * Metodo encargado de mostrar un mensaje de error, en caso de no poderse ingresar la persona
	 * @param personaDTO
	 * @return
	 */
	@POST
	@Path("/crearPersona")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO crearPersona(PersonaDTO personaDTO) {
		ResultadoDTO retorno = new ResultadoDTO();
		retorno.setExitoso(true);
		try {
			consultasBean.crearPersona(personaDTO);
		} catch(Exception e) {
			retorno.setExitoso(true);
			retorno.setMensajeError("No se pudo ingresar la persona");
		}
		return retorno;
	}
	
	/**
	 * 
	 * Metodo encargado de construir los atributos en MarcaDTO
	 * 
	 * @return
	 */
	
	private MarcaDTO construirMarcaDTO(Marca marca) {
		MarcaDTO marcaDTO = new MarcaDTO();
		marcaDTO.setIdMarca(marca.getIdMarca());
		marcaDTO.setNombre(marca.getNombre());
		return marcaDTO;
	}
	
	
	/**
	 * 
	 * Metodo encargado de mostrar un mensaje de error en caso de no modificar la persona
	 * 
	 * @param personaDTO
	 * @return
	 */
	@POST
	@Path("/editarPersona")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO editarPersona(PersonaDTO personaDTO) {
		ResultadoDTO retorno = new ResultadoDTO();
		retorno.setExitoso(true);
		try {
			consultasBean.editarPersona(personaDTO);
		} catch(Exception e) {
			retorno.setExitoso(true);
			retorno.setMensajeError("No se pudo modificar la persona");
		}
		return retorno;
	}
	
}



