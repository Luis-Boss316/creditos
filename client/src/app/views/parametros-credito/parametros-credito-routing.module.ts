import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DestinosCreditoComponent} from "./destinos-credito/destinos-credito.component";
import {TiposCreditoComponent} from "./tipos-credito/tipos-credito.component";
import {TiposGarantiaComponent} from "./tipos-garantia/tipos-garantia.component";
import {TasasReferenciasComponent} from "./tasas-referencias/tasas-referencias.component";
import {ValoresTasaReferenciaComponent} from "./valores-tasa-referencia/valores-tasa-referencia.component";
import {FuentesFondeoComponent} from "./fuentes-fondeo/fuentes-fondeo.component";
import {PeritosComponent} from "./peritos/peritos.component";
import {CirculoCreditoComponent} from "./circulo-credito/circulo-credito.component";
import {BuroCreditoComponent} from "./buro-credito/buro-credito.component";
import {NotariosComponent} from "./notarios/notarios.component";

const routes: Routes = [
  { path: '', redirectTo: 'DestinosCredito', pathMatch: 'full' },
  { path: 'DestinosCredito', component: DestinosCreditoComponent },
  { path: 'TiposCredito', component: TiposCreditoComponent },
  { path: 'TiposGarantia', component: TiposGarantiaComponent },
  { path: 'TasasReferencias', component: TasasReferenciasComponent },
  { path: 'ValoresTasasReferencia', component: ValoresTasaReferenciaComponent },
  { path: 'FuentesFondeo', component: FuentesFondeoComponent },
  { path: 'Notarios', component: NotariosComponent },
  { path: 'Peritos', component: PeritosComponent },
  { path: 'BuroCredito', component: BuroCreditoComponent },
  { path: 'CirculoCredito', component: CirculoCreditoComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ParametrosCreditoRoutingModule { }
