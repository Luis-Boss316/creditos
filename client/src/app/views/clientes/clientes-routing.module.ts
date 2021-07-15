import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ClientesComponent} from "./clientes/clientes.component";

const routes: Routes = [
  { path: '', redirectTo: 'Clientes', pathMatch: 'full' },
  { path: 'Clientes', component: ClientesComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ClientesRoutingModule { }
