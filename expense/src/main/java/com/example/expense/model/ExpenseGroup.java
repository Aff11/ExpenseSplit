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
@Table(name="expense_group")
public class ExpenseGroup {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="group_id")
	private int groupId;
	
	 @Column(name = "group_name")
	 private String groupName;
	 
	 @ManyToOne
	 @JoinColumn(name = "created_by")
	 private User createdBy;

	 public ExpenseGroup(int groupId, String groupName, User createdBy) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.createdBy = createdBy;
	 }
	 
	 public ExpenseGroup() {
		 
	 }
    
	 
	 public int getGroupId() {
		return groupId;
	}

	 public void setGroupId(int groupId) {
		 this.groupId = groupId;
	 }

	 public String getGroupName() {
		 return groupName;
	 }

	 public void setGroupName(String groupName) {
		 this.groupName = groupName;
	 }

	 public User getCreatedBy() {
		 return createdBy;
	 }

	 public void setCreatedBy(User createdBy) {
		 this.createdBy = createdBy;
	 }

	 @Override
	 public String toString() {
		return "ExpenseGroup [groupId=" + groupId + ", groupName=" + groupName + ", createdBy=" + createdBy + "]";
	 }
	 
	 
}
