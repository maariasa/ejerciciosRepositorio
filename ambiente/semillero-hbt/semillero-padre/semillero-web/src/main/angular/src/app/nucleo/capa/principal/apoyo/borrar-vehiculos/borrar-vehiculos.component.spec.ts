import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BorrarVehiculosComponent } from './borrar-vehiculos.component';

describe('BorrarVehiculosComponent', () => {
  let component: BorrarVehiculosComponent;
  let fixture: ComponentFixture<BorrarVehiculosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BorrarVehiculosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BorrarVehiculosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
