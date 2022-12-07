package tnt.group.techstore.service;

import java.util.List;

import tnt.group.techstore.model.Comment;
import tnt.group.techstore.model.Product;

public interface ProductService {

	Product getProductById(long id);
	
	List<Comment> getCommentByProduct(long procduct_id);
	
	List<Product> getAllProducts();
	
	Product createProduct(Product product, long id);
	
	Product updateProduct(Product product, long id);
	
	void deleteProduct(long id);

}
