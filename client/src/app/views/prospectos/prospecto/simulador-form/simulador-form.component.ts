import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from "@angular/material/dialog";
import {FormGroup} from "@angular/forms";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";
import {_combo, _simulador} from "../../../../shared/interfaces/Creditos.interface";

@Component({
  selector: 'app-simulador-form',
  templateUrl: './simulador-form.component.html',
  styleUrls: ['./simulador-form.component.sass']
})
export class SimuladorFormComponent implements OnInit {
  action: string;
  advanceTable: _simulador;
  _simuladorForm: FormGroup;

  constructor(public dialogRef: MatDialogRef<SimuladorFormComponent>,
              public advanceTableService: AdvanceRestService,
              public dialog: MatDialog,
  ) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._simuladorForm.value);
  }

  ngOnInit(): void {
    this._simuladorForm = this.advanceTableService.buildForm({
      fechaEntrega: [''],
      fechaPrimerPago: [''],
      frecuenciaPago: [''],
      numeroPagos: [''],
      tipoTasa: [''],
      tasa: [''],
      retenciones: [''],
      retencionesFinanciadas: [''],
      montoSolicitado: [''],
      montoCredito: [''],
      montoEntregar: [''],
    });
  }

  simular() {

  }

  descargar() {

  }
}
