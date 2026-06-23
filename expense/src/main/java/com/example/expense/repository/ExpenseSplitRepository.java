package com.example.expense.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.expense.model.ExpenseSplit;

public interface ExpenseSplitRepository extends JpaRepository<ExpenseSplit,Integer>{

	 List<ExpenseSplit>
	    findByExpenseExpenseId(int expenseId);
}
