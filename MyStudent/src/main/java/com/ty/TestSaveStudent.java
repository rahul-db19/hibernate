package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudent {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =  entityManager.getTransaction();

		Student student1 = new Student();
		student1.setId(101);
		student1.setName("Rahul");
		student1.setAge(23);
		student1.setGender("Male");
		student1.setPhno(9632430866l);
		student1.setMarks(99);

		Student student2 = new Student();
		student2.setId(102);
		student2.setName("Namitha");
		student2.setAge(22);
		student2.setGender("Female");
		student2.setPhno(9535251331l);
		student2.setMarks(84);

		Student student3 = new Student();
		student3.setId(103);
		student3.setName("Vanishree");
		student3.setAge(24);
		student3.setGender("Female");
		student3.setPhno(7259845579l);
		student3.setMarks(99);

		entityTransaction.begin();
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityTransaction.commit();
	}
}