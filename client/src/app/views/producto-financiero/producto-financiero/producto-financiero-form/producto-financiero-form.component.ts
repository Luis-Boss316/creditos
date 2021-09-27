import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {
  _beneficiarios,
  _combo,
  _parametros,
  _productoFinanciero
} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";
import {ParametrosFormComponent} from "../parametros-form/parametros-form.component";
import {MatSnackBar} from "@angular/material/snack-bar";
import {BeneficiariosFormComponent} from "../../../solicitud/solicitudes/beneficiarios-form/beneficiarios-form.component";

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
              public advanceTableService: AdvanceRestService,
              private snackBar: MatSnackBar) { }

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
    let data: any;
    this.advanceTableService.initService('ParametrosProductos')
    this.advanceTableService.create<_parametros>().subscribe(result => {
      data = result;
      console.log(this.advanceTable)
      const dialogRef = this.dialog.open(ParametrosFormComponent, {
        data: { title: 'Parametros', disableClose: true, data: data, action: 'Agregar' }
      });
      dialogRef.afterClosed().subscribe((result) => {
        if (!result) { return }
        this.advanceTableService.initService('ParametrosProductos')
        this.advanceTableService.save<string>(result).subscribe(data => {
          this.showNotification( 'snackbar-success', 'Parametros Agregados', 'bottom', 'center' );
        }, error => {
          if (error._embedded !== undefined) {
            this.showNotification( 'snackbar-danger', '¡¡Error al guardar!!', 'bottom', 'center' );
            Object.entries(error._embedded.errors).forEach(([key, value]) => { });
          }
        })
      });
      this.advanceTableService.initService('ProductoFinanciero')
    });
  }

  showNotification(colorName, text, placementFrom, placementAlign) {
    this.snackBar.open(text, '', { duration: 2000, verticalPosition: placementFrom,
      horizontalPosition: placementAlign, panelClass: colorName });
  }
}
