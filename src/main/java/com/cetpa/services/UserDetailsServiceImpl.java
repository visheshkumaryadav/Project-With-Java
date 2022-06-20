package com.cetpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cetpa.model.User;
import com.cetpa.repositories.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService 
{
	@Autowired
	private UserRepository repo;
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		User user=repo.findByUsername(username);
		UserDetailsImpl users=null;
		if(user==null)
			throw new UsernameNotFoundException("User with id "+username+" not found");
		else
		{
			users=new UserDetailsImpl(user);
		}
		return users;
	}
	
}
