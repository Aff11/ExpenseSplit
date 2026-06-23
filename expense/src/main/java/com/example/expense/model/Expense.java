package com.example.expense.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="expenses")
public class Expense {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="expense_id")
	private int expenseId;
	
	private String description;

    private double amount;
    
    @ManyToOne
    @JoinColumn(name = "paid_by")
    private User paidBy;
    
    @ManyToOne
    @JoinColumn(name = "group_id")
    private ExpenseGroup expenseGroup;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "expense_date")
    private Date expenseDate;

	public Expense() {
		
	}

	public Expense(int expenseId, String description, double amount, User paidBy, ExpenseGroup expenseGroup,
			Date expenseDate) {
		super();
		this.expenseId = expenseId;
		this.description = description;
		this.amount = amount;
		this.paidBy = paidBy;
		this.expenseGroup = expenseGroup;
		this.expenseDate = expenseDate;
	}

	public int getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(int id) {
		this.expenseId = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public User getPaidBy() {
		return paidBy;
	}

	public void setPaidBy(User paidBy) {
		this.paidBy = paidBy;
	}

	public ExpenseGroup getExpenseGroup() {
		return expenseGroup;
	}

	public void setExpenseGroup(ExpenseGroup expenseGroup) {
		this.expenseGroup = expenseGroup;
	}

	public Date getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(Date expenseDate) {
		this.expenseDate = expenseDate;
	}

	@Override
	public String toString() {
		return "Expense [id=" + expenseId + ", description=" + description + ", amount=" + amount + ", paidBy=" + paidBy
				+ ", expenseGroup=" + expenseGroup + ", expenseDate=" + expenseDate + "]";
	}
    
    
}
