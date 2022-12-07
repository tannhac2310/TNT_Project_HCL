import { Component, OnInit } from '@angular/core';
import { CategoryService } from 'src/app/service/category/category.service';
@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css'],
})
export class FooterComponent implements OnInit {
  category: any = {};
  errorMessage = '';
  constructor(private categoryService: CategoryService) {}

  ngOnInit(): void {
    this.categoryService.getAllCategory().subscribe({
      next: (data) => {
        this.category = data;
        //this.products=data;
        console.log(data);
      },
      error: (err) => {
        console.log(err);
        this.errorMessage = err.error.message;
      },
    });
  }
}
