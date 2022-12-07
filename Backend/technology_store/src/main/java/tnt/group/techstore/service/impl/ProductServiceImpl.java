package tnt.group.techstore.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tnt.group.techstore.exception.ResourceNotFoundException;
import tnt.group.techstore.model.Category;
import tnt.group.techstore.model.Comment;
import tnt.group.techstore.model.Product;
import tnt.group.techstore.repository.CategoryRepository;
import tnt.group.techstore.repository.CommentRepository;
import tnt.group.techstore.repository.ProductRepository;
import tnt.group.techstore.repository.SupplierRepository;
import tnt.group.techstore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepo;
	@Autowired
	CommentRepository commentRepo;
	@Autowired
	SupplierRepository supplierRepo;
	@Autowired
	CategoryRepository categoryRepo;

	@Override
	public Product getProductById(long id) {
		return productRepo.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Product", "Id", id));
	}

	@Override
	public List<Comment> getCommentByProduct(long procduct_id) {
		return commentRepo.findCommentByProductId(procduct_id);
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public Product createProduct(Product product, long id) {
		Category existingCategory = categoryRepo.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Category", "Id", id));
		product.setCategory(existingCategory);
		return productRepo.save(product);
	}

	@Override
	public Product updateProduct(Product product, long id) {
		Product existingProduct = productRepo.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Product", "Id", id));

		if (!product.getName().equals("")) {
			existingProduct.setName(product.getName());
		}
		if (product.getPrice() > 0) {
			existingProduct.setPrice(product.getPrice());
		}
		existingProduct.setSaleOff(product.getSaleOff());
		if (!product.getImage().equals("")) {
			existingProduct.setImage(product.getImage());
		}
		existingProduct.setAmount(product.getAmount());
		existingProduct.setDescription(product.getDescription());
		//existingProduct.setCommentList(product.getCommentList());
		productRepo.save(existingProduct);
		return existingProduct;
	}

	@Override
	public void deleteProduct(long id) {
		productRepo.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Product", "Id", id));
		productRepo.deleteById(id);
	}
}
