package tnt.group.techstore.service;

import java.util.List;

import tnt.group.techstore.model.Account;

public interface AccountService {

	//User

	List<Account> getAllAccounts();

	Account getAccountById(long id);

	Account updateAccount(Account account, long id);

	void deleteAccount(long id);
}
