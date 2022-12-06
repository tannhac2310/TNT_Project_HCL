package tnt.group.techstore.service;

import java.util.List;

import tnt.group.techstore.model.Comment;
import tnt.group.techstore.model.Customer;
import tnt.group.techstore.model.Order;

public interface CustomerService {
	//Customer
	List<Customer> getAllCustomers();
	Customer save(Customer customer);
	Customer getCustomerById(long id);
	Customer updateCustomer(Customer customer, long id);
	void deleteCustomer(long id);
	List<Comment> getCommentByCustomer(long customer_id);
	List<Order> getOrderByCustomer(long customer_id);
}