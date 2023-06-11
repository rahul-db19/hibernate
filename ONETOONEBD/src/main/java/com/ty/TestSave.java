package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =  entityManager.getTransaction();
		
		Company company1 = new Company();
		company1.setName("Infosys");
		company1.setWebsite("www.infosys.com");
		company1.setLocation("Mysore");
		company1.setPhno(9632430866l);
		
		Company company2 = new Company();
		company2.setName("TCS");
		company2.setWebsite("www.tcs.com");
		company2.setLocation("Bangalore");
		company2.setPhno(9632430877l);
		
		Gst gst1 = new Gst();
		gst1.setGstno("96324infy");
		gst1.setState("Karnataka");
		gst1.setCountry("India");
		
		Gst gst2 = new Gst();
		gst2.setGstno("96324tcs");
		gst2.setState("Maharashtra");
		gst2.setCountry("India");
		
		company1.setGst(gst1);
		company2.setGst(gst2);
		
		gst1.setCompany(company1);
		gst2.setCompany(company2);
		
		entityTransaction.begin();
		entityManager.persist(company1);
		entityManager.persist(company2);
		entityManager.persist(gst1);
		entityManager.persist(gst2);
		entityTransaction.commit();
	}

}
