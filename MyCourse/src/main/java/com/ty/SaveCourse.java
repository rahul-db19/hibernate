package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCourse {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Course course1 = new Course();
		course1.setName("Java Full Stack");
		course1.setFees(45999.0);
		course1.setTrainer("Keshav Era");
		course1.setDuration("6 Months");
		
		Course course2 = new Course();
		course2.setName("MERN Stack");
		course2.setFees(49999.0);
		course2.setTrainer("Niranjan");
		course2.setDuration("6 Months");
		
		Course course3 = new Course();
		course3.setName("Fundamentals of Java");
		course3.setFees(30999.0);
		course3.setTrainer("Rahul");
		course3.setDuration("6 Months");
		
		Course course4 = new Course();
		course4.setName("Spring Boot and Hibernate");
		course4.setFees(45999.0);
		course4.setTrainer("Venkatesh");
		course4.setDuration("6 Months");
		
		Course course5 = new Course();
		course5.setName("Data Structures and Algorithms");
		course5.setFees(45999.0);
		course5.setTrainer("Sandeep Jain");
		course5.setDuration("6 Months");
		
		entityTransaction.begin();
		entityManager.persist(course1);
//		entityManager.persist(course2);
//		entityManager.persist(course3);
//		entityManager.persist(course4);
//		entityManager.persist(course5);
		entityTransaction.commit();

	}

}
