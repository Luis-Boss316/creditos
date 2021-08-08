import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {NegocioComponent} from "./negocio/negocio.component";

const routes: Routes = [
  {path: '', redirectTo: 'Negocio', pathMatch: 'full'},
  {path: 'Negocio', component: NegocioComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class NegociosRoutingModule { }
