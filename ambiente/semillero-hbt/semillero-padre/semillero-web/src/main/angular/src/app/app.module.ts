import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule} from '@angular/http';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NucleoModule } from './nucleo/nucleo.module';
import { FormsModule } from '@angular/forms';

import { APP_BASE_HREF } from '@angular/common';

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NucleoModule,
    HttpModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [
  	{ provide: APP_BASE_HREF, useValue: '/SemilleroHBT' }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
