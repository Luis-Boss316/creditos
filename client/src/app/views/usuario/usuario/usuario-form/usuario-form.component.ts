import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";
import {MatSnackBar} from "@angular/material/snack-bar";
import {_combo} from "../../../../shared/interfaces/Creditos.interface";

@Component({
  selector: 'app-usuario-form',
  templateUrl: './usuario-form.component.html',
  styleUrls: ['./usuario-form.component.sass']
})
export class UsuarioFormComponent implements OnInit {
  action: string;
  hide = true;
  hide5 = true;
  _usuarioForm: FormGroup;
  dialogTitle: string;
  public perfillCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<UsuarioFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,
              private snackBar: MatSnackBar) { }

  users: _combo[] = [
    {id: 'avatar', descripcion: 'avatar'},
    {id: 'avatar2', descripcion: 'avatar2'},
    {id: 'avatar3', descripcion: 'avatar3'},
    {id: 'avatar4', descripcion: 'avatar4'},
    {id: 'avatar5', descripcion: 'avatar5'},
    {id: 'avatar6', descripcion: 'avatar6'},
    {id: 'avatar7', descripcion: 'avatar7'},
    {id: 'avatar8', descripcion: 'avatar8'},
    {id: 'avatar9', descripcion: 'avatar9'},
    {id: 'avatar10', descripcion: 'avatar10'},
    {id: 'avatar11', descripcion: 'avatar11'},
    {id: 'avatar12', descripcion: 'avatar12'},
    {id: 'avatar13', descripcion: 'avatar13'},
    {id: 'avatar14', descripcion: 'avatar14'},
  ];

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._usuarioForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.title;
      this._usuarioForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        username: [this.data.data.username, [Validators.required]],
        password: ['', [Validators.required]],
        password5: ['', [Validators.required]],
        nombre: [this.data.data.nombre, [Validators.required]],
        apellidoPaterno: [this.data.data.apellidoPaterno, [Validators.required]],
        apellidoMaterno: [this.data.data.apellidoMaterno, [Validators.required]],
        mail: [this.data.data.mail, [Validators.required, Validators.email]],
        avatar: [this.data.data.avatar, [Validators.required]],
        desde: [this.data.data.desde, [Validators.required]],
        nuevo: [this.data.data.nuevo, [Validators.required]],
        enabled: [this.data.data.enabled, [Validators.required]],
        accountExpired: [this.data.data.accountExpired, [Validators.required]],
        accountLocked: [this.data.data.accountLocked, [Validators.required]],
        passwordExpired: [this.data.data.passwordExpired, [Validators.required]],
        perfil: ['']
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this.advanceTableService.combo<_combo[]>({id: 'Role'}, 'comboSecurity').subscribe(result =>
        this.perfillCombo = result);
      this._usuarioForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        username: [this.data.data.username, [Validators.required]],
        password: [this.data.data.password, [Validators.required]],
        password5: [this.data.data.password5, [Validators.required]],
        nombre: [this.data.data.nombre, [Validators.required]],
        apellidoPaterno: [this.data.data.apellidoPaterno, [Validators.required]],
        apellidoMaterno: [this.data.data.apellidoMaterno, [Validators.required]],
        mail: [this.data.data.mail, [Validators.required, Validators.email]],
        avatar: ['avatar', [Validators.required]],
        desde: [this.data.data.desde, [Validators.required]],
        nuevo: [this.data.data.nuevo, [Validators.required]],
        enabled: [this.data.data.enabled, [Validators.required]],
        accountExpired: [this.data.data.accountExpired, [Validators.required]],
        accountLocked: [this.data.data.accountLocked, [Validators.required]],
        passwordExpired: [this.data.data.passwordExpired, [Validators.required]],
        perfil: ['', Validators.required]
      });
    }
  }

  showNotification(colorName, text, placementFrom, placementAlign) {
    this.snackBar.open(text, '', { duration: 2000, verticalPosition: placementFrom, horizontalPosition: placementAlign, panelClass: colorName });
  }
}
