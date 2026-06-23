package com.example.expense.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expense.model.User;
import com.example.expense.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userrepository;
	
	public User saveUser(User user) {
		return userrepository.save(user);
	}
	
	public void deleteUser(int id) {
		 userrepository.deleteById(id);
	}
	
	public User getUserById(int id) {
		return userrepository.findById(id).orElse(null);
	}
	
	public List<User> getAllUsers(){
		return userrepository.findAll();
	}
}
