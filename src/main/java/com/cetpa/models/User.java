package com.cetpa.models;

import javax.persistence.*;

@Entity
@Table(name="UserList")
public class User 
{
	@Id
	private int uid;
	private String firstname;
	private String lastname;
	private String address;
	private String phone;
	private String emailid;
	public User() {}
	public User(String firstname)
	{
		this.firstname=firstname;
	}
	public int getuid() {
		return uid;
	}
	public void setuid(int uid) {
		this.uid = uid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
}
