package tnt.group.techstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tnt.group.techstore.model.Account;
import tnt.group.techstore.model.AccountDetail;
import tnt.group.techstore.repository.AccountRepository;

@Service
public class AccountDetailServiceImpl implements UserDetailsService{
	@Autowired
	AccountRepository accountRepository;
	
	@Override
	@Transactional
	 public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	   Account account = accountRepository.findByUsername(username)
	        .orElseThrow(() -> new UsernameNotFoundException("Account Not Found with username: " + username));
	
	   return AccountDetail.build(account);
	 }
}
