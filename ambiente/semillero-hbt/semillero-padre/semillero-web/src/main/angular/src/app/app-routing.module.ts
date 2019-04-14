import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
<<<<<<< HEAD
import { CreacionPersonasComponent } from './nucleo/capa/principal/creacion-personas/creacion-personas.component';
import { ApoyoComponent } from './nucleo/capa/principal/apoyo/apoyo.component';
import { GestionVehiculosComponent } from './nucleo/capa/principal/gestion_vehiculos/gestion_vehiculos.component';
import { EditarVehiculosComponent } from './nucleo/capa/principal/apoyo/editar-vehiculos/editar-vehiculos.component';
import { BorrarVehiculosComponent } from './nucleo/capa/principal/apoyo/borrar-vehiculos/borrar-vehiculos.component';

=======
import { CreacionPersonasComponent } from './nucleo/capa/principal/creacion-personas/creacion-personas.component'
import { ApoyoComponent } from './nucleo/capa/principal/apoyo/apoyo.component'
>>>>>>> 7959e60e1c181aa30ee41019baa96387c229d519
const routes: Routes = [
	{   path: 'personas-crear',
	    component: CreacionPersonasComponent
  	},
<<<<<<< HEAD
  	{   path: 'componente-apoyo',
	    component: ApoyoComponent
  	},
  	{   path: 'vehiculos-gestion',
	    component: GestionVehiculosComponent
  	},

		{
			path: 'editar-vehiculos',
			component: EditarVehiculosComponent
		},

		{
			path: 'borrar-vehiculos',
			component: BorrarVehiculosComponent
		}

=======
    {   path: 'componente-apoyo',
        component: ApoyoComponent
      }
>>>>>>> 7959e60e1c181aa30ee41019baa96387c229d519
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
