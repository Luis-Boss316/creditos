import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {FrecuenciaPagoComponent} from "./frecuencia-pago/frecuencia-pago.component";
import {ProductoFinancieroComponent} from "./producto-financiero/producto-financiero.component";

const routes: Routes = [
  {path: '', redirectTo: 'FrecuenciaPago', pathMatch: 'full'},
  {path: 'FrecuenciaPago', component: FrecuenciaPagoComponent},
  {path: 'Producto-Financiero', component: ProductoFinancieroComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProductoFinancieroRoutingModule { }
