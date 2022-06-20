package com.cetpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cetpa.models.User;

public interface UserDao extends JpaRepository<User,Integer> 
{
	//List<User> findByFirstname(int Id);

	List<User> findByFirstname(String tv);
}
