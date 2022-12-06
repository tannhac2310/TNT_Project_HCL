package tnt.group.techstore.service;

import java.util.List;

import tnt.group.techstore.model.Order;
import tnt.group.techstore.model.OrderDetail;
import tnt.group.techstore.payload.request.OrderRequest;

public interface OrderService {
	//Order
	Order createOrder(OrderRequest order);
	Order updateOrder(Order order, long id);
	void deleteOrder(long d);
	Double totalPrice(long id);
	List<Order> getAllOrders();
	Order getOrder(long id);
	OrderDetail updateOrderDetail(OrderDetail orderdetail, long id);
	List<OrderDetail> getOrderDetail(long id);
}