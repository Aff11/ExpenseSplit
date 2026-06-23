package com.example.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.expense.model.ExpenseGroup;

public interface GroupRepository extends JpaRepository<ExpenseGroup,Integer>{

}
