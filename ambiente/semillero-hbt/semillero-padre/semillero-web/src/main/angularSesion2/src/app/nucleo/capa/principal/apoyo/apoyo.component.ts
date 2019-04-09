import { Component, OnInit } from '@angular/core';

//Modelo de datos
import {PersonaDTO} from './modelo/PersonaDTO'

@Component({
  selector: 'app-apoyo',
  templateUrl: './apoyo.component.html'
})
export class ApoyoComponent implements OnInit {
	
  public persona : PersonaDTO;

  public personas: PersonaDTO[];

  public mostrarFormulario:boolean;

  constructor() { }

  ngOnInit() {
	//Aca se inicializan todos los campos
	this.persona = {
		id : '0',
		nombre : '',
		apellido : '',
		tipoIdentificacion : '',
		numeroIdentificacion : '',
		mayorEdad : false, //SE PONE UN CHECKBOX (type="checkbox")
		sexo : '' //RADIO BUTTON (type="ratio")
	};

	this.personas = [];
	this.mostrarFormulario = true;
  }

  public mostrar(){

  }

  public ocultar(){

  }

  public guardar(){
     //Se usa el metodo push
     this.personas.push(this.persona);
     console.log('guardar()' + this.persona.nombre); //Esto no se coloca!!!
  }

  private borrar(){

  }

}
