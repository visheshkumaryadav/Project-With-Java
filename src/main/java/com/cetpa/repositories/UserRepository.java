package com.cetpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cetpa.model.User;

public interface UserRepository extends JpaRepository<User,Integer> 
{
	User findByUsername(String username);
}
