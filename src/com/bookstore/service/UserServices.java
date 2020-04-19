package com.bookstore.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.dao.UserDAO;
import com.bookstore.model.Users;

public class UserServices {
	private UserDAO userDAO;
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	
	
	
	public UserServices() {
		entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
		entityManager=entityManagerFactory.createEntityManager();
userDAO= new UserDAO(entityManager);
	}
	

	
	public List<Users> listUser() {
		
		List<Users> listUsers= userDAO.listAll();
		
		return listUsers;
	}
public void	createUser(String email,String fullName,String password){
		Users newUser= new Users(email,fullName,password);
		userDAO.create(newUser);
	}
}
