import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { CoreModule } from './core/core.module';
import { NavigationModule } from './navigation/navigation.module';
import { SharedModule } from './shared/shared.module';
import { MaterialModule } from './material.module';
import {UsermgmtModule} from './feature/usermgmt/usermgmt.module';
import { AssetmgmtModule } from './feature/assetmgmt/assetmgmt.module';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    CoreModule,
    NavigationModule,
    SharedModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule,
    UsermgmtModule,
    AssetmgmtModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
