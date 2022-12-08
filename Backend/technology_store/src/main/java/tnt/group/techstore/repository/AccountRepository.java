package tnt.group.techstore.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tnt.group.techstore.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account ,Long>{
	// User
	List<Account> findByUsernameAndPassword(String username, String password);
	Optional<Account> findByUsername(String username);
    Boolean existsByUsername(String username);
}
