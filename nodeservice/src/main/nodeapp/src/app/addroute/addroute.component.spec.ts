import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddrouteComponent } from './addroute.component';

describe('AddrouteComponent', () => {
  let component: AddrouteComponent;
  let fixture: ComponentFixture<AddrouteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddrouteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddrouteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
