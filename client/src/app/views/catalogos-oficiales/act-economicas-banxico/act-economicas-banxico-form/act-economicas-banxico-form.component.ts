import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_actEcoB, _combo, _monedas} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-act-economicas-banxico-form',
  templateUrl: './act-economicas-banxico-form.component.html',
  styleUrls: ['./act-economicas-banxico-form.component.sass']
})
export class ActEconomicasBanxicoFormComponent implements OnInit {
  action: string;
  _actEcoBForm: FormGroup;
  dialogTitle: string;
  advanceTable: _actEcoB;
  public sectoresCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<ActEconomicasBanxicoFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._actEcoBForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'SectoresBanxico'}, 'comboController').subscribe(result =>
      this. sectoresCombo = result);

    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.alias;
      this._actEcoBForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        numeroSector: [this.data.data.numeroSector, Validators.required],
        indicadorActRiesgo: [this.data.data.indicadorActRiesgo],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._actEcoBForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        numeroSector: [this.data.data.numeroSector, Validators.required],
        indicadorActRiesgo: [this.data.data.indicadorActRiesgo],
      });
    }
  }
}
