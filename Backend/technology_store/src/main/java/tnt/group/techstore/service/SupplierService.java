package tnt.group.techstore.service;

import java.util.List;

import tnt.group.techstore.model.Supplier;

public interface SupplierService {
	List<Supplier> getAllSuppliers();

	Supplier getSupplierById(long id);
	
	Supplier createSupplier(Supplier supplier);
	
	Supplier updateSupplier(Supplier supplier, long id);
	
	void deleteSupplier(long id);
}
