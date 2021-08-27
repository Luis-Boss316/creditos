import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {MainLayoutComponent} from "./layout/app-layout/main-layout/main-layout.component";
import {AuthGuard} from "./shared/security/auth.guard";
import {AuthLayoutComponent} from "./layout/app-layout/auth-layout/auth-layout.component";
import {Page404Component} from "./authentication/page404/page404.component";

const routes: Routes = [
  {
    path: '',
    component: MainLayoutComponent,
    canActivate: [AuthGuard],
    children: [
      { path: '', redirectTo: '/Autenticacion/Login', pathMatch: 'full' },
      {
        path: 'Catalogos',
        loadChildren: () => import('./views/catalogos/catalogos.module').then((m) => m.CatalogosModule)
      },
      {
        path: 'CatalogosOficiales',
        loadChildren: () => import('./views/catalogos-oficiales/catalogos-oficiales.module').then((m) => m.CatalogosOficialesModule)
      },
      {
        path: 'ParametrosCredito',
        loadChildren: () => import('./views/parametros-credito/parametros-credito.module').then((m) => m.ParametrosCreditoModule)
      },
      {
        path: 'Personas',
        loadChildren: () => import('./views/personas/personas.module').then((m) => m.PersonasModule)
      },
      {
        path: 'Negocios',
        loadChildren: () => import('./views/negocios/negocios.module').then((m) => m.NegociosModule)
      },
      {
        path: 'Prospectos',
        loadChildren: () => import('./views/prospectos/prospectos.module').then((m) => m.ProspectosModule)
      },
      // {
      //   path: 'Clientes',
      //   loadChildren: () => import('./views/clientes/clientes.module').then((m) => m.ClientesModule)
      // },
      {
        path: 'Usuario',
        loadChildren: () => import('./views/usuario/usuario.module').then((m) => m.UsuarioModule)
      }
      ]
  },
  {
    path: 'Autenticacion',
    component: AuthLayoutComponent,
    loadChildren: () =>
      import('./authentication/authentication.module').then(
        (m) => m.AuthenticationModule
      )
  },
  { path: '**', component: Page404Component }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
