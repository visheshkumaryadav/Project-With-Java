package com.cetpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cetpa.models.User;
import com.cetpa.repositories.UserDao;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;

	public void saveRecord(User user) {
		dao.save(user);
	}

	public boolean isIdExist(int uid) {
		return dao.existsById(uid);
	}

	public User getRecord(int uid) {
		User user = dao.findById(uid).orElse(null);
		return user;
	}

	public List<User> getRecordByName(String tv) {
		return dao.findByFirstname(tv);
	}

	@Override
	public User updateUserInfo(User user) {
		return dao.save(user);

	}

	@Override
	public User getRecordbyId(int uid) {

		
		User user = dao.findById(uid).orElse(null);
		
		if (user != null) {
			dao.deleteById(uid);
		}
		return user;
	}

	public List<User> getList() {
		//Pageable page = PageRequest.of(pn, 4);
		List<User> pagelist = dao.findAll();
		return pagelist;
	}

}
