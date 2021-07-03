import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {NgbModule} from "@ng-bootstrap/ng-bootstrap";
import {HTTP_INTERCEPTORS, HttpClientModule} from "@angular/common/http";
import {HashLocationStrategy, LocationStrategy} from "@angular/common";
import {PageLoaderComponent} from "./layout/page-loader/page-loader.component";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {ReactiveFormsModule} from "@angular/forms";
import {PERFECT_SCROLLBAR_CONFIG, PerfectScrollbarConfigInterface, PerfectScrollbarModule} from "ngx-perfect-scrollbar";
import {NgxSpinnerModule} from "ngx-spinner";
import {ClickOutsideModule} from "ng-click-outside";
import {NgxMaskModule} from "ngx-mask";
import {SharedModule} from "./shared/shared.module";
import {OwlNativeDateTimeModule} from "ng-pick-datetime";
import {ChartsModule} from "@progress/kendo-angular-charts";
import {LayoutModule} from "./layout/layout.module";
import {environment} from "../environments/environment";
import {DynamicScriptLoaderService} from "./shared/services/dynamic-script-loader.service";
import {RightSidebarService} from "./shared/services/rightsidebar.service";
import {AdvanceRestService} from "./shared/services/advance-rest.service";
import {GlobalService} from "./shared/services/global.service";
import {WINDOW_PROVIDERS} from "./shared/services/window.service";
import {ConfigService} from "./shared/services/config.service";
import {HttpCalIInterceptor} from "./http.interceptor";

const DEFAULT_PERFECT_SCROLLBAR_CONFIG: PerfectScrollbarConfigInterface = { suppressScrollX: true, wheelPropagation: false };


@NgModule({
  declarations: [
    AppComponent,
    PageLoaderComponent,
  ],
  imports: [
    BrowserModule, BrowserAnimationsModule, AppRoutingModule, NgbModule, HttpClientModule, ReactiveFormsModule,
    PerfectScrollbarModule, NgxSpinnerModule, ClickOutsideModule, NgxMaskModule.forRoot(), LayoutModule, SharedModule,
    OwlNativeDateTimeModule, ChartsModule
  ],
  providers: [
    {provide: LocationStrategy, useClass: HashLocationStrategy},
    { provide: 'API_URL', useValue: environment.serverUrl},
    { provide: HTTP_INTERCEPTORS, useClass: HttpCalIInterceptor, multi: true },
    { provide: PERFECT_SCROLLBAR_CONFIG, useValue: DEFAULT_PERFECT_SCROLLBAR_CONFIG },
    DynamicScriptLoaderService, RightSidebarService, AdvanceRestService, GlobalService, ConfigService, WINDOW_PROVIDERS
  ],
  entryComponents: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
