import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {
  _avales,
  _beneficiarios,
  _coacreditados,
  _informacionPLD,
  _prospectos,
  _solicitudes
} from "../../../shared/interfaces/Creditos.interface";
import {BehaviorSubject, fromEvent, merge, Observable, Subscription} from "rxjs";
import {AdvanceRestService} from "../../../shared/services/advance-rest.service";
import {DataSource, SelectionModel} from "@angular/cdk/collections";
import {ProspectosDataSource} from "../../prospectos/prospecto/prospecto.component";
import {HttpClient} from "@angular/common/http";
import {GlobalService} from "../../../shared/services/global.service";
import {MatDialog} from "@angular/material/dialog";
import {Router} from "@angular/router";
import {MatSnackBar} from "@angular/material/snack-bar";
import {FormBuilder} from "@angular/forms";
import {MatPaginator} from "@angular/material/paginator";
import {MatSort} from "@angular/material/sort";
import {MatMenuTrigger} from "@angular/material/menu";
import {ProspectoFormComponent} from "../../prospectos/prospecto/prospecto-form/prospecto-form.component";
import {SolicitudesFormComponent} from "./solicitudes-form/solicitudes-form.component";
import {ProspectoDeleteComponent} from "../../prospectos/prospecto/prospecto-delete/prospecto-delete.component";
import {SolicitudesDeleteComponent} from "./solicitudes-delete/solicitudes-delete.component";
import {map} from "rxjs/operators";
import {CoacreditadosFormComponent} from "./coacreditados-form/coacreditados-form.component";
import {BeneficiariosFormComponent} from "./beneficiarios-form/beneficiarios-form.component";
import {InformacionFormComponent} from "./informacion-form/informacion-form.component";
import {AvalesFormComponent} from "./avales-form/avales-form.component";

@Component({
  selector: 'app-solicitudes',
  templateUrl: './solicitudes.component.html',
  styleUrls: ['./solicitudes.component.sass']
})
export class SolicitudesComponent implements OnInit {
  public _datos = { _title: 'Solicitudes',
    _modulo: 'Solicitud',
    _icono: 'fas fa-child',
    _dominio: 'Solicitudes',
    _componente: 'Solicitudes'}

  displayedColumns = [ 'select',
    'nombre',
    'fechaSolicitud',
    'sucursal',
    'producto',
    'concetoInversion',
    'fechaEntrega',
    'actions' ];

  id: number;
  data: _solicitudes;
  public getRowsSub: Subscription;
  db: AdvanceRestService;
  dataSource: SolicitudesDataSource | null;

  selection = new SelectionModel<_solicitudes>(true, []);
  advanceTable: _solicitudes | null;

  constructor(public httpClient: HttpClient, private globalService: GlobalService,
              public dialog: MatDialog, private router: Router,
              public advanceTableService: AdvanceRestService,
              private snackBar: MatSnackBar, private fBuilder: FormBuilder) { }

  @ViewChild(MatPaginator, { static: true }) paginator: MatPaginator;
  @ViewChild(MatSort, { static: true }) sort: MatSort;
  @ViewChild('filter', { static: true }) filter: ElementRef;
  @ViewChild(MatMenuTrigger, { static: true })
  contextMenu: MatMenuTrigger;
  contextMenuPosition = { x: '0px', y: '0px' };

  ngOnInit(): void {
    this.advanceTableService.initService(this._datos._dominio);
    this.loadData();
  }

  refresh() { this.loadData(); }

