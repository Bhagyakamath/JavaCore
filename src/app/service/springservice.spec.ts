import { TestBed } from '@angular/core/testing';

import { Springservice } from './springservice';

describe('Springservice', () => {
  let service: Springservice;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Springservice);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
