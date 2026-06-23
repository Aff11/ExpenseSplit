package com.example.expense.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expense.model.ExpenseGroup;
import com.example.expense.model.GroupMember;
import com.example.expense.repository.GroupMemberRepository;
import com.example.expense.repository.GroupRepository;

@Service
public class GroupService {

	@Autowired
	private GroupRepository grepository;
	
	@Autowired
	private GroupMemberRepository mrepository;
	
	 public ExpenseGroup saveGroup(ExpenseGroup group) {
	        return grepository.save(group);
	  }
	 
	 public List<ExpenseGroup> getAllGroups() {
	        return grepository.findAll();
	    }
	 
	 public ExpenseGroup getGroupById(int id) {
		 return grepository.findById(id).orElse(null);
	 }
	 
	 public void deleteGroup(int id) {
		 grepository.deleteById(id);
	 }
	 
	 public GroupMember addMember(GroupMember member) {
	        return mrepository.save(member);
	    }

	    // Get All Members
	    public List<GroupMember> getAllMembers() {
	        return mrepository.findAll();
	    }
}
