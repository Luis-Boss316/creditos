import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {UsuarioComponent} from "./usuario/usuario.component";
import {ArchivosComponent} from "./archivos/archivos.component";

const routes: Routes = [
  { path: '', redirectTo: 'Usuario', pathMatch: 'full' },
  { path: 'Usuario', component: UsuarioComponent },
  { path: 'Archivos', component: ArchivosComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class UsuarioRoutingModule { }
