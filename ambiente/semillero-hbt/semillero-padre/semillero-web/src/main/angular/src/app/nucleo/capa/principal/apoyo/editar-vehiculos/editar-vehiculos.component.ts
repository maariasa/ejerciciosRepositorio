import { Component, OnInit } from '@angular/core';
//import { VehiculoDTO } from '../../capa/principal/gestion_vehiculos/modelo/vehiculoDTO';
//import { EditarVehiculosService } from '../../servicios/editar-vehiculos-servicio/editar-vehiculos.service';

/*Componente enfocado a la funcionalidad de Editar Vehículos*/
@Component({
  selector: 'app-editar-vehiculos',
  templateUrl: './editar-vehiculos.component.html'
})
export class EditarVehiculosComponent implements OnInit {
  //public vehiculo : vehiculoDTO;
  constructor(/*private editarVehiculosService : EditarVehiculosService*/) { }

  ngOnInit() {
    this.getVehiculos();
  }
  /*Funcion que permite obtener los vehiculos guardados en un Array*/
  getVehiculos(): void {
//    this.editarVehiculosService.getVehiculos().subscribe(vehiculos => this.vehiculo = vehiculos);
  }

}
