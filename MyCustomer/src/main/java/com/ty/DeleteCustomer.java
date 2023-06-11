package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteCustomer {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		System.out.println(entityManager.find(Customer.class, 101));
		
		if(entityManager.find(Customer.class, 101)!=null) {
			Customer customer = entityManager.find(Customer.class, 101);
			entityTransaction.begin();
			entityManager.remove(customer);
			entityTransaction.commit();
		}
		else
		{
			System.out.println("Can not delete, customer already deleted");
		}	
	}
}
