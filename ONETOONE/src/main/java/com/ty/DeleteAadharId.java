package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteAadharId {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		System.out.println(entityManager.find(Aadharcard.class, 1));
		
		if(entityManager.find(Aadharcard.class, 101)!=null) {
			Aadharcard Aadharcard = entityManager.find(Aadharcard.class, 1);
			entityTransaction.begin();
			entityManager.remove(Aadharcard);
			entityTransaction.commit();
		}
		else
		{
			System.out.println("Can not delete, Aadharcard already deleted");
		}

	}

}
