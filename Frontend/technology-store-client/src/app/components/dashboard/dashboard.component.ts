import { Component, OnInit } from '@angular/core';
import { ProductService } from '../../services/product.service';
import { Product } from '../../mock-data/product';
@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css'],
})
export class DashboardComponent implements OnInit {
  products: Product[] = [];
  productlists: any = {};
  category: any = {};
  categoryId: number = 0;
  constructor(private productService: ProductService) {}

  ngOnInit(): void {
    this.products = this.productService.getProducts();
  }
  onEdit(id: number) {}
  onDelete(id: number) {}
  ngOnClick(event: any) {}
  onSaveCreate() {}
  onSaveEdit() {}
}
