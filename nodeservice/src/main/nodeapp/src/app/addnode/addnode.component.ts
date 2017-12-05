import { Component, OnInit } from '@angular/core';
import { Node } from '../node.model';
import { NodeService } from '../node.service';

@Component({
  selector: 'app-addnode',
  templateUrl: './addnode.component.html',
  styleUrls: ['./addnode.component.css']
})
export class AddnodeComponent implements OnInit {

  title = 'Node App';
  nodes;
  model = new Node();
  constructor(private nodeService: NodeService){
  }

  ngOnInit() {
  }
  
  get currentNode(){
        return JSON.stringify(this.model);
  }
  
  submitData(){
        this.nodeService.insertData(this.currentNode);
  }

}
