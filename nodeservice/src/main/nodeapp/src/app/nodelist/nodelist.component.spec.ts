import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NodelistComponent } from './nodelist.component';

describe('NodelistComponent', () => {
  let component: NodelistComponent;
  let fixture: ComponentFixture<NodelistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NodelistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NodelistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
