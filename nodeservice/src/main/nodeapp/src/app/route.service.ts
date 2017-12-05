import { Injectable } from '@angular/core';
import {Http, Response, Headers, RequestOptions} from "@angular/http";
import 'rxjs/add/operator/map';
import {Observable} from 'rxjs/Observable';
import {Route} from './route.model';
import {Router} from '@angular/router';

@Injectable()
export class RouteService {

  constructor (
    private http: Http,private router : Router
  ) {}

  getRoutes():Observable<Route[]> {
    return this.http.get("http://localhost:8000/routelist")
    .map((res:Response) => res.json());
  }


}