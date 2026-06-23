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

import com.example.expense.model.ExpenseGroup;
import com.example.expense.model.GroupMember;
import com.example.expense.service.GroupService;

@RestController
@RequestMapping("/groups")
 
public class GroupController{
	@Autowired
	GroupService gservice;
	 
	
	
	@PostMapping
	public ExpenseGroup saveGroup(@RequestBody ExpenseGroup group) {
		return gservice.saveGroup(group);
	}
	
	@GetMapping
    public List<ExpenseGroup> getAllGroups() {
        return gservice.getAllGroups();
    }
	
	@GetMapping("/{id}")
    public ExpenseGroup getGroupById(@PathVariable int id) {
        return gservice.getGroupById(id);
    }
	
	@DeleteMapping("/{id}")
    public String deleteGroup(@PathVariable int id) {
        gservice.deleteGroup(id);
        return "Group deleted successfully";
    }
	
	  @PostMapping("/members")
	    public GroupMember addMember(@RequestBody GroupMember member) {
	        return gservice.addMember(member);
	    }
	  
	  @GetMapping("/members")
	    public List<GroupMember> getAllMembers() {
	        return gservice.getAllMembers();
	    }
}