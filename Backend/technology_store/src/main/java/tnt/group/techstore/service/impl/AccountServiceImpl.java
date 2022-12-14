package tnt.group.techstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tnt.group.techstore.exception.ResourceNotFoundException;
import tnt.group.techstore.model.Account;
import tnt.group.techstore.repository.AccountRepository;
import tnt.group.techstore.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountRepository accountRepo;

	@Override
	public List<Account> getAllAccounts() {
		return accountRepo.findAll();
	}

	@Override
	public Account getAccountById(long id) {
		return accountRepo.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Account", "Id", id));
	}

	@Override
	public Account updateAccount(Account account, long id) {
		Account existingAccount = accountRepo.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Account", "Id", id));
		if(account.getUsername()!=null){
			existingAccount.setUsername(account.getUsername());
		}
		if(account.getPassword()!=null){
			existingAccount.setPassword(account.getPassword());
		}
		existingAccount.setRole(account.getRole());
		existingAccount.setStatus(account.getStatus());
		accountRepo.save(existingAccount);
		return existingAccount;
	}

	@Override
	public void deleteAccount(long id) {
		accountRepo.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("Account", "Id", id));
		accountRepo.deleteById(id);
	}
}
