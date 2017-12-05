import { Injectable } from '@angular/core';
import {Http, Response, Headers, RequestOptions} from "@angular/http";
import 'rxjs/add/operator/map';
import {Observable} from 'rxjs/Observable';
import {Node} from './node.model';
import {Router} from '@angular/router';

@Injectable()
export class NodeService {

  constructor (
    private http: Http,private router : Router
  ) {}

  getNodes():Observable<Node[]> {
    return this.http.get("http://localhost:8000/nodes")
    .map((res:Response) => res.json());
  }

  insertData(postBody){
        var headers = new Headers();
        headers.append('Content-Type','application/json');
        headers.append('Access-Control-Allow-Origin','*');
        var postdata = this.http.post('http://localhost:8000/nodes/createNode',postBody,{headers:headers});
        var spostdata = postdata.subscribe();
        this.router.navigateByUrl('/nodelist');
  }
  
  getRouteData():Observable<Node[]>{
    return this.http.get("http://localhost:8000/routes")
    .map((res:Response) => res.json());
  }
  
    getNodesByRoute(rId):Observable<Node[]>{
    return this.http.get("http://localhost:8000/nodelist/"+rId)
    .map((res:Response) => res.json());
  }
  
}