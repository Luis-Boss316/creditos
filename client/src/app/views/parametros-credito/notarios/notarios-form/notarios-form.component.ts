import {Component, Inject, OnInit} from '@angular/core';
import {_notarios} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-notarios-form',
  templateUrl: './notarios-form.component.html',
  styleUrls: ['./notarios-form.component.sass']
})
export class NotariosFormComponent implements OnInit {
  action: string;
  _notariosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _notarios;

  constructor(public dialogRef: MatDialogRef<NotariosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._notariosForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.nombre;
      this._notariosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        numeroNotario: [this.data.data.numeroNotario, Validators.required],
        apellidoPaternoNotarioTitular: [this.data.data.apellidoPaternoNotarioTitular, Validators.required],
        apellidoMaternoNotarioTitular: [this.data.data.apellidoMaternoNotarioTitular],
        primerNombreNotarioTitular: [this.data.data.primerNombreNotarioTitular, Validators.required],
        segundoNombreNotarioTitular: [this.data.data.segundoNombreNotarioTitular],
        apellidoPaternoNotarioSuplente: [this.data.data.apellidoPaternoNotarioSuplente],
        apellidoMaternoNotarioSuplente: [this.data.data.apellidoMaternoNotarioSuplente],
        primerNombreNotarioSuplente: [this.data.data.primerNombreNotarioSuplente],
        segundoNombreNotarioSuplente: [this.data.data.segundoNombreNotarioSuplente],
        codigoPostalNotario: [this.data.data.codigoPostalNotario, Validators.required],
        calleDomicilioNotario: [this.data.data.calleDomicilioNotario, Validators.required],
        noExteriorNotario: [this.data.data.noExteriorNotario, Validators.required],
        noInteriorNotario: [this.data.data.noInteriorNotario],
        entreCalle: [this.data.data.entreCalle],
        yCalle: [this.data.data.yCalle],
        claveColonia: [this.data.data.claveColonia],
        otraColonia: [this.data.data.otraColonia],
        tipoAsentamiento: [this.data.data.tipoAsentamiento],
        referenciaDomicilio: [this.data.data.referenciaDomicilio],
        claveLadaTelefono1: [this.data.data.claveLadaTelefono1,],
        telefono1: [this.data.data.telefono1],
        extensionTelefono1: [this.data.data.extensionTelefono1],
        claveLadaTelefono2: [this.data.data.claveLadaTelefono2],
        telefono2: [this.data.data.telefono2],
        extensionTelefono2: [this.data.data.extensionTelefono2],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._notariosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        numeroNotario: [this.data.data.numeroNotario, Validators.required],
        apellidoPaternoNotarioTitular: [this.data.data.apellidoPaternoNotarioTitular, Validators.required],
        apellidoMaternoNotarioTitular: [this.data.data.apellidoMaternoNotarioTitular],
        primerNombreNotarioTitular: [this.data.data.primerNombreNotarioTitular, Validators.required],
        segundoNombreNotarioTitular: [this.data.data.segundoNombreNotarioTitular],
        apellidoPaternoNotarioSuplente: [this.data.data.apellidoPaternoNotarioSuplente],
        apellidoMaternoNotarioSuplente: [this.data.data.apellidoMaternoNotarioSuplente],
        primerNombreNotarioSuplente: [this.data.data.primerNombreNotarioSuplente],
        segundoNombreNotarioSuplente: [this.data.data.segundoNombreNotarioSuplente],
        codigoPostalNotario: [this.data.data.codigoPostalNotario, Validators.required],
        calleDomicilioNotario: [this.data.data.calleDomicilioNotario, Validators.required],
        noExteriorNotario: [this.data.data.noExteriorNotario, Validators.required],
        noInteriorNotario: [this.data.data.noInteriorNotario],
        entreCalle: [this.data.data.entreCalle],
        yCalle: [this.data.data.yCalle],
        claveColonia: [this.data.data.claveColonia],
        otraColonia: [this.data.data.otraColonia],
        tipoAsentamiento: [this.data.data.tipoAsentamiento],
        referenciaDomicilio: [this.data.data.referenciaDomicilio],
        claveLadaTelefono1: [this.data.data.claveLadaTelefono1,],
        telefono1: [this.data.data.telefono1],
        extensionTelefono1: [this.data.data.extensionTelefono1],
        claveLadaTelefono2: [this.data.data.claveLadaTelefono2],
        telefono2: [this.data.data.telefono2],
        extensionTelefono2: [this.data.data.extensionTelefono2],
      });
    }
  }
}
