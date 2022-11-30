package tnt.group.techstore.service;

import java.util.List;

import tnt.group.techstore.model.Category;

public interface CategoryService {
	//for category
	List<Category> getAllCategorys();
	Category getCategoryById(long id);
	Category createCategory(Category category);
	Category updateCategory(Category category, long id);
	void deleteCategory(long id);
}
