package tnt.group.techstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tnt.group.techstore.model.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier ,Long>{
	
}
