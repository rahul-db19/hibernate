package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCustomer {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Customer customer1 = new Customer();
		customer1.setId(101);
		customer1.setName("Rahul");
		customer1.setAge(23);
		customer1.setGender("Male");
		customer1.setPhno(9632430866l);
		customer1.setGmail("rahul@gmail.com");
		
		Customer customer2 = new Customer();
		customer2.setId(102);
		customer2.setName("Rakesh");
		customer2.setAge(23);
		customer2.setGender("Male");
		customer2.setPhno(9632430887l);
		customer2.setGmail("rakesh@gmail.com");
		
		Customer customer3 = new Customer();
		customer3.setId(103);
		customer3.setName("Namitha");
		customer3.setAge(23);
		customer3.setGender("Feale");
		customer3.setPhno(9535251331l);
		customer3.setGmail("namitha@gmail.com");
		
		Customer customer4 = new Customer();
		customer4.setId(104);
		customer4.setName("Sagar");
		customer4.setAge(24);
		customer4.setGender("Male");
		customer4.setPhno(9532030866l);
		customer4.setGmail("sagar@gmail.com");
		
		Customer customer5 = new Customer();
		customer5.setId(105);
		customer5.setName("Vanishree");
		customer5.setAge(25);
		customer5.setGender("Female");
		customer5.setPhno(7259845579l);
		customer5.setGmail("vanishree@gmail.com");
		
		entityTransaction.begin();
		entityManager.persist(customer1);
		entityManager.persist(customer2);
		entityManager.persist(customer3);
		entityManager.persist(customer4);
		entityManager.persist(customer5);
		entityTransaction.commit();
		
	}

}
