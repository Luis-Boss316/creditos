import { Component, OnInit } from '@angular/core';
import {MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-parametros-form',
  templateUrl: './parametros-form.component.html',
  styleUrls: ['./parametros-form.component.sass']
})
export class ParametrosFormComponent implements OnInit {

  constructor(public dialogRef: MatDialogRef<ParametrosFormComponent>,) { }

  ngOnInit(): void {
  }

}
