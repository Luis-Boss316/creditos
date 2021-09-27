import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {SolicitudesComponent} from "./solicitudes/solicitudes.component";

const routes: Routes = [
  {path: '', redirectTo: 'Solicitudes', pathMatch: 'full'},
  {path: 'Solicitudes', component: SolicitudesComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SolicitudRoutingModule { }
