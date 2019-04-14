import { Component, OnInit } from '@angular/core';
//import { VehiculoDTO } from '../../capa/principal/gestion_vehiculos/modelo/vehiculoDTO';

/*Componente que se encarga de la consulta de vehículos*/
@Component({
  selector: 'app-consultar-vehiculos',
  templateUrl: './consultar-vehiculos.component.html'
})
export class ConsultarVehiculosComponent implements OnInit {
  //public vehiculo : vehiculoDTO;
  constructor() { }

  ngOnInit() {
  }

  /*Funcion que permite obtener los vehiculos guardados en un Array*/
  getVehiculos(): void {
//    this.editarVehiculosService.getVehiculos().subscribe(vehiculos => this.vehiculo = vehiculos);
  }

}
