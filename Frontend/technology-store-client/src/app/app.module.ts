import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';
import { ProductComponent } from './components/product/product.component';
import { CartComponent } from './components/cart/cart.component';
import { CheckoutComponent } from './components/checkout/checkout.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { FooterComponent } from './components/footer/footer.component';
import { HeaderComponent } from './components/header/header.component';
import { ForgotPasswordComponent } from './components/forgot-password/forgot-password.component';
import { MenuInfoComponent } from './components/menu-info/menu-info.component';
import { OrdersComponent } from './components/orders/orders.component';
import { OrderDetailComponent } from './components/order-detail/order-detail.component';
import { ProductSingleComponent } from './components/product-single/product-single.component';
import { SignupComponent } from './components/signup/signup.component';
import { ProfileDetailComponent } from './components/profile-detail/profile-detail.component';
import { SlickCarouselModule } from 'ngx-slick-carousel';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    ProductComponent,
    CartComponent,
    CheckoutComponent,
    DashboardComponent,
    FooterComponent,
    HeaderComponent,
    ForgotPasswordComponent,
    MenuInfoComponent,
    OrdersComponent,
    OrderDetailComponent,
    ProductSingleComponent,
    SignupComponent,
    ProfileDetailComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, SlickCarouselModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
