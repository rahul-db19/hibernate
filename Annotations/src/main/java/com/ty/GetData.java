package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetData {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("select d from Developer d where d.name=?1 and d.exp=?2");
		query.setParameter(1, "Rahul");
		query.setParameter(2, 3 );
		List<Developer> dev = query.getResultList();
		
		for (Developer developer : dev) {
			System.out.println("developer ID : " + developer.getId());
			System.out.println("developer Name : " + developer.getName());
			System.out.println("developer Age : " + developer.getAge());
			System.out.println("developer Gender : " + developer.getGender());
			System.out.println("developer Phono : " + developer.getPhno());
			System.out.println("developer Phono : " + developer.getExp());
			System.out.println("developer Phono : " + developer.getC_code());
			System.out.println("--------------------------------------");
		}
	}

}
