package com.cetpa.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.cetpa.models.User;

@Service
public interface UserService 
{

	void saveRecord(User user);

	boolean isIdExist(int uid);

	List<User> getList();

	User getRecord(int uid);

	List<User> getRecordByName(String tv);
	//List<User> getRecordById(int Id);

	User updateUserInfo(User user);

	User getRecordbyId(int uid);
}
