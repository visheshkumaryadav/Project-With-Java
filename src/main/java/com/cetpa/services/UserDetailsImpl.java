package com.cetpa.services;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.cetpa.model.User;

public class UserDetailsImpl implements UserDetails 
{
	private User user;
	public UserDetailsImpl(User user)
	{
		this.user=user;
	}
	public Collection<? extends GrantedAuthority> getAuthorities() 
	{
		List<String> list=new ArrayList<String>();
		list.add(user.getRole());
		return list.stream().map(role->new SimpleGrantedAuthority("ROLE_"+user.getRole())).collect(Collectors.toList());
	}
	public String getPassword() 
	{
		return user.getPassword();
	}
	public String getUsername() 
	{
		return user.getUsername();
	}
	public boolean isAccountNonExpired() 
	{
		return true;
	}
	public boolean isAccountNonLocked() 
	{
		return true;
	}
	public boolean isCredentialsNonExpired() 
	{
		return true;
	}
	public boolean isEnabled()
	{
		return true;
	}
}
