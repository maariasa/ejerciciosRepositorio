import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EncabezadoComponent } from './capa/encabezado/encabezado.component';
import { MainComponent } from './capa/main/main.component';
import { PiepaginaComponent } from './capa/piepagina/piepagina.component';
import { CapaComponent } from './capa/capa.component';
import { CreacionPersonaComponent } from './capa/main/creacion-persona/creacion-persona.component';
import { ApoyoComponent } from './capa/principal/apoyo/apoyo.component';

@NgModule({
  declarations: [EncabezadoComponent, MainComponent, PiepaginaComponent, CapaComponent, CreacionPersonaComponent, ApoyoComponent],
  imports: [
    CommonModule
  ],
  exports:[CapaComponent]
})
export class NucleoModule { }
