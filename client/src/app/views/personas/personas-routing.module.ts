import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {PersonaComponent} from "./persona/persona.component";

const routes: Routes = [
  {path: '', redirectTo: 'Persona', pathMatch: 'full'},
  {path: 'Persona', component: PersonaComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PersonasRoutingModule { }
