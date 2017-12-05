import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http'
import { FormsModule } from '@angular/forms'
import { AppComponent } from './app.component';
import { NodeService } from './node.service';
import { RouteService } from './route.service';
import { AddnodeComponent } from './addnode/addnode.component';
import { RouterModule, Routes } from '@angular/router';
import { NodelistComponent } from './nodelist/nodelist.component';
import { MapviewComponent } from './mapview/mapview.component';
import { AgmCoreModule,GoogleMapsAPIWrapper } from '@agm/core';
import { RouteComponent } from './route/route.component';
import { AddrouteComponent } from './addroute/addroute.component';

const appRoutes: Routes = [
   { path: 'addnode', component: AddnodeComponent},
   { path: 'nodelist/:id/:snlat/:snlong', component: NodelistComponent},
   { path: 'mapview', component: MapviewComponent},
   { path: 'routelist', component: RouteComponent},
   { path: 'addroute', component: AddrouteComponent},
   { path: '**', component: RouteComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    AddnodeComponent,
    NodelistComponent,
    MapviewComponent,
    RouteComponent,
    AddrouteComponent
  ],
  imports: [
    FormsModule,
    BrowserModule,
    RouterModule.forRoot(appRoutes),
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyA9RmP8-B8eElZpuL9KRVXW2knB_rSj2cg'
    }),
    HttpModule
  ],
  providers: [
    NodeService,
    RouteService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
