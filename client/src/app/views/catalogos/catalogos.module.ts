import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CatalogosRoutingModule } from './catalogos-routing.module';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {MatMenuModule} from "@angular/material/menu";
import {MatIconModule} from "@angular/material/icon";
import {MatTableModule} from "@angular/material/table";
import {MatButtonModule} from "@angular/material/button";
import {MatPaginatorModule} from "@angular/material/paginator";
import {MatRadioModule} from "@angular/material/radio";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatCheckboxModule} from "@angular/material/checkbox";
import {MaterialFileInputModule} from "ngx-material-file-input";
import {OwlDateTimeModule} from "ng-pick-datetime";
import {MatCardModule} from "@angular/material/card";
import {MatDatepickerModule} from "@angular/material/datepicker";
import {MatSelectModule} from "@angular/material/select";
import {MatToolbarModule} from "@angular/material/toolbar";
import {MatInputModule} from "@angular/material/input";
import {MatTooltipModule} from "@angular/material/tooltip";
import {MatDialogModule} from "@angular/material/dialog";
import {MatSortModule} from "@angular/material/sort";
import {MatSnackBarModule} from "@angular/material/snack-bar";
import {MatSlideToggleModule} from "@angular/material/slide-toggle";
import { AseguradorasComponent } from './aseguradoras/aseguradoras.component';
import { AseguradorasFormComponent } from './aseguradoras/aseguradoras-form/aseguradoras-form.component';
import { AseguradorasDeleteComponent } from './aseguradoras/aseguradoras-delete/aseguradoras-delete.component';
import { CiudadesComponent } from './ciudades/ciudades.component';
import { CiudadesFormComponent } from './ciudades/ciudades-form/ciudades-form.component';
import { CiudadesDeleteComponent } from './ciudades/ciudades-delete/ciudades-delete.component';
import { CoberturasGeograficasComponent } from './coberturas-geograficas/coberturas-geograficas.component';
import { CoberturasGeograficasFormComponent } from './coberturas-geograficas/coberturas-geograficas-form/coberturas-geograficas-form.component';
import { CoberturasGeograficasDeleteComponent } from './coberturas-geograficas/coberturas-geograficas-delete/coberturas-geograficas-delete.component';
import { EstadoCivilComponent } from './estado-civil/estado-civil.component';
import { EstadoCivilFormComponent } from './estado-civil/estado-civil-form/estado-civil-form.component';
import { EstadoCivilDeleteComponent } from './estado-civil/estado-civil-delete/estado-civil-delete.component';
import { EstadosComponent } from './estados/estados.component';
import { EstadosFormComponent } from './estados/estados-form/estados-form.component';
import { EstadosDeleteComponent } from './estados/estados-delete/estados-delete.component';
import { GiroEmpresarialComponent } from './giro-empresarial/giro-empresarial.component';
import { GiroEmpresarialFormComponent } from './giro-empresarial/giro-empresarial-form/giro-empresarial-form.component';
import { GiroEmpresarialDeleteComponent } from './giro-empresarial/giro-empresarial-delete/giro-empresarial-delete.component';
import { MonedasComponent } from './monedas/monedas.component';
import { MonedasFormComponent } from './monedas/monedas-form/monedas-form.component';
import { MonedasDeleteComponent } from './monedas/monedas-delete/monedas-delete.component';
import { MunicipiosComponent } from './municipios/municipios.component';
import { MunicipiosFormComponent } from './municipios/municipios-form/municipios-form.component';
import { MunicipiosDeleteComponent } from './municipios/municipios-delete/municipios-delete.component';
import { NacionalidadesComponent } from './nacionalidades/nacionalidades.component';
import { NacionalidadesFormComponent } from './nacionalidades/nacionalidades-form/nacionalidades-form.component';
import { NacionalidadesDeleteComponent } from './nacionalidades/nacionalidades-delete/nacionalidades-delete.component';
import { OcupacionesComponent } from './ocupaciones/ocupaciones.component';
import { OcupacionesFormComponent } from './ocupaciones/ocupaciones-form/ocupaciones-form.component';
import { OcupacionesDeleteComponent } from './ocupaciones/ocupaciones-delete/ocupaciones-delete.component';
import { OrigenIngresosComponent } from './origen-ingresos/origen-ingresos.component';
import { OrigenIngresosFormComponent } from './origen-ingresos/origen-ingresos-form/origen-ingresos-form.component';
import { OrigenIngresosDeleteComponent } from './origen-ingresos/origen-ingresos-delete/origen-ingresos-delete.component';
import { OrigenRecursosComponent } from './origen-recursos/origen-recursos.component';
import { OrigenRecursosFormComponent } from './origen-recursos/origen-recursos-form/origen-recursos-form.component';
import { OrigenRecursosDeleteComponent } from './origen-recursos/origen-recursos-delete/origen-recursos-delete.component';
import { PaisesComponent } from './paises/paises.component';
import { PaisesFormComponent } from './paises/paises-form/paises-form.component';
import { PaisesDeleteComponent } from './paises/paises-delete/paises-delete.component';
import { ParticipesComponent } from './participes/participes.component';
import { ParticipesFormComponent } from './participes/participes-form/participes-form.component';
import { ParticipesDeleteComponent } from './participes/participes-delete/participes-delete.component';
import { PeriodicidadesComponent } from './periodicidades/periodicidades.component';
import { PeriodicidadesFormComponent } from './periodicidades/periodicidades-form/periodicidades-form.component';
import { PeriodicidadesDeleteComponent } from './periodicidades/periodicidades-delete/periodicidades-delete.component';
import { ProfesionesComponent } from './profesiones/profesiones.component';
import { ProfesionesFormComponent } from './profesiones/profesiones-form/profesiones-form.component';
import { ProfesionesDeleteComponent } from './profesiones/profesiones-delete/profesiones-delete.component';
import { PuestosEmpleosComponent } from './puestos-empleos/puestos-empleos.component';
import { PuestosEmpleosFormComponent } from './puestos-empleos/puestos-empleos-form/puestos-empleos-form.component';
import { PuestosEmpleosDeleteComponent } from './puestos-empleos/puestos-empleos-delete/puestos-empleos-delete.component';
import { RegimenMatrimonialComponent } from './regimen-matrimonial/regimen-matrimonial.component';
import { RegimenMatrimonialFormComponent } from './regimen-matrimonial/regimen-matrimonial-form/regimen-matrimonial-form.component';
import { RegimenMatrimonialDeleteComponent } from './regimen-matrimonial/regimen-matrimonial-delete/regimen-matrimonial-delete.component';
import { TipoImpuestosComponent } from './tipo-impuestos/tipo-impuestos.component';
import { TipoImpuestosFormComponent } from './tipo-impuestos/tipo-impuestos-form/tipo-impuestos-form.component';
import { TipoImpuestosDeleteComponent } from './tipo-impuestos/tipo-impuestos-delete/tipo-impuestos-delete.component';
import { TipoPersonaComponent } from './tipo-persona/tipo-persona.component';
import { TipoPersonaFormComponent } from './tipo-persona/tipo-persona-form/tipo-persona-form.component';
import { TipoPersonaDeleteComponent } from './tipo-persona/tipo-persona-delete/tipo-persona-delete.component';
import { TipoAsentamientosComponent } from './tipo-asentamientos/tipo-asentamientos.component';
import { TipoAsentamientosFormComponent } from './tipo-asentamientos/tipo-asentamientos-form/tipo-asentamientos-form.component';
import { TipoAsentamientosDeleteComponent } from './tipo-asentamientos/tipo-asentamientos-delete/tipo-asentamientos-delete.component';
import { TiposBeneficiarioComponent } from './tipos-beneficiario/tipos-beneficiario.component';
import { TiposBeneficiarioFormComponent } from './tipos-beneficiario/tipos-beneficiario-form/tipos-beneficiario-form.component';
import { TiposBeneficiarioDeleteComponent } from './tipos-beneficiario/tipos-beneficiario-delete/tipos-beneficiario-delete.component';
import { TiposDomiciliosComponent } from './tipos-domicilios/tipos-domicilios.component';
import { TiposDomiciliosFormComponent } from './tipos-domicilios/tipos-domicilios-form/tipos-domicilios-form.component';
import { TiposDomiciliosDeleteComponent } from './tipos-domicilios/tipos-domicilios-delete/tipos-domicilios-delete.component';
import { TipoSeguroComponent } from './tipo-seguro/tipo-seguro.component';
import { TipoSeguroFormComponent } from './tipo-seguro/tipo-seguro-form/tipo-seguro-form.component';
import { TipoSeguroDeleteComponent } from './tipo-seguro/tipo-seguro-delete/tipo-seguro-delete.component';
import { TiposEmpleosComponent } from './tipos-empleos/tipos-empleos.component';
import { TiposEmpleosFormComponent } from './tipos-empleos/tipos-empleos-form/tipos-empleos-form.component';
import { TiposEmpleosDeleteComponent } from './tipos-empleos/tipos-empleos-delete/tipos-empleos-delete.component';
import { TiposIdentificacionesComponent } from './tipos-identificaciones/tipos-identificaciones.component';
import { TiposIdentificacionesFormComponent } from './tipos-identificaciones/tipos-identificaciones-form/tipos-identificaciones-form.component';
import { TiposIdentificacionesDeleteComponent } from './tipos-identificaciones/tipos-identificaciones-delete/tipos-identificaciones-delete.component';
import { TiposPropiedadComponent } from './tipos-propiedad/tipos-propiedad.component';
import { TiposPropiedadFormComponent } from './tipos-propiedad/tipos-propiedad-form/tipos-propiedad-form.component';
import { TiposPropiedadDeleteComponent } from './tipos-propiedad/tipos-propiedad-delete/tipos-propiedad-delete.component';
import { TiposReferenciasComponent } from './tipos-referencias/tipos-referencias.component';
import { TiposReferenciasFormComponent } from './tipos-referencias/tipos-referencias-form/tipos-referencias-form.component';
import { TiposReferenciasDeleteComponent } from './tipos-referencias/tipos-referencias-delete/tipos-referencias-delete.component';
import { TiposRelacionesComponent } from './tipos-relaciones/tipos-relaciones.component';
import { TiposRelacionesFormComponent } from './tipos-relaciones/tipos-relaciones-form/tipos-relaciones-form.component';
import { TiposRelacionesDeleteComponent } from './tipos-relaciones/tipos-relaciones-delete/tipos-relaciones-delete.component';
import { TiposSociedadComponent } from './tipos-sociedad/tipos-sociedad.component';
import { TiposSociedadFormComponent } from './tipos-sociedad/tipos-sociedad-form/tipos-sociedad-form.component';
import { TiposSociedadDeleteComponent } from './tipos-sociedad/tipos-sociedad-delete/tipos-sociedad-delete.component';
import { TitulosComponent } from './titulos/titulos.component';
import { TitulosFormComponent } from './titulos/titulos-form/titulos-form.component';
import { TitulosDeleteComponent } from './titulos/titulos-delete/titulos-delete.component';
import { ModoContactoComponent } from './modo-contacto/modo-contacto.component';
import { ModoContactoFormComponent } from './modo-contacto/modo-contacto-form/modo-contacto-form.component';
import { ModoContactoDeleteComponent } from './modo-contacto/modo-contacto-delete/modo-contacto-delete.component';
import { SucursalesComponent } from './sucursales/sucursales.component';
import { SucursalesFormComponent } from './sucursales/sucursales-form/sucursales-form.component';
import { SucursalesDeleteComponent } from './sucursales/sucursales-delete/sucursales-delete.component';



