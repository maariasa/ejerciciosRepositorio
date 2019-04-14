import { Component, OnInit } from '@angular/core';
<<<<<<< HEAD
import { PersonaDTO } from  './modelo/PersonaDTO' 
=======

//Modelo de datos
import {PersonaDTO} from './modelo/PersonaDTO'
>>>>>>> 7959e60e1c181aa30ee41019baa96387c229d519

@Component({
  selector: 'app-apoyo',
  templateUrl: './apoyo.component.html'
})
export class ApoyoComponent implements OnInit {
<<<<<<< HEAD
  
  public mostrarFormulario:boolean;
  
  public persona: PersonaDTO;
  public personas: PersonaDTO[];
  
  constructor() { }

  public ngOnInit() {
  	this.mostrarFormulario = true;
  	this.persona = {
        id: '0',
		nombre: '',
		apellido: '',
		tipoIdentificacion: '',
		numeroIdentificacion: '',
		mayorEdad:false,
		sexo:'',
    };
    this.personas = [];
  }

  mostrar(){
  	this.mostrarFormulario = true;
  }
  
  ocultar(){
  	this.mostrarFormulario = false;
  }
  
  public guardar() {
  	console.log('guardando....' + this.persona.nombre);
    this.personas.push(this.persona);
    console.log('cantidad de personas....' + this.personas.length);
    
  }
  public borrar(persona: PersonaDTO) {
  	console.log('borrando....');
    this.personas = this.personas.filter(p => p.nombre !== persona.nombre);
     
  }
  
  
=======
	
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

>>>>>>> 7959e60e1c181aa30ee41019baa96387c229d519
}
