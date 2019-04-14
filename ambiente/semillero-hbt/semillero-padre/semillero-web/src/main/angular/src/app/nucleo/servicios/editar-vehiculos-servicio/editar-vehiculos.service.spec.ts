import { TestBed } from '@angular/core/testing';

import { EditarVehiculosService } from './editar-vehiculos.service';

describe('EditarVehiculosService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: EditarVehiculosService = TestBed.get(EditarVehiculosService);
    expect(service).toBeTruthy();
  });
});
