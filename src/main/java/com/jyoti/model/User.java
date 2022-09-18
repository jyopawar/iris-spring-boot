package com.jyoti.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private long id;
	private String Firstname;
	private String Lastname;
	private int Mobile;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public int getMobile() {
		return Mobile;
	}
	public void setMobile(int mobile) {
		Mobile = mobile;
	}
	public User() {	
	}
	
	
	
	public User(long id, String firstname, String lastname, int mobile) {
		this.id = id;
		Firstname = firstname;
		Lastname = lastname;
		Mobile = mobile;
	}

}
