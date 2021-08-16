import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {DataSource, SelectionModel} from "@angular/cdk/collections";
import {
  _aseguradoras,
  _contactos, _correos,
  _datosAlternos,
  _datosBancarios,
  _personas, _telefonos
} from "../../../shared/interfaces/Creditos.interface";
import {BehaviorSubject, fromEvent, merge, Observable, Subscription} from "rxjs";
import {AdvanceRestService} from "../../../shared/services/advance-rest.service";
import {AseguradorasDataSource} from "../../catalogos/aseguradoras/aseguradoras.component";
import {HttpClient} from "@angular/common/http";
import {GlobalService} from "../../../shared/services/global.service";
import {MatDialog} from "@angular/material/dialog";
import {MatSnackBar} from "@angular/material/snack-bar";
import {FormBuilder} from "@angular/forms";
import {MatPaginator} from "@angular/material/paginator";
import {MatSort} from "@angular/material/sort";
import {MatMenuTrigger} from "@angular/material/menu";
import {AseguradorasFormComponent} from "../../catalogos/aseguradoras/aseguradoras-form/aseguradoras-form.component";
import {PersonaFormComponent} from "./persona-form/persona-form.component";
import {AseguradorasDeleteComponent} from "../../catalogos/aseguradoras/aseguradoras-delete/aseguradoras-delete.component";
import {PersonaDeleteComponent} from "./persona-delete/persona-delete.component";
import {map} from "rxjs/operators";
import {Router} from "@angular/router";
import {DatosFormComponent} from "./datos-form/datos-form.component";
import {DatosBancariosFormComponent} from "./datos-bancarios-form/datos-bancarios-form.component";
import {ContactosFormComponent} from "./contactos-form/contactos-form.component";
import {CorreosFormComponent} from "./correos-form/correos-form.component";
import {TelefonosFormComponent} from "./telefonos-form/telefonos-form.component";

@Component({
  selector: 'app-persona',
  templateUrl: './persona.component.html',
  styleUrls: ['./persona.component.sass']
})
export class PersonaComponent implements OnInit {
  public _datos = { _title: 'Personas', _modulo: 'Personas', _icono: 'fas fa-child', _dominio: 'Personas', _componente: 'Persona'}
  // public _alterno = {_title: 'Datos Alternos', _dominio: 'DatosAlternos'}

  displayedColumns = [ 'select',
    'primerNombre',
    'segundoNombre',
    'apellidoPaterno',
    'apellidoMaterno',
    // 'genero',
    // 'estadoCivil',
    'nacionalidad',
    // 'fechaNacimiento',
    // 'actividad',
    // 'giro',
    'paisNacimiento',
    // 'estadoNacimiento',
    'actions' ];

  selection = new SelectionModel<_personas>(true, []);
  advanceTable: _personas | null;

  id: number;
  public getRowsSub: Subscription;
  db: AdvanceRestService;
  dataSource: PersonasDataSource | null;

  constructor(public httpClient: HttpClient, private globalService: GlobalService, public dialog: MatDialog, private router: Router,
              public advanceTableService: AdvanceRestService, private snackBar: MatSnackBar, private fBuilder: FormBuilder) { }

  @ViewChild(MatPaginator, { static: true }) paginator: MatPaginator;
  @ViewChild(MatSort, { static: true }) sort: MatSort;
  @ViewChild('filter', { static: true }) filter: ElementRef;
  @ViewChild(MatMenuTrigger, { static: true })
  contextMenu: MatMenuTrigger;
  contextMenuPosition = { x: '0px', y: '0px' };

  ngOnInit(): void {
    this.advanceTableService.initService(this._datos._dominio);
    // this.ats.initService(this._alterno._dominio);
    this.loadData();
  }

  refresh() { this.loadData(); }

