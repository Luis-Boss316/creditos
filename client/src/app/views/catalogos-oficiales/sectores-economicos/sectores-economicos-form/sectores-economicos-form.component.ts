import {Component, Inject, OnInit} from '@angular/core';
import {_sectoresEconomicos} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-sectores-economicos-form',
  templateUrl: './sectores-economicos-form.component.html',
  styleUrls: ['./sectores-economicos-form.component.sass']
})
export class SectoresEconomicosFormComponent implements OnInit {
  action: string;
  _sectoresEconomicosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _sectoresEconomicos;

  constructor(public dialogRef: MatDialogRef<SectoresEconomicosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._sectoresEconomicosForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._sectoresEconomicosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveSectorEconomico: [this.data.data.claveSectorEconomico, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._sectoresEconomicosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveSectorEconomico: [this.data.data.claveSectorEconomico, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
