import { Component, OnInit } from '@angular/core';
import { Node } from '../node.model';
import { NodeService } from '../node.service';

@Component({
  selector: 'app-mapview',
  templateUrl: './mapview.component.html',
  styleUrls: ['./mapview.component.css']
})
export class MapviewComponent implements OnInit {

  routes;
  constructor(private nodeService: NodeService){
  }

  latitude = 37.729300; 
  longitude = -121.929133;

  
  ngOnInit() {
    this.nodeService.getRouteData().subscribe(data => this.routes = data);
  }
  
}
