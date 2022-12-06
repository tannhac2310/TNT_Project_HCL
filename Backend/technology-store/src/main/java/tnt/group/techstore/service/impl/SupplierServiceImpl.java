package tnt.group.techstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tnt.group.techstore.repository.SupplierRepository;
import tnt.group.techstore.service.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService {
	
	@Autowired
	private SupplierRepository supplierRepo;


}