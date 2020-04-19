package com.bookstore.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import com.bookstore.model.Users;

class UserDAOTest {
//	private EntityManagerFactory entityManagerFactory;
//	private EntityManager entityManager;
//	private static UserDAO userDAO;
//	
//	
//	@BeforeClass
//public static void setUpClass() {
//		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
//		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		
//		UserDAO user=new UserDAO(entityManager);
//	}
//
//	@Test
//	void testCreateUsers() {
//	Users user1=new Users();
//				user1.setEmail("alirass@hotmail.gr");
//				user1.setFullName("Mawwraki Geitonias");
//				user1.setPassword("fgsdesdgre");
//				
//				
//				EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
//				EntityManager entityManager=entityManagerFactory.createEntityManager();
//				
//				UserDAO userDAO= new UserDAO(entityManager);
//				user1=userDAO.create(user1);
//				
//				entityManager.close();
//				entityManagerFactory.close(); 
//				
//				user1=userDAO.create(user1);
//				assertTrue(user1.getUserId()>0);
//	}
//
//
//      
//
//	
//
//	 @Test	
//	 public void testGetUsersFound(){
//	
//		 Integer userId=1;
//	Users user=	 userDAO.get(userId);
//	System.out.println(user.getEmail());
//	assertNotNull(user);
//	 
//	}
//
//
//	@Test
//	void testGet() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testDelete() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testListAll() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testCount() {
//		fail("Not yet implemented");
//	}
//	@NamedQuery(name= "Users.findAll()",query = "SELECT u FROM Users u ORDERED BY u.fullName" ),
//	@NamedQuery(name= "Users.countAll",query = "SELECT Count(*) FROM Users u" )
}
