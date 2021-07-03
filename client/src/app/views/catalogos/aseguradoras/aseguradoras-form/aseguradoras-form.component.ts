import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_aseguradoras} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-aseguradoras-form',
  templateUrl: './aseguradoras-form.component.html',
  styleUrls: ['./aseguradoras-form.component.sass']
})
export class AseguradorasFormComponent implements OnInit {
  action: string;
  _aseguradorasForm: FormGroup;
  dialogTitle: string;
  advanceTable: _aseguradoras;

  constructor(public dialogRef: MatDialogRef<AseguradorasFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) {
  }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._aseguradorasForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._aseguradorasForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveAseguradoraSeguro: [this.data.data.claveAseguradoraSeguro, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._aseguradorasForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveAseguradoraSeguro: [this.data.data.claveAseguradoraSeguro, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
