package tnt.group.techstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tnt.group.techstore.service.AccountService;

@Repository
public interface AccountRepository extends JpaRepository<AccountService ,Long>{

}
