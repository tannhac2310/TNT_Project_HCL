import { Injectable } from '@angular/core';
import { PRODUCTS } from '../mock-data/mock-product';
import { Product } from '../mock-data/product';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  constructor() {}
  getProducts(): Product[] {
    return PRODUCTS;
  }
  getProduct(id: number) {
    return PRODUCTS.find((product) => product.id === id);
  }
}
