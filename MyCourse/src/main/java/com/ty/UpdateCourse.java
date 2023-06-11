package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateCourse {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =  entityManager.getTransaction();

		Course Course = entityManager.find(Course.class, 1);
		Course.setFees(99999.0);
		entityTransaction.begin();
		entityManager.merge(Course);
		entityTransaction.commit();
	}
}