package tnt.group.techstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tnt.group.techstore.model.Account;
import tnt.group.techstore.model.Category;
import tnt.group.techstore.service.CategoryService;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
@RestController
@RequestMapping("/api/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	@GetMapping("/viewall")
	//@PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
	public List<Category> getAllCategorys(){
		List<Category> list = categoryService.getAllCategorys();
		for (Category a : list) {
			System.out.println(a.toString());
		}
		return categoryService.getAllCategorys();
	}
}
