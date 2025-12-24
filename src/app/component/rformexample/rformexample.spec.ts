import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Rformexample } from './rformexample';

describe('Rformexample', () => {
  let component: Rformexample;
  let fixture: ComponentFixture<Rformexample>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Rformexample]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Rformexample);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
