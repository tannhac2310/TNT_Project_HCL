package tnt.group.techstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tnt.group.techstore.model.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
