package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCountry {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		State state1 = new State();
		state1.setName("Karnataka");
		state1.setCm("Bommai");
		state1.setCapital("Bengaluru");
		state1.setLang("Kannada");
		
		State state2 = new State();
		state2.setName("Kerala");
		state2.setCm("Stalin");
		state2.setCapital("Kochi");
		state2.setLang("Malayalam");
		
		State state3 = new State();
		state3.setName("Maharashtra");
		state3.setCm("Ritesh Deshmukh");
		state3.setCapital("Mumbai");
		state3.setLang("Marathi");
		
		State state4 = new State();
		state4.setName("Uttarpradesh");
		state4.setCm("Yogi");
		state4.setCapital("Lucknow");
		state4.setLang("Hindi");
		
		Country country1 = new Country();
		country1.setName("India");
		country1.setPm("Narendra Modi");
		country1.setCapital("New Delhi");
		
		Country country2 = new Country();
		country2.setName("North Korea");
		country2.setPm("Kim John Ungh");
		country2.setCapital("Bussan");
		
		state1.setCountry(country1);
		state2.setCountry(country1);
		state3.setCountry(country2);
		state4.setCountry(country2);
		
		entityTransaction.begin();
		entityManager.persist(state1);
		entityManager.persist(state2);
		entityManager.persist(state3);
		entityManager.persist(state4);
		entityManager.persist(country1);
		entityManager.persist(country2);
		entityTransaction.commit();

	}

}
