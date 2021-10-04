import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {SolicitudesComponent} from "./solicitudes/solicitudes.component";
import {CreditoSimpleComponent} from "./credito-simple/credito-simple.component";

const routes: Routes = [
  {path: '', redirectTo: 'Solicitudes', pathMatch: 'full'},
  {path: 'Solicitudes', component: SolicitudesComponent},
  {path: 'CreditoSimple', component: CreditoSimpleComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SolicitudRoutingModule { }
