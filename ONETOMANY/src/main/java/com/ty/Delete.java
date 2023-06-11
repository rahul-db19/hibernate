package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =  entityManager.getTransaction();
		Mobile mobile1 = entityManager.find(Mobile.class, 1);
		if(mobile1!=null) {
			Sim sim1 = entityManager.find(Sim.class, 1);
			Sim sim2 = entityManager.find(Sim.class, 2);
			entityTransaction.begin();
			entityManager.remove(mobile1);
			entityManager.remove(sim1);
			entityManager.remove(sim2);
			entityTransaction.commit();
		}
	}
}
