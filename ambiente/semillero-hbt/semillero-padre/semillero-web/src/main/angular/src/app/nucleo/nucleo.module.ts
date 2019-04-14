import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { CapaComponent } from './capa/capa.component';
import { EncabezadoComponent } from './capa/encabezado/encabezado.component';
import { PrincipalComponent } from './capa/principal/principal.component';
import { PiePaginaComponent } from './capa/pie-pagina/pie-pagina.component';
import { CreacionPersonasComponent } from './capa/principal/creacion-personas/creacion-personas.component';
import { ApoyoComponent } from './capa/principal/apoyo/apoyo.component';
<<<<<<< HEAD
import { FormsModule } from '@angular/forms';
import { GestionVehiculosComponent } from './capa/principal/gestion_vehiculos/gestion_vehiculos.component';
import { FiltrosComponent } from './capa/principal/gestion_vehiculos/filtros/filtros.component';
import { ResultadosComponent } from './capa/principal/gestion_vehiculos/resultados/resultados.component';
import { ConsultaVehiculosService } from './servicios/consulta-vehiculos-servicio/consulta.vehiculo.service';
import { EditarVehiculosComponent } from './capa/principal/apoyo/editar-vehiculos/editar-vehiculos.component';
import { BorrarVehiculosComponent } from './capa/principal/apoyo/borrar-vehiculos/borrar-vehiculos.component';
import { ConsultarVehiculosComponent } from './capa/principal/apoyo/consultar-vehiculos/consultar-vehiculos.component'
=======

//ngModel
import { FormsModule } from '@angular/forms';
>>>>>>> 7959e60e1c181aa30ee41019baa96387c229d519

//Nucleo representa al modulo que va a contener los componentes que van a orquestar la aplicacion 
//Debe ser importado en el componente principal AppModule
@NgModule({
<<<<<<< HEAD
  declarations: [CapaComponent, EncabezadoComponent, PrincipalComponent, PiePaginaComponent, CreacionPersonasComponent, ApoyoComponent, GestionVehiculosComponent, FiltrosComponent, ResultadosComponent, EditarVehiculosComponent, BorrarVehiculosComponent, ConsultarVehiculosComponent],
=======
  declarations: [CapaComponent, EncabezadoComponent, PrincipalComponent, PiePaginaComponent, CreacionPersonasComponent, ApoyoComponent],
>>>>>>> 7959e60e1c181aa30ee41019baa96387c229d519
  imports: [
    CommonModule,RouterModule,FormsModule
  ],
  exports: [
  	CapaComponent
  ],
  providers: [
      ConsultaVehiculosService
  ]
})
export class NucleoModule { }
