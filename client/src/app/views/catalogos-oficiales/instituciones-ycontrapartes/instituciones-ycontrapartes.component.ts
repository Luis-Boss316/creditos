import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {_institucionesYcontrapartes} from "../../../shared/interfaces/Creditos.interface";
import {DataSource, SelectionModel} from "@angular/cdk/collections";
import {BehaviorSubject, fromEvent, merge, Observable, Subscription} from "rxjs";
import {AdvanceRestService} from "../../../shared/services/advance-rest.service";
import {HttpClient} from "@angular/common/http";
import {GlobalService} from "../../../shared/services/global.service";
import {MatDialog} from "@angular/material/dialog";
import {MatSnackBar} from "@angular/material/snack-bar";
import {FormBuilder} from "@angular/forms";
import {MatPaginator} from "@angular/material/paginator";
import {MatSort} from "@angular/material/sort";
import {MatMenuTrigger} from "@angular/material/menu";
import {InstitucionesYcontrapartesFormComponent} from "./instituciones-ycontrapartes-form/instituciones-ycontrapartes-form.component";
import {InstitucionesYcontrapartesDeleteComponent} from "./instituciones-ycontrapartes-delete/instituciones-ycontrapartes-delete.component";
import {map} from "rxjs/operators";

@Component({
  selector: 'app-instituciones-ycontrapartes',
  templateUrl: './instituciones-ycontrapartes.component.html',
  styleUrls: ['./instituciones-ycontrapartes.component.sass']
})
export class InstitucionesYcontrapartesComponent implements OnInit {
  public _datos = { _title: 'Instituciones y Contrapartes', _modulo: 'CatalogosOficiales', _icono: 'fas fa-folder-open', _dominio: 'InstitucionesYContrapartes', _componente: 'Instituciones y Contrapartes'};
  displayedColumns = [ 'select',
    'claveInstitucionFinanciera',
    'descripcionCorta',
    'descripcion',
    'actions' ];

  selection = new SelectionModel<_institucionesYcontrapartes>(true, []);
  advanceTable: _institucionesYcontrapartes | null;

  id: number;
  public getRowsSub: Subscription;
  db: AdvanceRestService;
  dataSource: InstitucionesyContrapartesDataSource | null;

