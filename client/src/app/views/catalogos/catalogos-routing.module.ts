import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {AseguradorasComponent} from "./aseguradoras/aseguradoras.component";
import {CiudadesComponent} from "./ciudades/ciudades.component";
import {CoberturasGeograficasComponent} from "./coberturas-geograficas/coberturas-geograficas.component";
import {EstadoCivilComponent} from "./estado-civil/estado-civil.component";
import {EstadosComponent} from "./estados/estados.component";
import {GiroEmpresarialComponent} from "./giro-empresarial/giro-empresarial.component";
import {MonedasComponent} from "./monedas/monedas.component";
import {MunicipiosComponent} from "./municipios/municipios.component";
import {NacionalidadesComponent} from "./nacionalidades/nacionalidades.component";
import {OcupacionesComponent} from "./ocupaciones/ocupaciones.component";
import {OrigenIngresosComponent} from "./origen-ingresos/origen-ingresos.component";
import {OrigenRecursosComponent} from "./origen-recursos/origen-recursos.component";
import {PaisesComponent} from "./paises/paises.component";
import {ParticipesComponent} from "./participes/participes.component";
import {PeriodicidadesComponent} from "./periodicidades/periodicidades.component";
import {ProfesionesComponent} from "./profesiones/profesiones.component";
import {PuestosEmpleosComponent} from "./puestos-empleos/puestos-empleos.component";
import {RegimenMatrimonialComponent} from "./regimen-matrimonial/regimen-matrimonial.component";
import {TipoImpuestosComponent} from "./tipo-impuestos/tipo-impuestos.component";
import {TipoPersonaComponent} from "./tipo-persona/tipo-persona.component";
import {TipoAsentamientosComponent} from "./tipo-asentamientos/tipo-asentamientos.component";
import {TiposBeneficiarioComponent} from "./tipos-beneficiario/tipos-beneficiario.component";
import {TiposDomiciliosComponent} from "./tipos-domicilios/tipos-domicilios.component";
import {TipoSeguroComponent} from "./tipo-seguro/tipo-seguro.component";
import {TiposEmpleosComponent} from "./tipos-empleos/tipos-empleos.component";
import {TiposIdentificacionesComponent} from "./tipos-identificaciones/tipos-identificaciones.component";
import {TiposPropiedadComponent} from "./tipos-propiedad/tipos-propiedad.component";
import {TiposReferenciasComponent} from "./tipos-referencias/tipos-referencias.component";
import {TiposRelacionesComponent} from "./tipos-relaciones/tipos-relaciones.component";
import {TiposSociedadComponent} from "./tipos-sociedad/tipos-sociedad.component";
import {TitulosComponent} from "./titulos/titulos.component";

const routes: Routes = [
  { path: '', redirectTo: 'Aseguradoras', pathMatch: 'full' },
  { path: 'Aseguradoras', component: AseguradorasComponent },
  { path: 'Ciudades', component: CiudadesComponent},
  { path: 'Coberturas-Geograficas', component: CoberturasGeograficasComponent},
  { path: 'Estado-Civil', component: EstadoCivilComponent},
  { path: 'Estados', component: EstadosComponent},
  { path: 'Giro-Empresarial', component: GiroEmpresarialComponent},
  { path: 'Monedas', component: MonedasComponent},
  { path: 'Municipios', component: MunicipiosComponent},
  { path: 'Nacionalidades', component: NacionalidadesComponent},
  { path: 'Ocupaciones', component: OcupacionesComponent},
  { path: 'Origen-Ingresos', component: OrigenIngresosComponent},
  { path: 'Origen-Recursos', component: OrigenRecursosComponent},
  { path: 'Paises', component: PaisesComponent},
  { path: 'Participes', component: ParticipesComponent},
  { path: 'Periodicidades', component: PeriodicidadesComponent},
  { path: 'Profesiones', component: ProfesionesComponent},
  { path: 'Puestos-Empleos', component: PuestosEmpleosComponent},
  { path: 'Regimen-Matrimonial', component: RegimenMatrimonialComponent},
  { path: 'Tipo-Impuestos', component: TipoImpuestosComponent},
  { path: 'Tipo-Persona', component: TipoPersonaComponent},
  { path: 'Tipos-Asentamientos', component: TipoAsentamientosComponent},
  { path: 'Tipos-Beneficiario', component: TiposBeneficiarioComponent},
  { path: 'Tipos-Domicilios', component: TiposDomiciliosComponent},
  { path: 'Tipo-Seguro', component: TipoSeguroComponent},
  { path: 'Tipos-Empleos', component: TiposEmpleosComponent},
  { path: 'Tipos-Identificaciones', component: TiposIdentificacionesComponent},
  { path: 'Tipos-Propiedad', component: TiposPropiedadComponent},
  { path: 'Tipos-Referencias', component: TiposReferenciasComponent},
  { path: 'Tipos-Relaciones', component: TiposRelacionesComponent},
  { path: 'Tipos-Sociedad', component: TiposSociedadComponent},
  { path: 'Titulos', component: TitulosComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CatalogosRoutingModule { }
