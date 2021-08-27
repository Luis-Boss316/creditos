import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ProspectoComponent} from "./prospecto/prospecto.component";

const routes: Routes = [
  {path: '', redirectTo: 'Prospecto', pathMatch: 'full'},
  {path: 'Prospecto', component: ProspectoComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProspectosRoutingModule { }
