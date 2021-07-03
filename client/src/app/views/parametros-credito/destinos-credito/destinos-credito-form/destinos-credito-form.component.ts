import {Component, Inject, OnInit} from '@angular/core';
import {_destinosCredito} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {DestinosCreditoComponent} from "../destinos-credito.component";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-destinos-credito-form',
  templateUrl: './destinos-credito-form.component.html',
  styleUrls: ['./destinos-credito-form.component.sass']
})
export class DestinosCreditoFormComponent implements OnInit {
  action: string;
  _destinosCreditoForm: FormGroup;
  dialogTitle: string;
  advanceTable: _destinosCredito;

  constructor(public dialogRef: MatDialogRef<DestinosCreditoFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._destinosCreditoForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._destinosCreditoForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveDestino: [this.data.data.claveDestino, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._destinosCreditoForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveDestino: [this.data.data.claveDestino, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
