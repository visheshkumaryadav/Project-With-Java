package com.cetpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.cetpa.models.User;
import com.cetpa.services.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService service;

	@GetMapping("/")
	public String getHomeView() {
		return "home";
	}

	@GetMapping("add-user")
	public String getAdduserView(Model model) {
		model.addAttribute("command", new User());
		return "add-user";
	}

	@PostMapping("save-record")
	public String saveuserView(User user, Model model) {
		boolean exists = service.isIdExist(user.getuid());
		if (exists) {
			model.addAttribute("command", user);
			model.addAttribute("msg", "user id already exists");
			return "add-user";
		}
		service.saveRecord(user);
		return "save-success";
	}

	@GetMapping("user-list")
	public String getuserList(Model model) 
	{
		List<User> list = service.getList();
		model.addAttribute("userlist", list);
		return "user-list";
	}

	@GetMapping("search-users")
	public String getSearchusersView() {
		System.out.println("search mehtod is called...............");
		return "search-use";
	}

	@GetMapping("searchrecord-byid")
	public String getuserRecordById(int tv, Model model) {
		User user = service.getRecord(tv);
		if (user != null) {
			model.addAttribute("user", user);
			return "search-record-byid";
		}
		model.addAttribute("str", tv);
		model.addAttribute("rb", "byid");
		model.addAttribute("msg", "user record not found");
		return "search-users";
	}

	@GetMapping("searchrecord-byname")
	public String getuserRecordByName(String tv, Model model) {
		List<User> list = service.getRecordByName(tv);
		if (!list.isEmpty()) {
			System.out.println("getUserByName"+list);
			
			model.addAttribute("userlist", list);
			return "search-record-byname";
		}
		model.addAttribute("str", tv);
		model.addAttribute("rb", "byname");
		model.addAttribute("msg", "user record not found");
		return "search-use";
	}

	@GetMapping("edit_user")
	public String getEditUser() {
		System.out.println("search mehtod is called...............");
		return "edit-user";
	}

	@RequestMapping("/update-record")
	public String updateUserInformation(User user, Model model) {
		service.updateUserInfo(user);
		model.addAttribute("msg", "User record has been update successfully");
		model.addAttribute("uid", user.getuid());
		return "update";
	}

	/*@GetMapping("user-list")
	public String getUserList(Model model, int pn) {
		Page<User> pagelist = service.getList(pn - 1);
		int totalp = pagelist.getTotalPages();
		List<User> list = pagelist.toList();
		model.addAttribute("userlist", list);
		model.addAttribute("tp", totalp);
		model.addAttribute("pn", pn);
		return "user-list";
	}*/

	@GetMapping("/delete-record")
	public String deleteRecord() {

		return "delete-record";
	}
	

	@GetMapping("/delete")
	public String delete(int uid,Model model) {

		User user=service.getRecordbyId(uid);
		System.out.println("user is "+user);
		
		if(user==null)
		{
			model.addAttribute("msg", "User not found");
			System.out.println("user_not found");
			model.addAttribute("msg", "user record not found");
			return "delete-record";
		}
		else {
		System.out.println("user_found");
		return "delete";
		}
		
		
	}

}
