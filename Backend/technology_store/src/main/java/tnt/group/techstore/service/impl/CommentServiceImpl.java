package tnt.group.techstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tnt.group.techstore.exception.ResourceNotFoundException;
import tnt.group.techstore.model.Comment;
import tnt.group.techstore.repository.CommentRepository;
import tnt.group.techstore.repository.CustomerRepository;
import tnt.group.techstore.repository.ProductRepository;
import tnt.group.techstore.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentRepository commentRepo;
	private CustomerRepository customerRepo;
	private ProductRepository productRepo;

	@Override
	public Comment createComment(Comment comment, long customer_id, long product_id) {
		comment.setCustomer(customerRepo.findById(customer_id).orElseThrow(() -> 
		new ResourceNotFoundException("Comment", "CustomerId", customer_id)));
		comment.setProduct(productRepo.findById(product_id).orElseThrow(() -> 
		new ResourceNotFoundException("Comment", "ProductId", product_id)));
		return commentRepo.save(comment);
	}

	@Override
	public Comment updateComment(Comment comment, long id) {
		Comment existingComment = commentRepo.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Comment", "Id", id));
		if (!comment.getContent().equals("")){
			existingComment.setContent(comment.getContent());
		}
		if (!comment.getEvaluate().equals("")){
			existingComment.setEvaluate(comment.getEvaluate());
		}
		if (comment.getCustomer() != null){
			existingComment.setCustomer(comment.getCustomer());
		}
		if (comment.getProduct() != null){
			existingComment.setProduct(comment.getProduct());
		}
		commentRepo.save(existingComment);
		return existingComment;
	}

	@Override
	public void deleteComment(long id) {
		commentRepo.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Comment", "Id", id));
		commentRepo.deleteById(id);
	}

	@Override
	public List<Comment> getCommentByCustomer(long customer_id) {
		return commentRepo.findCommentByCustomerId(customer_id);
	}

	@Override
	public List<Comment> getCommentByProduct(long product_id) {
		return commentRepo.findCommentByProductId(product_id);
	}
}
