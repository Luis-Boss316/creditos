import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_aseguradoras, _combo, _personas} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-persona-form',
  templateUrl: './persona-form.component.html',
  styleUrls: ['./persona-form.component.scss']
})
export class PersonaFormComponent implements OnInit {
  action: string;
  _personasForm: FormGroup;
  dialogTitle: string;
  advanceTable: _personas;
  public estadoCivilCombo: _combo[];
  public nacionalidadCombo: _combo[];
  public giroCombo: _combo[];
  public paisCombo: _combo[];
  public estadoCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<PersonaFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._personasForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'EstadoCivil'}, 'comboController').subscribe(result =>
      this.estadoCivilCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Nacionalidades'}, 'comboController').subscribe(result =>
      this.nacionalidadCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'GiroEmpresarial'}, 'comboController').subscribe(result =>
      this.giroCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Paises'}, 'comboController').subscribe(result =>
      this.paisCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Estados'}, 'comboController').subscribe(result =>
      this.estadoCombo = result);

    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._personasForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        primerNombre: [this.data.data.primerNombre, Validators.required],
        segundoNombre: [this.data.data.segundoNombre],
        apellidoPaterno: [this.data.data.apellidoPaterno, Validators.required],
        apellidoMaterno: [this.data.data.apellidoMaterno, Validators.required],
        genero: [this.data.data.genero],
        estadoCivil: [this.data.data.estadoCivil.id, Validators.required],
        nacionalidad: [this.data.data.nacionalidad.id, Validators.required],
        fechaNacimiento: [this.data.data.fechaNacimiento, Validators.required],
        actividad: [this.data.data.actividad],
        giro: [this.data.data.giro.id],
        paisNacimiento: [this.data.data.paisNacimiento.id, Validators.required],
        estadoNacimiento: [this.data.data.estadoNacimiento.id],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._personasForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        primerNombre: [this.data.data.primerNombre, Validators.required],
        segundoNombre: [this.data.data.segundoNombre],
        apellidoPaterno: [this.data.data.apellidoPaterno, Validators.required],
        apellidoMaterno: [this.data.data.apellidoMaterno, Validators.required],
        genero: [this.data.data.genero],
        estadoCivil: [this.data.data.estadoCivil, Validators.required],
        nacionalidad: [this.data.data.nacionalidad, Validators.required],
        fechaNacimiento: [this.data.data.fechaNacimiento, Validators.required],
        actividad: [this.data.data.actividad],
        giro: [this.data.data.giro],
        paisNacimiento: [this.data.data.paisNacimiento, Validators.required],
        estadoNacimiento: [this.data.data.estadoNacimiento],
      });
    }
  }

  extra() {

  }

  idetificaciones() {

  }

  domicilio() {

  }

  telefono() {

  }

  correo() {

  }

  contacto() {

  }

  cuentas() {

  }
}
