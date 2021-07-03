import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ActEconomicasBanxicoComponent} from "./act-economicas-banxico/act-economicas-banxico.component";
import {SectoresBanxicoComponent} from "./sectores-banxico/sectores-banxico.component";
import {LocalidadesBanxicoComponent} from "./localidades-banxico/localidades-banxico.component";
import {ActividadesEconomicasFIRAComponent} from "./actividades-economicas-fira/actividades-economicas-fira.component";
import {ActEcoCNBVComponent} from "./act-eco-cnbv/act-eco-cnbv.component";
import {ClavesLadaComponent} from "./claves-lada/claves-lada.component";
import {InstitucionesYcontrapartesComponent} from "./instituciones-ycontrapartes/instituciones-ycontrapartes.component";
import {SectoresEconomicosComponent} from "./sectores-economicos/sectores-economicos.component";

const routes: Routes = [
  { path: '', redirectTo: 'ActEconomicasBanxico', pathMatch: 'full' },
  { path: 'ActEconomicasBanxico', component: ActEconomicasBanxicoComponent },
  { path: 'SectoresBanxico', component: SectoresBanxicoComponent },
  { path: 'LocalidadesBanxico', component: LocalidadesBanxicoComponent },
  { path: 'ActEconomicasFira', component: ActividadesEconomicasFIRAComponent },
  { path: 'ActEconomicasCNBV', component: ActEcoCNBVComponent },
  { path: 'ClavesLada', component: ClavesLadaComponent },
  { path: 'InstitucionesYContrapartes', component: InstitucionesYcontrapartesComponent },
  { path: 'SectoresEconomicos', component: SectoresEconomicosComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CatalogosOficialesRoutingModule { }
