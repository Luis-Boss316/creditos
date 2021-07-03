import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ParametrosCreditoRoutingModule } from './parametros-credito-routing.module';
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
import { DestinosCreditoComponent } from './destinos-credito/destinos-credito.component';
import { DestinosCreditoFormComponent } from './destinos-credito/destinos-credito-form/destinos-credito-form.component';
import { DestinosCreditoDeleteComponent } from './destinos-credito/destinos-credito-delete/destinos-credito-delete.component';
import { TiposCreditoComponent } from './tipos-credito/tipos-credito.component';
import { TiposCreditoFormComponent } from './tipos-credito/tipos-credito-form/tipos-credito-form.component';
import { TiposCreditoDeleteComponent } from './tipos-credito/tipos-credito-delete/tipos-credito-delete.component';
import { TiposGarantiaComponent } from './tipos-garantia/tipos-garantia.component';
import { TiposGarantiaFormComponent } from './tipos-garantia/tipos-garantia-form/tipos-garantia-form.component';
import { TiposGarantiaDeleteComponent } from './tipos-garantia/tipos-garantia-delete/tipos-garantia-delete.component';
import { TasasReferenciasComponent } from './tasas-referencias/tasas-referencias.component';
import { TasasReferenciasFormComponent } from './tasas-referencias/tasas-referencias-form/tasas-referencias-form.component';
import { TasasReferenciasDeleteComponent } from './tasas-referencias/tasas-referencias-delete/tasas-referencias-delete.component';
import { ValoresTasaReferenciaComponent } from './valores-tasa-referencia/valores-tasa-referencia.component';
import { ValoresTasaReferenciaFormComponent } from './valores-tasa-referencia/valores-tasa-referencia-form/valores-tasa-referencia-form.component';
import { ValoresTasaReferenciaDeleteComponent } from './valores-tasa-referencia/valores-tasa-referencia-delete/valores-tasa-referencia-delete.component';
import { FuentesFondeoComponent } from './fuentes-fondeo/fuentes-fondeo.component';
import { FuentesFondeoFormComponent } from './fuentes-fondeo/fuentes-fondeo-form/fuentes-fondeo-form.component';
import { FuentesFondeoDeleteComponent } from './fuentes-fondeo/fuentes-fondeo-delete/fuentes-fondeo-delete.component';
import { PeritosComponent } from './peritos/peritos.component';
import { PeritosFormComponent } from './peritos/peritos-form/peritos-form.component';
import { PeritosDeleteComponent } from './peritos/peritos-delete/peritos-delete.component';
import { CirculoCreditoComponent } from './circulo-credito/circulo-credito.component';
import { CirculoCreditoFormComponent } from './circulo-credito/circulo-credito-form/circulo-credito-form.component';
import { CirculoCreditoDeleteComponent } from './circulo-credito/circulo-credito-delete/circulo-credito-delete.component';
import { BuroCreditoComponent } from './buro-credito/buro-credito.component';
import { BuroCreditoFormComponent } from './buro-credito/buro-credito-form/buro-credito-form.component';
import { BuroCreditoDeleteComponent } from './buro-credito/buro-credito-delete/buro-credito-delete.component';
import { NotariosComponent } from './notarios/notarios.component';
import { NotariosFormComponent } from './notarios/notarios-form/notarios-form.component';
import { NotariosDeleteComponent } from './notarios/notarios-delete/notarios-delete.component';


@NgModule({
  declarations: [DestinosCreditoComponent, DestinosCreditoFormComponent, DestinosCreditoDeleteComponent, TiposCreditoComponent, TiposCreditoFormComponent, TiposCreditoDeleteComponent, TiposGarantiaComponent, TiposGarantiaFormComponent, TiposGarantiaDeleteComponent, TasasReferenciasComponent, TasasReferenciasFormComponent, TasasReferenciasDeleteComponent, ValoresTasaReferenciaComponent, ValoresTasaReferenciaFormComponent, ValoresTasaReferenciaDeleteComponent, FuentesFondeoComponent, FuentesFondeoFormComponent, FuentesFondeoDeleteComponent, PeritosComponent, PeritosFormComponent, PeritosDeleteComponent, CirculoCreditoComponent, CirculoCreditoFormComponent, CirculoCreditoDeleteComponent, BuroCreditoComponent, BuroCreditoFormComponent, BuroCreditoDeleteComponent, NotariosComponent, NotariosFormComponent, NotariosDeleteComponent],
  imports: [
    CommonModule,
    ParametrosCreditoRoutingModule,
    FormsModule, ReactiveFormsModule, MatMenuModule, MatIconModule, MatButtonModule, MatTableModule, MatPaginatorModule,
    MatFormFieldModule, MatInputModule, MatSnackBarModule, MatButtonModule, MatIconModule, MatRadioModule,
    MatSelectModule, MatCheckboxModule, MatCardModule, MatDatepickerModule, MatDialogModule, MatSortModule,
    MatToolbarModule, MaterialFileInputModule, MatMenuModule, MatTooltipModule, OwlDateTimeModule, MatSlideToggleModule
  ]
})
export class ParametrosCreditoModule { }
