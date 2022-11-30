package tnt.group.techstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tnt.group.techstore.model.Account;
import tnt.group.techstore.repository.AccountRepository;
import tnt.group.techstore.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accountRepository.findAll();
	}

	@Override
	public Account getAccountById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account updateAccount(Account account, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount(long id) {
		// TODO Auto-generated method stub
		
	}

}
