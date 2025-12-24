import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Mathtable } from './mathtable';

describe('Mathtable', () => {
  let component: Mathtable;
  let fixture: ComponentFixture<Mathtable>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Mathtable]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Mathtable);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
