package tnt.group.techstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tnt.group.techstore.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
