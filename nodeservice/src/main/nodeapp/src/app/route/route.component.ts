import { Component, OnInit } from '@angular/core';
import { Route } from '../route.model';
import { RouteService } from '../route.service';

@Component({
  selector: 'app-route',
  templateUrl: './route.component.html',
  styleUrls: ['./route.component.css']
})
export class RouteComponent implements OnInit {

  routes;

  constructor(private routeService: RouteService) { }
  
  loadRoutes(){
    this.routeService.getRoutes().subscribe(data => this.routes = data);
  }

  ngOnInit() {
    this.loadRoutes();
  }

}
