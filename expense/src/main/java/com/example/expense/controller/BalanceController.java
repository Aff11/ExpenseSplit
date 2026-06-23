package com.example.expense.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.expense.service.BalanceService;

@RestController
@RequestMapping("/balances")
public class BalanceController {

	@Autowired
	private BalanceService balanceservice;
	
	@GetMapping
	public List<String> getBalances(){
		return balanceservice.getBalances();
	}
}
