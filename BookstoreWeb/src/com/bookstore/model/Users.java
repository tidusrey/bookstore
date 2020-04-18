package com.bookstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
@Entity
public class Users {

	private int userId;
	private String email;
	private String fullName;
private String password;

@Column(name="user_id")
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

@Column(name="full_name")
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
