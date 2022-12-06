package tnt.group.techstore.service;

import java.util.List;

import tnt.group.techstore.model.OrderDetail;


public interface OrderDetailService {
	//Order detail
	List<OrderDetail> getOrddetailByOrderId(long id);
	OrderDetail createOrderDetail(OrderDetail orddetail);
	OrderDetail updateOrderDetail(OrderDetail orddetail, long id);
	void deleteOrderDetail(long id);
	void autoUpdateOrd(OrderDetail orddetail);
}
