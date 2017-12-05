import { Component, OnInit } from '@angular/core';
import { Node } from '../node.model';
import { NodeService } from '../node.service';
import { ActivatedRoute,Params } from '@angular/router';

@Component({
  selector: 'app-nodelist',
  templateUrl: './nodelist.component.html',
  styleUrls: ['./nodelist.component.css']
})
export class NodelistComponent implements OnInit {

  nodes;
  rId:string;
  routes;
  model = new Node();
  latitude;
  longitude;
  constructor(private nodeService: NodeService,private route: ActivatedRoute){
  }
    

  loadNodes() {
    this.nodeService.getNodes().subscribe(data => this.nodes = data);
  }
  
  loadMap(){
  this.nodeService.getRouteData().subscribe(data => this.routes = data)
  }
  
  
   ngOnInit(){ 
   console.log("this is for debug"); 
   this.route.params.subscribe(params=>this.rId=params['id']);
   this.nodeService.getNodesByRoute(this.rId).subscribe(data => this.nodes = data);
   this.route.params.subscribe((params: Params) => {
        this.latitude = params['snlat'];
      });
      this.route.params.subscribe((params: Params) => {
        this.longitude = params['snlong'];
      });
   this.latitude = Number(this.latitude);  
   this.longitude = Number(this.longitude); 
   this.loadMap();
  }

}
