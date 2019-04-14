import { Component, OnInit } from '@angular/core';
//import { VehiculoDTO } from '../../capa/principal/gestion_vehiculos/modelo/vehiculoDTO';
@Component({
  selector: 'app-borrar-vehiculos',
  templateUrl: './borrar-vehiculos.component.html'
})
export class BorrarVehiculosComponent implements OnInit {

  //vehiculo : vehiculoDTO[];

  //constructor() { }

  ngOnInit() {
  }
/*
  deleteProduct(id) {
  this.isLoadingResults = true;
  this.api.deleteProduct(id)
    .subscribe(res => {
        this.isLoadingResults = false;
        this.router.navigate(['/products']);
      }, (err) => {
        console.log(err);
        this.isLoadingResults = false;
      }
    );
}*/

}
