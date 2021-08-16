import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";
import {MatSnackBar} from "@angular/material/snack-bar";
import {FileUploader} from "ng2-file-upload";

@Component({
  selector: 'app-kyc-form',
  templateUrl: './kyc-form.component.html',
  styleUrls: ['./kyc-form.component.sass']
})
export class KycFormComponent implements OnInit {
  action: string;
  _archivosForm: FormGroup;
  dialogTitle: string;

  constructor(public dialogRef: MatDialogRef<KycFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,
              private snackBar: MatSnackBar) { }

  submit() {}

  onNoClick(): void { this.dialogRef.close(); }

  public confirmAdd(): void {
    console.log(this._archivosForm.value)
    this.dialogRef.close(this._archivosForm.value);
  }

  ngOnInit(): void {
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.title;
      this._archivosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        tipoArchivo: [this.data.data.tipoArchivo, Validators.required],
        file: [null],
      });
    } else {
      this.dialogTitle = this.data.title;
      this._archivosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        tipoArchivo: [this.data.data.tipoArchivo, Validators.required],
        file: [null],
      });
    }
  }

  onFileChange(event) {
    const reader = new FileReader();
    const [file] = event.target.files;
    this._archivosForm.patchValue({file: file});
  }

}
