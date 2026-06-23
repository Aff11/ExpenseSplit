package com.example.expense.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="group_members")
public class GroupMember {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="group_id")
	private ExpenseGroup expenseGroup;
	
	 @ManyToOne
	 @JoinColumn(name = "user_id")
	 private User user;

	 public GroupMember(int id, ExpenseGroup expenseGroup, User user) {
		super();
		this.id = id;
		this.expenseGroup = expenseGroup;
		this.user = user;
	 }

	 public GroupMember() {
		
	 }

	 public int getId() {
		 return id;
	 }

	 public void setId(int id) {
		 this.id = id;
	 }

	 public ExpenseGroup getExpenseGroup() {
		 return expenseGroup;
	 }

	 public void setExpenseGroup(ExpenseGroup expenseGroup) {
		 this.expenseGroup = expenseGroup;
	 }

	 public User getUser() {
		 return user;
	 }

	 public void setUser(User user) {
		 this.user = user;
	 }

	 @Override
	 public String toString() {
		return "GroupMember [id=" + id + ", expenseGroup=" + expenseGroup + ", user=" + user + "]";
	 }
	
	 
}
