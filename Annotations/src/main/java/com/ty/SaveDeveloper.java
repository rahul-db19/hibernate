package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveDeveloper {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Developer developer1 = new Developer();
		developer1.setName("Rahul");
		developer1.setAge(23);
		developer1.setGender("Male");
		developer1.setPhno(9632430866l);
		developer1.setExp(2);
		developer1.setC_code("TCS12345");
		
		Developer developer2 = new Developer();
		developer2.setName("Rakesh");
		developer2.setAge(23);
		developer2.setGender("Male");
		developer2.setPhno(9632430766l);
		developer2.setExp(2);
		developer2.setC_code("IBM12345");
		
		Developer developer3 = new Developer();
		developer3.setName("Namitha");
		developer3.setAge(23);
		developer3.setGender("Female");
		developer3.setPhno(9535251331l);
		developer3.setExp(1);
		developer3.setC_code("HTC12345");
		
		Developer developer4 = new Developer();
		developer4.setName("Chetan");
		developer4.setAge(23);
		developer4.setGender("Male");
		developer4.setPhno(9448697858l);
		developer4.setExp(2);
		developer4.setC_code("INFY2345");
		
		Developer developer5 = new Developer();
		developer5.setName("Vanishree");
		developer5.setAge(22);
		developer5.setGender("Female");
		developer5.setPhno(7295845579l);
		developer5.setExp(2);
		developer5.setC_code("BGM12345");
		
		entityTransaction.begin();
		entityManager.persist(developer1);
		entityManager.persist(developer2);
		entityManager.persist(developer3);
		entityManager.persist(developer4);
		entityManager.persist(developer5);
		entityTransaction.commit();
	}

}
