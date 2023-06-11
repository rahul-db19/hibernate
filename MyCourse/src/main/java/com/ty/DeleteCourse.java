package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteCourse {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Course course = entityManager.find(Course.class, 1);
		if (course != null) {
			entityTransaction.begin();
			entityManager.remove(course);
			entityTransaction.commit();
		} else {
			System.out.println("Data already deleted");
		}
	}
}