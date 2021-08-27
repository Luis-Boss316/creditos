import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_aseguradoras, _modoContacto} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-modo-contacto-form',
  templateUrl: './modo-contacto-form.component.html',
  styleUrls: ['./modo-contacto-form.component.sass']
})
export class ModoContactoFormComponent implements OnInit {
  action: string;
  _modoContactoForm: FormGroup;
  dialogTitle: string;
  advanceTable: _modoContacto;

  constructor(public dialogRef: MatDialogRef<ModoContactoFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._modoContactoForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._modoContactoForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        valor: [this.data.data.valor, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
        financieraNacional: [this.data.data.financieraNacional],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._modoContactoForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        valor: [this.data.data.valor, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
        financieraNacional: [this.data.data.financieraNacional],
      });
    }
  }
}
