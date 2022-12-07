package tnt.group.techstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tnt.group.techstore.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	@Query("select c from Customer c where c.account.id = ?1")
	Customer getCustomerByAccountId(long id);
}
