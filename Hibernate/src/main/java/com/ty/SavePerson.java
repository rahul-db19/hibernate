package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rahul");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =  entityManager.getTransaction();		
		
		Person person = new Person();
		person.setId(101);
		person.setName("Rahul");
		person.setAge(25);
		person.setGender("Male");
		person.setPhno(9632430866l);
		person.setSal(55000.0);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
}