package tnt.group.techstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category createCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category updateCategory(Category category, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCategory(long id) {
		// TODO Auto-generated method stub
		
	}

}
