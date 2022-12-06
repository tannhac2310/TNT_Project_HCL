package tnt.group.techstore.service;

import java.util.List;
import tnt.group.techstore.model.Comment;

public interface CommentService {
	//Comment
	Comment createComment(Comment comment, long customer_id, long product_id);
	Comment updateComment(Comment comment, long id);
	void deleteComment(long id);
	List<Comment> getCommentByCustomer(long customer_id);
	List<Comment> getCommentByProduct(long product_id);
}
