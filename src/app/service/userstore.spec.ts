import { TestBed } from '@angular/core/testing';

import { Userstore } from './userstore';

describe('Userstore', () => {
  let service: Userstore;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Userstore);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
