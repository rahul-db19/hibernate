package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateDeveloper {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =  entityManager.getTransaction();

		Developer Developer = entityManager.find(Developer.class, 1);
		Developer.setExp(3);
		entityTransaction.begin();
		entityManager.merge(Developer);
		entityTransaction.commit();
	}
}