  addNew() {
    let data: any;
    this.advanceTableService.create<_personas>().subscribe(result => {
      data = result;
      console.log(this.advanceTable)
      const dialogRef = this.dialog.open(PersonaFormComponent, {
        data: { title: this._datos._title, disableClose: true, data: data, action: 'Agregar' }
      });
      dialogRef.afterClosed().subscribe((result) => {
        if (!result) { return }

        this.advanceTableService.save<string>(result).subscribe(data => {
          this.showNotification( 'snackbar-success', this._datos._title + 'Agregada!!', 'bottom', 'center' );
          this.refresh();
        }, error => {
          if (error._embedded !== undefined) {
            this.showNotification( 'snackbar-danger', '¡¡Error al guardar!!', 'bottom', 'center' );
            Object.entries(error._embedded.errors).forEach(([key, value]) => { });
          }
        })
        this.refreshTable();
      });
    });
  }

  editCall(row) {
    this.id = row.id;
    let data: any;
    this.advanceTableService.edit<_personas>(this.id).subscribe(result => {
      data = result;
      console.log(this.advanceTable)
      const dialogRef = this.dialog.open(PersonaFormComponent, {
        data: { title: row.descripcionCorta , disableClose: true, data: data, action: 'Editar' }
      });
      dialogRef.afterClosed().subscribe((result) => {
        if (!result) { return }
        this.advanceTableService.update<string>(this.id, result)
          .subscribe(data => {
            this.showNotification( 'snackbar-success','¡¡ ' + this._datos._title + ' Editada!!', 'bottom', 'center' );
            this.refresh();
          }, error => {
            if (error._embedded !== undefined) {
              this.showNotification( 'snackbar-danger', 'Error al guardar', 'bottom', 'center' );
              Object.entries(error._embedded.errors).forEach(([key, value]) => {});
            }})
        this.refreshTable();
      });
      // this.router.navigate(['/Personas/Datos/5']);
    });
  }

  deleteItem(row) {
    this.id = row.id;
    const dialogRef = this.dialog.open(PersonaDeleteComponent, { data: row });
    dialogRef.afterClosed().subscribe((result) => {
      if (result) {
        this.advanceTableService.delete<string>(row.id)
          .subscribe(data => {
            this.showNotification( 'snackbar-danger', '¡¡ ' + this._datos._title + ' Eliminada!!', 'bottom', 'center' );
            this.refresh();
          }, error => {
            this.showNotification( 'snackbar-danger', '¡Error al eliminar! Este registro esta siendo utilizado', 'bottom', 'center' );
            Object.entries(error._embedded.errors).forEach(([key, value]) => { });
          });
      }
    });
  }

  private refreshTable() { this.paginator._changePageSize(this.paginator.pageSize) }

  isAllSelected() {
    const numSelected = this.selection.selected.length;
    const numRows = this.dataSource.renderedData.length;
    return numSelected === numRows;
  }

  masterToggle() { this.isAllSelected() ? this.selection.clear() : this.dataSource.renderedData.forEach((row) => this.selection.select(row))}

  removeSelectedRows() {
    const totalSelect = this.selection.selected.length;
    this.selection.selected.forEach((item) => {
      this.advanceTableService.delete<string>(item.id).subscribe()
      this.selection = new SelectionModel<_personas>(true, []);
    });
    this.loadData();
    this.showNotification( 'snackbar-danger', totalSelect + '¡¡Registros Eliminados!!', 'bottom', 'center'  );
  }

  public loadData() {
    this.db = new AdvanceRestService(this.httpClient, this.globalService, this.fBuilder);
    this.dataSource = new PersonasDataSource( this.db, this.paginator, this.sort, this._datos._dominio );
    fromEvent(this.filter.nativeElement, 'keyup').subscribe(() => {
      if (!this.dataSource) { return; }
      this.dataSource.filter = this.filter.nativeElement.value;
    });
  }

  showNotification(colorName, text, placementFrom, placementAlign) {
    this.snackBar.open(text, '', { duration: 2000, verticalPosition: placementFrom, horizontalPosition: placementAlign, panelClass: colorName });
  }

