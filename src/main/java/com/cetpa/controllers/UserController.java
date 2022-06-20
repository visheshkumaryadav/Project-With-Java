package com.cetpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cetpa.model.User;
import com.cetpa.repositories.UserRepository;

@RestController
@RequestMapping("users")
public class UserController 
{
	@Autowired
	private UserRepository repo;
	
	BCryptPasswordEncoder pe=new BCryptPasswordEncoder();
	@PostMapping("/signup")
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		String pa=user.getPassword();
		String epa=pe.encode(pa);
		user.setPassword(epa);
		repo.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	@RequestMapping("/userlist")
	public ResponseEntity<List<User>> getUserList()
	{
		List<User> list=repo.findAll();
		if(list.isEmpty())
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		else
			return ResponseEntity.ok(list);
	}
}
