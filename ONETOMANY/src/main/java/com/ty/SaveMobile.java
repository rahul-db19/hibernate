package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMobile {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =  entityManager.getTransaction();
		
		Mobile mobile1 = new Mobile();
		mobile1.setBrand("iPhone");
		mobile1.setColor("Jet Black");
		mobile1.setCost(89999.00);
		mobile1.setRam("4GB");
		
		Mobile mobile2 = new Mobile();
		mobile2.setBrand("onePlus");
		mobile2.setColor("Navy Blue");
		mobile2.setCost(59999.00);
		mobile2.setRam("12GB");
		
		Sim sim1 = new Sim();
		sim1.setProvider("Jio");
		sim1.setType("5G");
		sim1.setCost(399.0);
		sim1.setPhno(6360637968l);
		
		Sim sim2 = new Sim();
		sim2.setProvider("Airtel");
		sim2.setType("5G");
		sim2.setCost(499.0);
		sim2.setPhno(9535251331l);
		
		Sim sim3 = new Sim();
		sim3.setProvider("BSNL");
		sim3.setType("3G");
		sim3.setCost(299.0);
		sim3.setPhno(9632430866l);
		
		Sim sim4 = new Sim();
		sim4.setProvider("VI");
		sim4.setType("4G");
		sim4.setCost(399.0);
		sim4.setPhno(9448697858l);
		
		List<Sim> list1 = new ArrayList<Sim>();
		list1.add(sim1);
		list1.add(sim2);
	
		List<Sim> list2 = new ArrayList<Sim>();
		list2.add(sim3);
		list2.add(sim4);
		
		mobile1.setSims(list1);
		mobile2.setSims(list2);
		
		entityTransaction.begin();
		entityManager.persist(mobile1);
		entityManager.persist(mobile2);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityManager.persist(sim3);
		entityManager.persist(sim4);
		entityTransaction.commit();
		
	}

}
