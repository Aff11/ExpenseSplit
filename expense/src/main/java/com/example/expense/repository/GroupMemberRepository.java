package com.example.expense.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.expense.model.GroupMember;

public interface GroupMemberRepository extends JpaRepository<GroupMember,Integer>{

	List<GroupMember> findByExpenseGroupGroupId(int groupId);

}
