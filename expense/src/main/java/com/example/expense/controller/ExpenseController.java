package com.example.expense.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.expense.model.Expense;
import com.example.expense.model.ExpenseSplit;
import com.example.expense.service.ExpenseService;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

	@Autowired
	private ExpenseService service;
	
	@PostMapping
	public Expense saveExpense(@RequestBody Expense expense) {
		return service.saveExpense(expense);
	}
	
	@GetMapping("/id")
	public Expense getExpense(@PathVariable int id) {
		return service.getExpenseById(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteExpense(@PathVariable int id)
	{
		service.deleteExpense(id);
		return "Deleted successfully";
	}
	
	@GetMapping
	public List<Expense> getAllExpenses() {
		return service.getAllExpenses();
	}
	
	@GetMapping("/splits")
	public List<ExpenseSplit> getAllSplit(){
		return service.getAllSplits();
	}
}
