package com.example.expense.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expense.model.Expense;
import com.example.expense.model.ExpenseSplit;
import com.example.expense.repository.ExpenseRepository;
import com.example.expense.repository.ExpenseSplitRepository;

@Service
public class BalanceService {

	 @Autowired
	    private ExpenseRepository expenseRepository;

	    @Autowired
	    private ExpenseSplitRepository splitRepository;
	    
	    public 	List<String> getBalances(){
	    	List<String>balances=new ArrayList<>();
	    	
	    	List<Expense>expenses=expenseRepository.findAll();
	    	for(Expense expense:expenses) {
	    		List<ExpenseSplit> splits =
	                    splitRepository.findByExpenseExpenseId(
	                            expense.getExpenseId());
	    		
	    		for(ExpenseSplit split:splits) {
	    			if(split.getUser().getUserId()!=
	    					expense.getPaidBy().getUserId())
	    			{
	    				String res=split.getUser().getName()+"owes"+
	    			                expense.getPaidBy().getName()+"rs"+split.getShareAmount();
	    				balances.add(res);
	    			}
	    			
	    		}
	    	}
	    	return balances;
	    }
}
