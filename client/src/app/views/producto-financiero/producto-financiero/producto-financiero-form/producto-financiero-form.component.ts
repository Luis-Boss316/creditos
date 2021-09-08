import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_combo, _productoFinanciero} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";
import {SimuladorFormComponent} from "../../../prospectos/prospecto/simulador-form/simulador-form.component";
import {ParametrosFormComponent} from "../parametros-form/parametros-form.component";

@Component({
  selector: 'app-producto-financiero-form',
  templateUrl: './producto-financiero-form.component.html',
  styleUrls: ['./producto-financiero-form.component.sass']
})
export class ProductoFinancieroFormComponent implements OnInit {
  action: string;
  _productoFinancieroForm: FormGroup;
  dialogTitle: string;
  advanceTable: _productoFinanciero;
  public monedaCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<ProductoFinancieroFormComponent>,
              public dialog: MatDialog,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._productoFinancieroForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'Monedas'}, 'comboController').subscribe(result =>
      this.monedaCombo = result);

    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._productoFinancieroForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        producto: [this.data.data.producto, Validators.required],
        montoMinimo: [this.data.data.montoMinimo, Validators.required],
        montoMaximo: [this.data.data.montoMaximo, Validators.required],
        tipo: [this.data.data.tipo, Validators.required],
        clasificacionBancaria: [this.data.data.clasificacionBancaria, Validators.required],
        moneda: [this.data.data.moneda.id, Validators.required],
        activo: [this.data.data.activo],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._productoFinancieroForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        producto: [this.data.data.producto, Validators.required],
        montoMinimo: [this.data.data.montoMinimo, Validators.required],
        montoMaximo: [this.data.data.montoMaximo, Validators.required],
        tipo: [this.data.data.tipo, Validators.required],
        clasificacionBancaria: [this.data.data.clasificacionBancaria, Validators.required],
        moneda: [this.data.data.moneda, Validators.required],
        activo: [this.data.data.activo],
      });
    }
  }

  parametros() {
    const dialogRef = this.dialog.open(ParametrosFormComponent, {
      width:'60%', height:'100%',
      data: { title: 'Simulador', disableClose: true, action: 'Agregar' }
    });
  }
}
