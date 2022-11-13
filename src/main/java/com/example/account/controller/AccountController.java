package com.example.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.account.domain.Account;
import com.example.account.service.AccountService;
import com.example.account.service.RedisTestService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AccountController {
	private final AccountService accountService;
	private final RedisTestService redisTestService;
	
	@GetMapping("/get-lock")
	public String getLock() {
		return redisTestService.getLock();
	}

	@GetMapping("/create-account")
	public String createAccount() {
		accountService.createAccount();
		return "success";
	}
	
	@GetMapping("/account/{id}")
	public Account getAccount(@PathVariable Long id) {
		return accountService.getAccount(id);
	}
}








