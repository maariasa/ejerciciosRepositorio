import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-creacion-persona',
  templateUrl: './creacion-persona.component.html',
  styleUrls: ['./creacion-persona.component.css']
})
export class CreacionPersonaComponent implements OnInit {
	

  constructor() { 
	    public idPersona: number,
        public idNumero number,
        public idTipo: number,
        public nombrePersona: string,
        public apellidoPersona: string}

  ngOnInit() {
  }

}