  constructor(public httpClient: HttpClient, private globalService: GlobalService, public dialog: MatDialog,
              public advanceTableService: AdvanceRestService, private snackBar: MatSnackBar, private fBuilder: FormBuilder) { }

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
    this.advanceTableService.create<_institucionesYcontrapartes>().subscribe(result => {
      data = result;
      console.log(this.advanceTable);
      const dialogRef = this.dialog.open(InstitucionesYcontrapartesFormComponent, {
        data: { title: this._datos._title, disableClose: true, data: data, action: 'Agregar' }
      });
      // tslint:disable-next-line:no-shadowed-variable
      dialogRef.afterClosed().subscribe((result) => {
        if (!result) { return; }

        // tslint:disable-next-line:no-shadowed-variable
        this.advanceTableService.save<string>(result).subscribe(data => {
          this.showNotification( 'snackbar-success', this._datos._title + 'Agregada!!', 'bottom', 'center' );
          this.refresh();
        }, error => {
          if (error._embedded !== undefined) {
            this.showNotification( 'snackbar-danger', '¡¡Error al guardar!!', 'bottom', 'center' );
            Object.entries(error._embedded.errors).forEach(([key, value]) => { });
          }
        });
        this.refreshTable();
      });
    });
  }

  editCall(row) {
    this.id = row.id;
    let data: any;
    this.advanceTableService.edit<_institucionesYcontrapartes>(this.id).subscribe(result => {
      data = result;
      console.log(this.advanceTable);
      const dialogRef = this.dialog.open(InstitucionesYcontrapartesFormComponent, {
        data: { title: row.descripcion , disableClose: true, data: data, action: 'Editar' }
      });
      // tslint:disable-next-line:no-shadowed-variable
      dialogRef.afterClosed().subscribe((result) => {
        if (!result) { return; }
        this.advanceTableService.update<string>(this.id, result)
          // tslint:disable-next-line:no-shadowed-variable
          .subscribe(data => {
            this.showNotification( 'snackbar-success', '¡¡ ' + this._datos._title + ' Editada!!', 'bottom', 'center' );
            this.refresh();
          }, error => {
            if (error._embedded !== undefined) {
              this.showNotification( 'snackbar-danger', 'Error al guardar', 'bottom', 'center' );
              Object.entries(error._embedded.errors).forEach(([key, value]) => {});
            }});
        this.refreshTable();
      });
    });
  }

  deleteItem(row) {
    this.id = row.id;
    const dialogRef = this.dialog.open(InstitucionesYcontrapartesDeleteComponent, { data: row });
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

  private refreshTable() { this.paginator._changePageSize(this.paginator.pageSize); }

  isAllSelected() {
    const numSelected = this.selection.selected.length;
    const numRows = this.dataSource.renderedData.length;
    return numSelected === numRows;
  }

  masterToggle() { this.isAllSelected() ? this.selection.clear() : this.dataSource.renderedData.forEach((row) =>
    this.selection.select(row)); }

  removeSelectedRows() {
    const totalSelect = this.selection.selected.length;
    this.selection.selected.forEach((item) => {
      this.advanceTableService.delete<string>(item.id).subscribe();
      this.selection = new SelectionModel<_institucionesYcontrapartes>(true, []);
    });
    this.loadData();
    this.showNotification( 'snackbar-danger', totalSelect + '¡¡Registros Eliminados!!', 'bottom', 'center'  );
  }

  public loadData() {
    this.db = new AdvanceRestService(this.httpClient, this.globalService, this.fBuilder);
    this.dataSource = new InstitucionesyContrapartesDataSource( this.db, this.paginator, this.sort, this._datos._dominio );
    fromEvent(this.filter.nativeElement, 'keyup').subscribe(() => {
      if (!this.dataSource) { return; }
      this.dataSource.filter = this.filter.nativeElement.value;
    });
  }

  showNotification(colorName, text, placementFrom, placementAlign) {
    this.snackBar.open(text, '', { duration: 2000, verticalPosition: placementFrom,
      horizontalPosition: placementAlign, panelClass: colorName });
  }

  onContextMenu(event: MouseEvent, item: _institucionesYcontrapartes) {
    event.preventDefault();
    this.contextMenuPosition.x = event.clientX + 'px';
    this.contextMenuPosition.y = event.clientY + 'px';
    this.contextMenu.menuData = { item: item };
    this.contextMenu.menu.focusFirstItem('mouse');
    this.contextMenu.openMenu();
  }
}

export class InstitucionesyContrapartesDataSource extends DataSource<_institucionesYcontrapartes> {
  _filterChange = new BehaviorSubject('');
  get filter(): string { return this._filterChange.value; }
  set filter(filter: string) { this._filterChange.next(filter); }
  filteredData: _institucionesYcontrapartes[] = [];
  renderedData: _institucionesYcontrapartes[] = [];

  constructor(public _dataSource: AdvanceRestService, public _paginator: MatPaginator, public _sort: MatSort, private _dominio: string ) {
    super();
    this._filterChange.subscribe(() => (this._paginator.pageIndex = 0));
  }

  connect(): Observable<_institucionesYcontrapartes[]> {
    const displayDataChanges = [ this._dataSource.dataChange, this._sort.sortChange, this._filterChange, this._paginator.page ];
    this._dataSource.getAdvancedTable<any>(this._dominio, {'max': 100});
    return merge(...displayDataChanges).pipe( map(() => {
        this.filteredData = this._dataSource.data.slice().filter((advanceTable: _institucionesYcontrapartes) => {
          const searchStr = ( advanceTable.id  + advanceTable.descripcion ).toLowerCase();
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

  sortData(data: _institucionesYcontrapartes[]): _institucionesYcontrapartes[] {
    if (!this._sort.active || this._sort.direction === '') { return data; }
    return data.sort((a, b) => {
      let propertyA: number | string = '';
      let propertyB: number | string = '';
      switch (this._sort.active) {
        case 'id':
          [propertyA, propertyB] = [a.id, b.id];
          break;
        case 'descripcion':
          [propertyA, propertyB] = [a.descripcion, b.descripcion];
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

