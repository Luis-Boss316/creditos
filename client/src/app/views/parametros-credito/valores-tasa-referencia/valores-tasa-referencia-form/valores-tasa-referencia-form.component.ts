import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_combo, _valoresTasasReferencia} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-valores-tasa-referencia-form',
  templateUrl: './valores-tasa-referencia-form.component.html',
  styleUrls: ['./valores-tasa-referencia-form.component.sass']
})
export class ValoresTasaReferenciaFormComponent implements OnInit {
  action: string;
  _valoresTasaForm: FormGroup;
  dialogTitle: string;
  advanceTable: _valoresTasasReferencia;
  public valoresCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<ValoresTasaReferenciaFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._valoresTasaForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'TasasReferencia'}, 'comboController').subscribe(result =>
      this.valoresCombo = result);

    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.title;
      this._valoresTasaForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveTasa: [this.data.data.claveTasa.id, Validators.required],
        fechaInicioVigencia: [this.data.data.fechaInicioVigencia, Validators.required],
        valor: [this.data.data.valor, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._valoresTasaForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveTasa: [this.data.data.claveTasa, Validators.required],
        fechaInicioVigencia: [this.data.data.fechaInicioVigencia, Validators.required],
        valor: [this.data.data.valor, Validators.required],
      });
    }
  }
}