  onContextMenu(event: MouseEvent, item: _personas) {
    event.preventDefault();
    this.contextMenuPosition.x = event.clientX + 'px';
    this.contextMenuPosition.y = event.clientY + 'px';
    this.contextMenu.menuData = { item: item };
    this.contextMenu.menu.focusFirstItem('mouse');
    this.contextMenu.openMenu();
  }

  more(row) {
    let data: any;
    this.advanceTableService.initService('DatosAlternos')
    this.advanceTableService.create<_datosAlternos>().subscribe(result => {
      data = result;
      console.log(this.advanceTable)
      const dialogRef = this.dialog.open(DatosFormComponent, {
        data: { title: this._datos._title, disableClose: true, data: data, action: 'Agregar' }
      });
      dialogRef.afterClosed().subscribe((result) => {
        if (!result) { return }
        this.advanceTableService.initService('DatosAlternos')
        this.advanceTableService.save<string>(result).subscribe(data => {
          this.showNotification( 'snackbar-success', 'Datos Alternos Agregados', 'bottom', 'center' );
        }, error => {
          if (error._embedded !== undefined) {
            this.showNotification( 'snackbar-danger', '¡¡Error al guardar!!', 'bottom', 'center' );
            Object.entries(error._embedded.errors).forEach(([key, value]) => { });
          }
        })
      });
      this.advanceTableService.initService('Personas')
    });
  }

  bancario(row) {
    let data: any;
    this.advanceTableService.initService('DatosBancarios')
    this.advanceTableService.create<_datosBancarios>().subscribe(result => {
      data = result;
      console.log(this.advanceTable)
      const dialogRef = this.dialog.open(DatosBancariosFormComponent, {
        data: { title: this._datos._title, disableClose: true, data: data, action: 'Agregar' }
      });
      dialogRef.afterClosed().subscribe((result) => {
        if (!result) { return }
        this.advanceTableService.initService('DatosBancarios')
        this.advanceTableService.save<string>(result).subscribe(data => {
          this.showNotification( 'snackbar-success', 'Cuenta Bancaria Agregada', 'bottom', 'center' );
        }, error => {
          if (error._embedded !== undefined) {
            this.showNotification( 'snackbar-danger', '¡¡Error al guardar!!', 'bottom', 'center' );
            Object.entries(error._embedded.errors).forEach(([key, value]) => { });
          }
        })
      });
      this.advanceTableService.initService('Personas')
    });
  }

  contacto(row) {
    let data: any;
    this.advanceTableService.initService('Contactos')
    this.advanceTableService.create<_contactos>().subscribe(result => {
      data = result;
      console.log(this.advanceTable)
      const dialogRef = this.dialog.open(ContactosFormComponent, {
        data: { title: this._datos._title, disableClose: true, data: data, action: 'Agregar' }
      });
      dialogRef.afterClosed().subscribe((result) => {
        if (!result) { return }
        this.advanceTableService.initService('Contactos')
        this.advanceTableService.save<string>(result).subscribe(data => {
          this.showNotification( 'snackbar-success',  'Contacto Agregado', 'bottom', 'center' );
        }, error => {
          if (error._embedded !== undefined) {
            this.showNotification( 'snackbar-danger', '¡¡Error al guardar!!', 'bottom', 'center' );
            Object.entries(error._embedded.errors).forEach(([key, value]) => { });
          }
        })
      });
      this.advanceTableService.initService('Personas')
    });
  }

  correo(row) {
    let data: any;
    this.advanceTableService.initService('Correos')
    this.advanceTableService.create<_correos>().subscribe(result => {
      data = result;
      console.log(this.advanceTable)
      const dialogRef = this.dialog.open(CorreosFormComponent, {
        data: { title: this._datos._title, disableClose: true, data: data, action: 'Agregar' }
      });
      dialogRef.afterClosed().subscribe((result) => {
        if (!result) { return }
        this.advanceTableService.initService('Correos')
        this.advanceTableService.save<string>(result).subscribe(data => {
          this.showNotification( 'snackbar-success',  'Contacto Agregado', 'bottom', 'center' );
        }, error => {
          if (error._embedded !== undefined) {
            this.showNotification( 'snackbar-danger', '¡¡Error al guardar!!', 'bottom', 'center' );
            Object.entries(error._embedded.errors).forEach(([key, value]) => { });
          }
        })
      });
      this.advanceTableService.initService('Personas')
    });
  }

