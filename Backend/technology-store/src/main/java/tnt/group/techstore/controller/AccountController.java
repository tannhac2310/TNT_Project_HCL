package tnt.group.techstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tnt.group.techstore.model.Account;
import tnt.group.techstore.service.AccountService;



//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
@RestController
@RequestMapping("/api/account")
public class AccountController {

	@Autowired
	private AccountService accService;

	@GetMapping("/viewall")
	//@PreAuthorize("hasRole('ADMIN')")
	public List<Account> getAllUsers(){
		List<Account> list = accService.getAllAccounts();
		for (Account a : list) {
			System.out.println(a.toString());
		}
		return accService.getAllAccounts();
	}

}

