import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EncabezadoComponent } from './nucleo/capa/encabezado/encabezado.component';
import { MainComponent } from './nucleo/capa/main/main.component';
import { PiepaginaComponent } from './nucleo/capa/piepagina/piepagina.component';
import { CapaComponent } from './nucleo/capa/capa.component';


const routes: Routes = [
	{ 
		path: 'encabezado', 
		component: EncabezadoComponent,
		data: { title: 'Encabezado' }
	},
	
	{ 
		path: 'main',
	    component: MainComponent,
        data: { title: 'Main' } 
    },

    {
        path: 'pie-pagina',
        component: PiepaginaComponent,
        data: { title: 'Pie de Pagina' }
    },

    {
        path: 'capa',
        component: CapaComponent,
        data: { title: 'Capa' }
    },

    { 
	    path: '',
        redirectTo: '/heroes',
        pathMatch: 'full'
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