  telefono(row) {
    let data: any;
    this.advanceTableService.initService('Telefonos')
    this.advanceTableService.create<_telefonos>().subscribe(result => {
      data = result;
      console.log(this.advanceTable)
      const dialogRef = this.dialog.open(TelefonosFormComponent, {
        data: { title: this._datos._title, disableClose: true, data: data, action: 'Agregar' }
      });
      dialogRef.afterClosed().subscribe((result) => {
        if (!result) { return }
        this.advanceTableService.initService('Telefonos')
        this.advanceTableService.save<string>(result).subscribe(data => {
          this.showNotification( 'snackbar-success',  'Contacto Agregado', 'bottom', 'center' );
        }, error => {
          if (error._embedded !== undefined) {
            this.showNotification( 'snackbar-danger', '¡¡Error al guardar!!', 'bottom', 'center' );
            Object.entries(error._embedded.errors).forEach(([key, value]) => { });
          }
        })
      });
      this.advanceTableService.initService('Personas')
    });
  }
}

export class PersonasDataSource extends DataSource<_personas> {
  _filterChange = new BehaviorSubject('');
  get filter(): string { return this._filterChange.value; }
  set filter(filter: string) { this._filterChange.next(filter); }
  filteredData: _personas[] = [];
  renderedData: _personas[] = [];

  constructor(public _dataSource: AdvanceRestService, public _paginator: MatPaginator, public _sort: MatSort, private _dominio: string ) {
    super();
    this._filterChange.subscribe(() => (this._paginator.pageIndex = 0));
  }

  connect(): Observable<_personas[]> {
    const displayDataChanges = [ this._dataSource.dataChange, this._sort.sortChange, this._filterChange, this._paginator.page ];
    this._dataSource.getAdvancedTable<any>(this._dominio,{'max': 100});
    return merge(...displayDataChanges).pipe( map(() => {
        this.filteredData = this._dataSource.data.slice().filter((advanceTable: _personas) => {
          const searchStr = ( advanceTable.id + advanceTable.primerNombre + advanceTable.apellidoPaterno + advanceTable.genero ).toLowerCase();
          return searchStr.indexOf(this.filter.toLowerCase()) !== -1;
        });
        const sortedData = this.sortData(this.filteredData.slice());
        const startIndex = this._paginator.pageIndex * this._paginator.pageSize;
        this.renderedData = sortedData.splice( startIndex, this._paginator.pageSize );
        return this.renderedData;
      })
    );
  }

  disconnect() {}

  sortData(data: _personas[]): _personas[] {
    if (!this._sort.active || this._sort.direction === '') { return data; }
    return data.sort((a, b) => {
      let propertyA: number | string = '';
      let propertyB: number | string = '';
      switch (this._sort.active) {
        case 'id':
          [propertyA, propertyB] = [a.id, b.id];
          break;
        case 'primerNombre':
          [propertyA, propertyB] = [a.primerNombre, b.primerNombre];
          break;
        case 'apellidoPaterno':
          [propertyA, propertyB] = [a.apellidoPaterno, b.apellidoPaterno];
          break;
        case 'genero':
          [propertyA, propertyB] = [a.genero, b.genero];
          break;
      }
      const valueA = isNaN(+propertyA) ? propertyA : +propertyA;
      const valueB = isNaN(+propertyB) ? propertyB : +propertyB;
      return (
        (valueA < valueB ? -1 : 1) * (this._sort.direction === 'asc' ? 1 : -1)
      );
    });
  }
}
