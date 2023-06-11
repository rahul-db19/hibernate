package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteDeveloper {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Developer developer = entityManager.find(Developer.class, 5);
		if (developer != null) {
			entityTransaction.begin();
			entityManager.remove(developer);
			entityTransaction.commit();
		} else {
			System.out.println("Data already deleted");
		}
	}
}