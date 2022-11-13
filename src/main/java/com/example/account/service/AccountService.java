package com.example.account.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.account.domain.Account;
import com.example.account.domain.AccountStatus;
import com.example.account.repository.AccountRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService {
	private final AccountRepository accountRepository;
	
	@Transactional
	public void createAccount() {
		Account account = Account.builder()
				.accountNumber("4000")
				.accountStatus(AccountStatus.IN_USE)
				.build();
		accountRepository.save(account);
	}
	
	
	@Transactional
	public Account getAccount(Long id) {
		if (id < 0) {
			throw new RuntimeException("Minus");
		}
		return accountRepository.findById(id).get();
	}
	
}













