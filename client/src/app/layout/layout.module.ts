import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AuthLayoutComponent } from './app-layout/auth-layout/auth-layout.component';
import { MainLayoutComponent } from './app-layout/main-layout/main-layout.component';
import {RightSidebarComponent} from "./right-sidebar/right-sidebar.component";
import {RouterModule} from "@angular/router";
import {SidebarComponent} from "./sidebar/sidebar.component";
import {HeaderComponent} from "./header/header.component";
import {PerfectScrollbarModule} from "ngx-perfect-scrollbar";
import {MatIconModule} from "@angular/material/icon";
import {MatButtonModule} from "@angular/material/button";
import {MatNativeDateModule} from "@angular/material/core";
import {MatDatepickerModule} from "@angular/material/datepicker";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatInputModule} from "@angular/material/input";
import {MatListModule} from "@angular/material/list";
import {MatButtonToggleModule} from "@angular/material/button-toggle";
@NgModule({
  imports: [CommonModule, NgbModule, RouterModule, MatIconModule, MatButtonModule, MatNativeDateModule, MatDatepickerModule, MatFormFieldModule,
    MatInputModule, MatListModule, MatButtonToggleModule, PerfectScrollbarModule],
  declarations: [AuthLayoutComponent, MainLayoutComponent, RightSidebarComponent, SidebarComponent, HeaderComponent]
})
export class LayoutModule {}
