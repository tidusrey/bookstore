package com.bookstore.entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.model.Users;

public class UsersTest {

	public static void main(String[] args) {
		Users user1=new Users();
		user1.setEmail("alias@hotmail.gr");
		user1.setFullName("Katerina Papaxaralampous");
		user1.setPassword("fggre");
		
		
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	entityManager.getTransaction().begin();
	entityManager.persist(user1);
	entityManager.getTransaction().commit();
	entityManager.close();
	entityManagerFactory.close(); 
	
	System.out.println("A Users objrct persisted");
	
	}

}
