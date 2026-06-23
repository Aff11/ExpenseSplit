package com.example.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.expense.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