  addNew() {
    let data: any;
    this.advanceTableService.create<_solicitudes>().subscribe(result => {
      data = result;
      const dialogRef = this.dialog.open(SolicitudesFormComponent, {
        data: { title: this._datos._title, disableClose: true, data: data, action: 'Agregar' }
      });
      dialogRef.afterClosed().subscribe((result) => {
        if (!result) {
          return
        }

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
    this.advanceTableService.edit<_solicitudes>(this.id).subscribe(result => {
      this.data = result

      const dialogRef = this.dialog.open(SolicitudesFormComponent, {
        closeOnNavigation: true,
        data: {title: row.descripcionCorta, disableClose: true, data: this.data, action: 'Editar'}
      });
      dialogRef.afterClosed().subscribe((result) => {
        if (!result) {
          return
        }
        this.advanceTableService.update<string>(this.id, result)
          .subscribe(d => {
            this.showNotification('snackbar-success', '¡¡ ' + this._datos._title + ' Editada!!', 'bottom', 'center');
            this.refresh();
          }, error => {
            if (error._embedded !== undefined) {
              this.showNotification('snackbar-danger', 'Error al guardar', 'bottom', 'center');
              Object.entries(error._embedded.errors).forEach(([key, value]) => {
              });
            }
          })
        this.refreshTable();
      });

    });
  }

  deleteItem(row) {
    this.id = row.id;
    const dialogRef = this.dialog.open(SolicitudesDeleteComponent, { data: row });
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

  masterToggle() { this.isAllSelected() ? this.selection.clear() : this.dataSource.renderedData.forEach((row) =>
    this.selection.select(row))}

  removeSelectedRows() {
    const totalSelect = this.selection.selected.length;
    this.selection.selected.forEach((item) => {
      this.advanceTableService.delete<string>(item.id).subscribe()
      this.selection = new SelectionModel<_solicitudes>(true, []);
    });
    this.loadData();
    this.showNotification( 'snackbar-danger', totalSelect + '¡¡Registros Eliminados!!', 'bottom', 'center'  );
  }

  public loadData() {
    this.db = new AdvanceRestService(this.httpClient, this.globalService, this.fBuilder);
    this.dataSource = new SolicitudesDataSource( this.db, this.paginator, this.sort, this._datos._dominio );
    fromEvent(this.filter.nativeElement, 'keyup').subscribe(() => {
      if (!this.dataSource) { return; }
      this.dataSource.filter = this.filter.nativeElement.value;
    });
  }

  showNotification(colorName, text, placementFrom, placementAlign) {
    this.snackBar.open(text, '', { duration: 2000, verticalPosition: placementFrom,
      horizontalPosition: placementAlign, panelClass: colorName });
  }

  onContextMenu(event: MouseEvent, item: _solicitudes) {
    event.preventDefault();
    this.contextMenuPosition.x = event.clientX + 'px';
    this.contextMenuPosition.y = event.clientY + 'px';
    this.contextMenu.menuData = { item: item };
    this.contextMenu.menu.focusFirstItem('mouse');
    this.contextMenu.openMenu();
  }

  coacreditados(row) {
    let data: any;
    this.advanceTableService.initService('Coacreditados')
    this.advanceTableService.create<_solicitudes>().subscribe(result => {
      data = result;
      console.log(this.advanceTable)
      const dialogRef = this.dialog.open(CoacreditadosFormComponent, {
        data: { title: this._datos._title, disableClose: true, data: data, action: 'Agregar' }
      });
      dialogRef.afterClosed().subscribe((result) => {
        if (!result) { return }
        this.advanceTableService.initService('Coacreditados')
        this.advanceTableService.save<string>(result).subscribe(data => {
          this.showNotification( 'snackbar-success', 'Coacreditado Agregado', 'bottom', 'center' );
        }, error => {
          if (error._embedded !== undefined) {
            this.showNotification( 'snackbar-danger', '¡¡Error al guardar!!', 'bottom', 'center' );
            Object.entries(error._embedded.errors).forEach(([key, value]) => { });
          }
        })
      });
      this.advanceTableService.initService('Solicitudes')
    });
  }

  beneficiarios(row) {
    let data: any;
    this.advanceTableService.initService('Beneficiarios')
    this.advanceTableService.create<_beneficiarios>().subscribe(result => {
      data = result;
      console.log(this.advanceTable)
      const dialogRef = this.dialog.open(BeneficiariosFormComponent, {
        data: { title: this._datos._title, disableClose: true, data: data, action: 'Agregar' }
      });
      dialogRef.afterClosed().subscribe((result) => {
        if (!result) { return }
        this.advanceTableService.initService('Beneficiarios')
        this.advanceTableService.save<string>(result).subscribe(data => {
          this.showNotification( 'snackbar-success', 'Beneficiario Agregado', 'bottom', 'center' );
        }, error => {
          if (error._embedded !== undefined) {
            this.showNotification( 'snackbar-danger', '¡¡Error al guardar!!', 'bottom', 'center' );
            Object.entries(error._embedded.errors).forEach(([key, value]) => { });
          }
        })
      });
      this.advanceTableService.initService('Solicitudes')
    });
  }

  informacionPLD(row) {
    let data: any;
    this.advanceTableService.initService('InformacionPLD')
    this.advanceTableService.create<_informacionPLD>().subscribe(result => {
      data = result;
      console.log(this.advanceTable)
      const dialogRef = this.dialog.open(InformacionFormComponent, {
        data: { title: this._datos._title, disableClose: true, data: data, action: 'Agregar' }
      });
      dialogRef.afterClosed().subscribe((result) => {
        if (!result) { return }
        this.advanceTableService.initService('InformacionPLD')
        this.advanceTableService.save<string>(result).subscribe(data => {
          this.showNotification( 'snackbar-success', 'Informacion PLD Agregada', 'bottom', 'center' );
        }, error => {
          if (error._embedded !== undefined) {
            this.showNotification( 'snackbar-danger', '¡¡Error al guardar!!', 'bottom', 'center' );
            Object.entries(error._embedded.errors).forEach(([key, value]) => { });
          }
        })
      });
      this.advanceTableService.initService('Solicitudes')
    });
  }

  avales(row) {
    let data: any;
    this.advanceTableService.initService('Avales')
    this.advanceTableService.create<_avales>().subscribe(result => {
      data = result;
      console.log(this.advanceTable)
      const dialogRef = this.dialog.open(AvalesFormComponent, {
        data: { title: this._datos._title, disableClose: true, data: data, action: 'Agregar' }
      });
      dialogRef.afterClosed().subscribe((result) => {
        if (!result) { return }
        this.advanceTableService.initService('Avales')
        this.advanceTableService.save<string>(result).subscribe(data => {
          this.showNotification( 'snackbar-success', 'Aval Agregado', 'bottom', 'center' );
        }, error => {
          if (error._embedded !== undefined) {
            this.showNotification( 'snackbar-danger', '¡¡Error al guardar!!', 'bottom', 'center' );
            Object.entries(error._embedded.errors).forEach(([key, value]) => { });
          }
        })
      });
      this.advanceTableService.initService('Solicitudes')
    });
  }
}

export class SolicitudesDataSource extends DataSource<_solicitudes> {
  _filterChange = new BehaviorSubject('');
  get filter(): string { return this._filterChange.value; }
  set filter(filter: string) { this._filterChange.next(filter); }
  filteredData: _solicitudes[] = [];
  renderedData: _solicitudes[] = [];

  constructor(public _dataSource: AdvanceRestService, public _paginator: MatPaginator, public _sort: MatSort,
              private _dominio: string ) {
    super();
    this._filterChange.subscribe(() => (this._paginator.pageIndex = 0));
  }

  connect(): Observable<_solicitudes[]> {
    const displayDataChanges = [ this._dataSource.dataChange, this._sort.sortChange, this._filterChange, this._paginator.page ];
    this._dataSource.getAdvancedTable<any>(this._dominio,{'max': 100});
    return merge(...displayDataChanges).pipe( map(() => {
        this.filteredData = this._dataSource.data.slice().filter((advanceTable: _solicitudes) => {
          const searchStr = (
            advanceTable.nombre +
            advanceTable.sucursal +
            advanceTable.concetoInversion).toLowerCase();
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

  sortData(data: _solicitudes[]): _solicitudes[] {
    if (!this._sort.active || this._sort.direction === '') { return data; }
    return data.sort((a, b) => {
      let propertyA: number | string = '';
      let propertyB: number | string = '';
      switch (this._sort.active) {
        case 'id':
          [propertyA, propertyB] = [a.id, b.id];
          break;
        case 'nombre':
          [propertyA, propertyB] = [a.nombre, b.nombre];
          break;
        case 'concetoInversion':
          [propertyA, propertyB] = [a.concetoInversion, b.concetoInversion];
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
