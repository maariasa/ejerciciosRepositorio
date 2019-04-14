import { TestBed } from '@angular/core/testing';

import { BorrarVehiculosService } from './borrar-vehiculos.service';

describe('BorrarVehiculosService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BorrarVehiculosService = TestBed.get(BorrarVehiculosService);
    expect(service).toBeTruthy();
  });
});
