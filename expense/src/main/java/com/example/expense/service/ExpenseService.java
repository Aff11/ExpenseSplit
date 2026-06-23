package com.example.expense.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expense.model.Expense;
import com.example.expense.model.ExpenseSplit;
import com.example.expense.model.GroupMember;
import com.example.expense.repository.ExpenseRepository;
import com.example.expense.repository.ExpenseSplitRepository;
import com.example.expense.repository.GroupMemberRepository;

@Service
public class ExpenseService {

	@Autowired
	private ExpenseRepository expenserepository;
	
	@Autowired
	private ExpenseSplitRepository splitrepository;
	
	@Autowired
	private GroupMemberRepository memberrepository;
	
	public Expense saveExpense(Expense expense) {
		
		 Expense savedExpense = expenserepository.save(expense);
		 int groupId = expense.getExpenseGroup().getGroupId();
		 List<GroupMember> members =
	                memberrepository.findByExpenseGroupGroupId(groupId);
		 
		 double shareAmount=expense.getAmount()/members.size();
		 for(GroupMember member:members) {
			 ExpenseSplit split=new ExpenseSplit();
			 split.setExpense(savedExpense);
			 split.setUser(member.getUser());
			 split.setShareAmount(shareAmount);
			 
			 splitrepository.save(split);
		 }
	   return savedExpense;	 
	}
	
	public List<Expense> getAllExpenses(){
		return expenserepository.findAll();
	}
	
	public Expense getExpenseById(int id) {
		return expenserepository.findById(id).orElse(null);
	}
	
	public void deleteExpense(int id) {
		 expenserepository.deleteById(id);
	}
	
	public List<ExpenseSplit> getAllSplits(){
		return splitrepository.findAll();
	}
}
