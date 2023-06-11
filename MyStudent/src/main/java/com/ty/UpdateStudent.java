package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateStudent {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =  entityManager.getTransaction();

		Student student = entityManager.find(Student.class, 103);
		student.setMarks(36);
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
	}
}