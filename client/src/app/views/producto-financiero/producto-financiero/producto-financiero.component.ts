import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {DataSource, SelectionModel} from "@angular/cdk/collections";
import {_productoFinanciero} from "../../../shared/interfaces/Creditos.interface";
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
import {ProductoFinancieroFormComponent} from "./producto-financiero-form/producto-financiero-form.component";
import {ProductoFinancieroDeleteComponent} from "./producto-financiero-delete/producto-financiero-delete.component";
import {map} from "rxjs/operators";

@Component({
  selector: 'app-producto-financiero',
  templateUrl: './producto-financiero.component.html',
  styleUrls: ['./producto-financiero.component.sass']
})
export class ProductoFinancieroComponent implements OnInit {
  public _datos = { _title: 'Productos Financieros',
    _modulo: 'Producto-Financiero',
    _icono: 'fas fa-folder-open',
    _dominio: 'ProductoFinanciero',
    _componente: 'Producto Financiero'}

  displayedColumns = [ 'select',
    'producto',
    'montoMinimo',
    'montoMaximo',
    'tipo',
    'activo',
    'actions' ];

  selection = new SelectionModel<_productoFinanciero>(true, []);
  advanceTable: _productoFinanciero | null;

  id: number;
  public getRowsSub: Subscription;
  db: AdvanceRestService;
  dataSource: ProductoFinancieroDataSource | null;

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
    this.advanceTableService.create<_productoFinanciero>().subscribe(result => {
      data = result;
      console.log(this.advanceTable)
      const dialogRef = this.dialog.open(ProductoFinancieroFormComponent, {
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
    this.advanceTableService.edit<_productoFinanciero>(this.id).subscribe(result => {
      data = result;
      console.log(this.advanceTable)
      const dialogRef = this.dialog.open(ProductoFinancieroFormComponent, {
        closeOnNavigation: true,
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
    });
  }

  deleteItem(row) {
    this.id = row.id;
    const dialogRef = this.dialog.open(ProductoFinancieroDeleteComponent, { data: row });
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
      this.selection = new SelectionModel<_productoFinanciero>(true, []);
    });
    this.loadData();
    this.showNotification( 'snackbar-danger', totalSelect + '¡¡Registros Eliminados!!', 'bottom', 'center'  );
  }

  public loadData() {
    this.db = new AdvanceRestService(this.httpClient, this.globalService, this.fBuilder);
    this.dataSource = new ProductoFinancieroDataSource( this.db, this.paginator, this.sort, this._datos._dominio );
    fromEvent(this.filter.nativeElement, 'keyup').subscribe(() => {
      if (!this.dataSource) { return; }
      this.dataSource.filter = this.filter.nativeElement.value;
    });
  }

  showNotification(colorName, text, placementFrom, placementAlign) {
    this.snackBar.open(text, '', { duration: 2000, verticalPosition: placementFrom, horizontalPosition: placementAlign, panelClass: colorName });
  }

  onContextMenu(event: MouseEvent, item: _productoFinanciero) {
    event.preventDefault();
    this.contextMenuPosition.x = event.clientX + 'px';
    this.contextMenuPosition.y = event.clientY + 'px';
    this.contextMenu.menuData = { item: item };
    this.contextMenu.menu.focusFirstItem('mouse');
    this.contextMenu.openMenu();
  }
}

export class ProductoFinancieroDataSource extends DataSource<_productoFinanciero> {
  _filterChange = new BehaviorSubject('');
  get filter(): string { return this._filterChange.value; }
  set filter(filter: string) { this._filterChange.next(filter); }
  filteredData: _productoFinanciero[] = [];
  renderedData: _productoFinanciero[] = [];

  constructor(public _dataSource: AdvanceRestService, public _paginator: MatPaginator, public _sort: MatSort, private _dominio: string ) {
    super();
    this._filterChange.subscribe(() => (this._paginator.pageIndex = 0));
  }

  connect(): Observable<_productoFinanciero[]> {
    const displayDataChanges = [ this._dataSource.dataChange, this._sort.sortChange, this._filterChange, this._paginator.page ];
    this._dataSource.getAdvancedTable<any>(this._dominio,{'max': 100});
    return merge(...displayDataChanges).pipe( map(() => {
        this.filteredData = this._dataSource.data.slice().filter((advanceTable: _productoFinanciero) => {
          const searchStr = ( advanceTable.id + advanceTable.producto + advanceTable.tipo + advanceTable.clasificacionBancaria ).toLowerCase();
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

  sortData(data: _productoFinanciero[]): _productoFinanciero[] {
    if (!this._sort.active || this._sort.direction === '') { return data; }
    return data.sort((a, b) => {
      let propertyA: number | string = '';
      let propertyB: number | string = '';
      switch (this._sort.active) {
        case 'id':
          [propertyA, propertyB] = [a.id, b.id];
          break;
        case 'producto':
          [propertyA, propertyB] = [a.producto, b.producto];
          break;
        case 'tipo':
          [propertyA, propertyB] = [a.tipo, b.tipo];
          break;
        case 'clasificacionBancaria':
          [propertyA, propertyB] = [a.clasificacionBancaria, b.clasificacionBancaria];
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
