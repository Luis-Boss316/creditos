import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CatalogosOficialesRoutingModule } from './catalogos-oficiales-routing.module';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {MatMenuModule} from "@angular/material/menu";
import {MatIconModule} from "@angular/material/icon";
import {MatButtonModule} from "@angular/material/button";
import {MatTableModule} from "@angular/material/table";
import {MatPaginatorModule} from "@angular/material/paginator";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatInputModule} from "@angular/material/input";
import {MatSnackBarModule} from "@angular/material/snack-bar";
import {MatRadioModule} from "@angular/material/radio";
import {MatSelectModule} from "@angular/material/select";
import {MatCheckboxModule} from "@angular/material/checkbox";
import {MatCardModule} from "@angular/material/card";
import {MatDatepickerModule} from "@angular/material/datepicker";
import {MatDialogModule} from "@angular/material/dialog";
import {MatSortModule} from "@angular/material/sort";
import {MatToolbarModule} from "@angular/material/toolbar";
import {MaterialFileInputModule} from "ngx-material-file-input";
import {MatTooltipModule} from "@angular/material/tooltip";
import {OwlDateTimeModule} from "ng-pick-datetime";
import {MatSlideToggleModule} from "@angular/material/slide-toggle";
import { ActEconomicasBanxicoComponent } from './act-economicas-banxico/act-economicas-banxico.component';
import { ActEconomicasBanxicoFormComponent } from './act-economicas-banxico/act-economicas-banxico-form/act-economicas-banxico-form.component';
import { ActEconomicasBanxicoDeleteComponent } from './act-economicas-banxico/act-economicas-banxico-delete/act-economicas-banxico-delete.component';
import { SectoresBanxicoComponent } from './sectores-banxico/sectores-banxico.component';
import { SectoresBanxicoFormComponent } from './sectores-banxico/sectores-banxico-form/sectores-banxico-form.component';
import { SectoresBanxicoDeleteComponent } from './sectores-banxico/sectores-banxico-delete/sectores-banxico-delete.component';
import { LocalidadesBanxicoComponent } from './localidades-banxico/localidades-banxico.component';
import { LocalidadesBanxicoFormComponent } from './localidades-banxico/localidades-banxico-form/localidades-banxico-form.component';
import { LocalidadesBanxicoDeleteComponent } from './localidades-banxico/localidades-banxico-delete/localidades-banxico-delete.component';
import { ActividadesEconomicasFIRAComponent } from './actividades-economicas-fira/actividades-economicas-fira.component';
import { ActividadesEconomicasFIRAFormComponent } from './actividades-economicas-fira/actividades-economicas-firaform/actividades-economicas-firaform.component';
import { ActividadesEconomicasFIRADeleteComponent } from './actividades-economicas-fira/actividades-economicas-firadelete/actividades-economicas-firadelete.component';
import { ActEcoCNBVComponent } from './act-eco-cnbv/act-eco-cnbv.component';
import { ActEcoCnbvFormComponent } from './act-eco-cnbv/act-eco-cnbv-form/act-eco-cnbv-form.component';
import { ActEcoCnbvDeleteComponent } from './act-eco-cnbv/act-eco-cnbv-delete/act-eco-cnbv-delete.component';
import { ClavesLadaComponent } from './claves-lada/claves-lada.component';
import { ClavesLadaFormComponent } from './claves-lada/claves-lada-form/claves-lada-form.component';
import { ClavesLadaDeleteComponent } from './claves-lada/claves-lada-delete/claves-lada-delete.component';
import { InstitucionesYcontrapartesComponent } from './instituciones-ycontrapartes/instituciones-ycontrapartes.component';
import { InstitucionesYcontrapartesFormComponent } from './instituciones-ycontrapartes/instituciones-ycontrapartes-form/instituciones-ycontrapartes-form.component';
import { InstitucionesYcontrapartesDeleteComponent } from './instituciones-ycontrapartes/instituciones-ycontrapartes-delete/instituciones-ycontrapartes-delete.component';
import { SectoresEconomicosComponent } from './sectores-economicos/sectores-economicos.component';
import { SectoresEconomicosFormComponent } from './sectores-economicos/sectores-economicos-form/sectores-economicos-form.component';
import { SectoresEconomicosDeleteComponent } from './sectores-economicos/sectores-economicos-delete/sectores-economicos-delete.component';


@NgModule({
  declarations: [ActEconomicasBanxicoComponent, ActEconomicasBanxicoFormComponent, ActEconomicasBanxicoDeleteComponent, SectoresBanxicoComponent, SectoresBanxicoFormComponent, SectoresBanxicoDeleteComponent, LocalidadesBanxicoComponent, LocalidadesBanxicoFormComponent, LocalidadesBanxicoDeleteComponent, ActividadesEconomicasFIRAComponent, ActividadesEconomicasFIRAFormComponent, ActividadesEconomicasFIRADeleteComponent, ActEcoCNBVComponent, ActEcoCnbvFormComponent, ActEcoCnbvDeleteComponent, ClavesLadaComponent, ClavesLadaFormComponent, ClavesLadaDeleteComponent, InstitucionesYcontrapartesComponent, InstitucionesYcontrapartesFormComponent, InstitucionesYcontrapartesDeleteComponent, SectoresEconomicosComponent, SectoresEconomicosFormComponent, SectoresEconomicosDeleteComponent],
  imports: [
    CommonModule,
    CatalogosOficialesRoutingModule,
    FormsModule, ReactiveFormsModule, MatMenuModule, MatIconModule, MatButtonModule, MatTableModule, MatPaginatorModule,
    MatFormFieldModule, MatInputModule, MatSnackBarModule, MatButtonModule, MatIconModule, MatRadioModule,
    MatSelectModule, MatCheckboxModule, MatCardModule, MatDatepickerModule, MatDialogModule, MatSortModule,
    MatToolbarModule, MaterialFileInputModule, MatMenuModule, MatTooltipModule, OwlDateTimeModule, MatSlideToggleModule
  ]
})
export class CatalogosOficialesModule { }
