import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Liststudent } from './liststudent';

describe('Liststudent', () => {
  let component: Liststudent;
  let fixture: ComponentFixture<Liststudent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Liststudent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Liststudent);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
