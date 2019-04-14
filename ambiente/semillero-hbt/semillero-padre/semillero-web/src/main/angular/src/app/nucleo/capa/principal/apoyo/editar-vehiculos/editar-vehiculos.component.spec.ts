import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditarVehiculosComponent } from './editar-vehiculos.component';

describe('EditarVehiculosComponent', () => {
  let component: EditarVehiculosComponent;
  let fixture: ComponentFixture<EditarVehiculosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditarVehiculosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditarVehiculosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
