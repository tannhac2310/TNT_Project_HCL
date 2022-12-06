package tnt.group.techstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tnt.group.techstore.exception.ResourceNotFoundException;
import tnt.group.techstore.model.Order;
import tnt.group.techstore.model.OrderDetail;
import tnt.group.techstore.model.Product;
import tnt.group.techstore.repository.OrderDetailRepository;
import tnt.group.techstore.repository.OrderRepository;
import tnt.group.techstore.repository.ProductRepository;
import tnt.group.techstore.service.OrderDetailService;



@Service
public class OrderDetailServiceImpl implements OrderDetailService{

	@Autowired
	private OrderDetailRepository orddetailRepo;
	private ProductRepository productRepo;
	private OrderRepository ordRepo;
	
	@Override
	public List<OrderDetail> getOrddetailByOrderId (long id) {		
		
		return orddetailRepo.getDetailByOrder(id);
	}
	
	@Override
	public OrderDetail createOrderDetail (OrderDetail orddetail) {
		
		Product product = productRepo.findById(orddetail.getProduct().getId()).orElseThrow(() -> 
		new ResourceNotFoundException("Product", "Id", orddetail.getProduct().getId()));
		
		if(product!=null) {							
			orddetailRepo.save(orddetail);
			autoUpdateOrd(orddetail);
			return orddetail;
		}
		return null;
	}
	@Override
	public OrderDetail updateOrderDetail (OrderDetail orddetail, long id) {
		OrderDetail exist = orddetailRepo.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("OrderDetail", "Id", id));
		Product product = productRepo.findById(orddetail.getProduct().getId()).orElseThrow(() -> 
		new ResourceNotFoundException("Product", "Id", orddetail.getProduct().getId()));
		
		
		if(product!=null) {
			exist.setProduct(orddetail.getProduct());
		}
		if(ordRepo.findById(orddetail.getOrder().getId())!=null) {
			exist.setOrder(orddetail.getOrder());
		}
		if( (orddetail.getAmount()>0) &&(orddetail.getAmount())<=orddetail.getProduct().getAmount()){
			exist.setAmount(orddetail.getAmount());
		}
		orddetailRepo.save(exist);
		autoUpdateOrd(exist);
		return exist;
	}

	@Override
	public void deleteOrderDetail (long id) {
		orddetailRepo.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("OrderDetail", "Id", id));
		orddetailRepo.deleteById(id);
	}
	
	@Override
	public void autoUpdateOrd (OrderDetail orddetail) {
		Order order = ordRepo.findById(orddetail.getOrder().getId()).orElseThrow(() -> 
		new ResourceNotFoundException("Order", "Id", orddetail.getOrder().getId()));
		
		if(order!= null) {
			List<OrderDetail> newList = orddetailRepo.getDetailByOrder(orddetail.getOrder().getId());
			order.setOrderDetailList(newList);
			double total = 0;
			for (OrderDetail d: newList) {
				total += d.getProductPrice() * d.getAmount();
			}
			order.setTotalPrice(total);
			ordRepo.save(order);			
		}
		
	}
}