import { Component, OnInit } from '@angular/core';
import { Route } from '../route.model';

@Component({
  selector: 'app-addroute',
  templateUrl: './addroute.component.html',
  styleUrls: ['./addroute.component.css']
})
export class AddrouteComponent implements OnInit {

  model = new Route();

  constructor() { }

  ngOnInit() {
  }

}
