import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_clientes, _combo} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-clientes-form',
  templateUrl: './clientes-form.component.html',
  styleUrls: ['./clientes-form.component.sass']
})
export class ClientesFormComponent implements OnInit {
  action: string;
  _clientesForm: FormGroup;
  dialogTitle: string;
  advanceTable: _clientes;
  public grupoFamilia: _combo[];

  constructor(public dialogRef: MatDialogRef<ClientesFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._clientesForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'GrupoFamilia'}, 'comboController').subscribe(result =>
      this.grupoFamilia = result);
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._clientesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        titularNombre: [this.data.data.titularNombre, Validators.required],
        apellidoPaterno: [this.data.data.apellidoPaterno, Validators.required],
        apellidoMaterno: [this.data.data.apellidoMaterno, Validators.required],
        promotor: [this.data.data.promotor, Validators.required],
        grupoFamilia: [this.data.data.grupoFamilia],
        estatus: [this.data.data.estatus, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._clientesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        titularNombre: [this.data.data.titularNombre, Validators.required],
        apellidoPaterno: [this.data.data.apellidoPaterno, Validators.required],
        apellidoMaterno: [this.data.data.apellidoMaterno, Validators.required],
        promotor: [this.data.data.promotor, Validators.required],
        grupoFamilia: [this.data.data.grupoFamilia],
        estatus: [this.data.data.estatus, Validators.required],
      });
    }
  }
}
