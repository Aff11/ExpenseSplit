package com.example.expense.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="expense_split")
public class ExpenseSplit {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "split_id")
    private int splitId;
	
	 @ManyToOne
	 @JoinColumn(name = "expense_id")
	 private Expense expense;
	 
	 @ManyToOne
	 @JoinColumn(name = "user_id")
     private User user;
	 
	  @Column(name = "share_amount")
	  private double shareAmount;

	  public ExpenseSplit(int splitId, Expense expense, User user, double shareAmount) {
		super();
		this.splitId = splitId;
		this.expense = expense;
		this.user = user;
		this.shareAmount = shareAmount;
	  }

	  public ExpenseSplit() {
		
	  }

	  public int getSplitId() {
		  return splitId;
	  }

	  public void setSplitId(int splitId) {
		  this.splitId = splitId;
	  }

	  public Expense getExpense() {
		  return expense;
	  }

	  public void setExpense(Expense expense) {
		  this.expense = expense;
	  }

	  public User getUser() {
		  return user;
	  }

	  public void setUser(User user) {
		  this.user = user;
	  }

	  public double getShareAmount() {
		  return shareAmount;
	  }

	  public void setShareAmount(double shareAmount) {
		  this.shareAmount = shareAmount;
	  }

	  @Override
	  public String toString() {
		return "ExpenseSplit [splitId=" + splitId + ", expense=" + expense + ", user=" + user + ", shareAmount="
				+ shareAmount + "]";
	  }
	  
	  
}