@NgModule({
  declarations: [AseguradorasComponent, AseguradorasFormComponent, AseguradorasDeleteComponent, CiudadesComponent, CiudadesFormComponent, CiudadesDeleteComponent, CoberturasGeograficasComponent, CoberturasGeograficasFormComponent, CoberturasGeograficasDeleteComponent, EstadoCivilComponent, EstadoCivilFormComponent, EstadoCivilDeleteComponent, EstadosComponent, EstadosFormComponent, EstadosDeleteComponent, GiroEmpresarialComponent, GiroEmpresarialFormComponent, GiroEmpresarialDeleteComponent, MonedasComponent, MonedasFormComponent, MonedasDeleteComponent, MunicipiosComponent, MunicipiosFormComponent, MunicipiosDeleteComponent, NacionalidadesComponent, NacionalidadesFormComponent, NacionalidadesDeleteComponent, OcupacionesComponent, OcupacionesFormComponent, OcupacionesDeleteComponent, OrigenIngresosComponent, OrigenIngresosFormComponent, OrigenIngresosDeleteComponent, OrigenRecursosComponent, OrigenRecursosFormComponent, OrigenRecursosDeleteComponent, PaisesComponent, PaisesFormComponent, PaisesDeleteComponent, ParticipesComponent, ParticipesFormComponent, ParticipesDeleteComponent, PeriodicidadesComponent, PeriodicidadesFormComponent, PeriodicidadesDeleteComponent, ProfesionesComponent, ProfesionesFormComponent, ProfesionesDeleteComponent, PuestosEmpleosComponent, PuestosEmpleosFormComponent, PuestosEmpleosDeleteComponent, RegimenMatrimonialComponent, RegimenMatrimonialFormComponent, RegimenMatrimonialDeleteComponent, TipoImpuestosComponent, TipoImpuestosFormComponent, TipoImpuestosDeleteComponent, TipoPersonaComponent, TipoPersonaFormComponent, TipoPersonaDeleteComponent, TipoAsentamientosComponent, TipoAsentamientosFormComponent, TipoAsentamientosDeleteComponent, TiposBeneficiarioComponent, TiposBeneficiarioFormComponent, TiposBeneficiarioDeleteComponent, TiposDomiciliosComponent, TiposDomiciliosFormComponent, TiposDomiciliosDeleteComponent, TipoSeguroComponent, TipoSeguroFormComponent, TipoSeguroDeleteComponent, TiposEmpleosComponent, TiposEmpleosFormComponent, TiposEmpleosDeleteComponent, TiposIdentificacionesComponent, TiposIdentificacionesFormComponent, TiposIdentificacionesDeleteComponent, TiposPropiedadComponent, TiposPropiedadFormComponent, TiposPropiedadDeleteComponent, TiposReferenciasComponent, TiposReferenciasFormComponent, TiposReferenciasDeleteComponent, TiposRelacionesComponent, TiposRelacionesFormComponent, TiposRelacionesDeleteComponent, TiposSociedadComponent, TiposSociedadFormComponent, TiposSociedadDeleteComponent, TitulosComponent, TitulosFormComponent, TitulosDeleteComponent, ModoContactoComponent, ModoContactoFormComponent, ModoContactoDeleteComponent, SucursalesComponent, SucursalesFormComponent, SucursalesDeleteComponent],
  imports: [
    CommonModule,
    CatalogosRoutingModule,
    FormsModule, ReactiveFormsModule, MatMenuModule, MatIconModule, MatButtonModule, MatTableModule, MatPaginatorModule,
    MatFormFieldModule, MatInputModule, MatSnackBarModule, MatButtonModule, MatIconModule, MatRadioModule,
    MatSelectModule, MatCheckboxModule, MatCardModule, MatDatepickerModule, MatDialogModule, MatSortModule,
    MatToolbarModule, MaterialFileInputModule, MatMenuModule, MatTooltipModule, OwlDateTimeModule, MatSlideToggleModule
  ]
})
export class CatalogosModule { }
