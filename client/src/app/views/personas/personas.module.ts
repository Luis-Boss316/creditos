import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PersonasRoutingModule } from './personas-routing.module';
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
import {MatTabsModule} from "@angular/material/tabs";
import { PersonaComponent } from './persona/persona.component';
import { PersonaFormComponent } from './persona/persona-form/persona-form.component';
import { PersonaDeleteComponent } from './persona/persona-delete/persona-delete.component';
import {MatStepperModule} from "@angular/material/stepper";
import { DatosFormComponent } from './persona/datos-form/datos-form.component';
import { DatosBancariosFormComponent } from './persona/datos-bancarios-form/datos-bancarios-form.component';
import { ContactosFormComponent } from './persona/contactos-form/contactos-form.component';
import { CorreosFormComponent } from './persona/correos-form/correos-form.component';
import { TelefonosFormComponent } from './persona/telefonos-form/telefonos-form.component';


@NgModule({
  declarations: [PersonaComponent, PersonaFormComponent, PersonaDeleteComponent, DatosFormComponent, DatosBancariosFormComponent, ContactosFormComponent, CorreosFormComponent, TelefonosFormComponent],
    imports: [
        CommonModule,
        PersonasRoutingModule,
        FormsModule, ReactiveFormsModule, MatMenuModule, MatIconModule, MatButtonModule, MatTableModule, MatPaginatorModule,
        MatFormFieldModule, MatInputModule, MatSnackBarModule, MatButtonModule, MatIconModule, MatRadioModule,
        MatSelectModule, MatCheckboxModule, MatCardModule, MatDatepickerModule, MatDialogModule, MatSortModule,
        MatToolbarModule, MaterialFileInputModule, MatMenuModule, MatTooltipModule, OwlDateTimeModule, MatSlideToggleModule, MatTabsModule, MatStepperModule
    ]
})
export class PersonasModule { }
