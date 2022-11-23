import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { LoginComponent } from './components/login/login.component';
import { SignupComponent } from './components/signup/signup.component';
import { ProductComponent } from './components/product/product.component';
import { ProductSingleComponent } from './components/product-single/product-single.component';
import { CartComponent } from './components/cart/cart.component';
import { OrdersComponent } from './components/orders/orders.component';
import { OrderDetailComponent } from './components/order-detail/order-detail.component';
import { ProfileDetailComponent } from './components/profile-detail/profile-detail.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'signup', component: SignupComponent },
  { path: '', component: ProductComponent },
  { path: 'product', component: ProductComponent },
  { path: 'product/:id', component: ProductSingleComponent },
  { path: 'cart', component: CartComponent },
  { path: 'order', component: OrdersComponent },
  { path: 'order/:id', component: OrderDetailComponent },
  { path: 'profile-details', component: ProfileDetailComponent },
  { path: 'dashboard', component: DashboardComponent },
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
