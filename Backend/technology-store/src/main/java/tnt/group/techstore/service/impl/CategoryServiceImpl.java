package tnt.group.techstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tnt.group.techstore.exception.ResourceNotFoundException;
import tnt.group.techstore.model.Category;
import tnt.group.techstore.repository.CategoryRepository;
import tnt.group.techstore.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryRepository categoryRepository;
	@Override
	public List<Category> getAllCategorys() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Category getCategoryById(long id) {
		return categoryRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Category", "Id", id));
	}

	@Override
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	@Override
	public Category updateCategory(Category category, long id) {
		Category existingCategory = categoryRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Category", "Id", id));
		if(!category.getName().equals("")){
			existingCategory.setName(category.getName());
		}
		if(!category.getStatus().equals("")){
			existingCategory.setStatus(category.getStatus());
		}
		if(!category.getDescription().equals("")){
			existingCategory.setDescription(category.getDescription());
		}
		categoryRepository.save(existingCategory);
		return existingCategory;
	}

	
	@Override
	public void deleteCategory(long id) {
		categoryRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Category", "Id", id));
		categoryRepository.deleteById(id);
	}
}
