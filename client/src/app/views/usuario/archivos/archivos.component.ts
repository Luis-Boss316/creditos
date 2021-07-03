import { Component, OnInit } from '@angular/core';
import {AdvanceRestService} from "../../../shared/services/advance-rest.service";
import {Kyc} from "../../../shared/interfaces/Creditos.interface";

@Component({
  selector: 'app-archivos',
  templateUrl: './archivos.component.html',
  styleUrls: ['./archivos.component.sass']
})
export class ArchivosComponent implements OnInit {
  public dominio =  'Kyc'
  public res: Kyc[]

  constructor(
    private restService: AdvanceRestService,
  ) { }

  ngOnInit(): void {
    this.index()
  }

  index() {
    this.restService.initService(this.dominio);
    this.restService.index<Kyc[]>({}).subscribe(respuesta => {
      this.res = respuesta
      // console.log(respuesta)
      console.log(this.res)
    })
  }
}
