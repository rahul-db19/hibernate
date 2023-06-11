package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =  entityManager.getTransaction();
		
		Person person1 = new Person();
		person1.setName("Rahul");
		person1.setAge(25);
		person1.setGender("Male");
		person1.setPhno(9632430866l);
		
		Aadharcard adharcard1 = new Aadharcard();
		adharcard1.setAdNo(4444888899991111l);
		adharcard1.setAddress("Bengaluru");
		
		person1.setCard(adharcard1);
		
		
		Person person2 = new Person();
		person2.setName("Nikitha");
		person2.setAge(23);
		person2.setGender("Female");
		person2.setPhno(9632430866l);
		
		Aadharcard adharcard2 = new Aadharcard();
		adharcard2.setAdNo(9535251331953525l);
		adharcard2.setAddress("Mysore");
		
		person2.setCard(adharcard2);
		
		entityTransaction.begin();
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(adharcard1);
		entityManager.persist(adharcard2);
		entityTransaction.commit();
	}

}
