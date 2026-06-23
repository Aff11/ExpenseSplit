package com.example.expense.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.expense.model.User;
import com.example.expense.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    
	@Autowired
	private UserService userservice;
	
	@PostMapping
	public User saveUser(@RequestBody User user) {
		return userservice.saveUser(user);
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable int id) {
		 userservice.deleteUser(id);
		 return "User deleted successfully";
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable int id) {
		return userservice.getUserById(id);
	}
	
	@GetMapping
	public List<User> getAllUsers(){
		return userservice.getAllUsers();
	}
}
