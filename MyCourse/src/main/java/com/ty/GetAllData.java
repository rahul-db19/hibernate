package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllData {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
//		To get all the details of the course
//		Query query = entityManager.createQuery("select c from Course c");
//		List<Course> courses = query.getResultList();
		
//		To get the details of the course based on trainer and name of the course
		Query query = entityManager.createQuery("select c from Course c where c.name=?1 and c.trainer=?2");
		query.setParameter(1, "MERN Stack");
		query.setParameter(2,"Niranjan" );
		List<Course> courses = query.getResultList();
		
		for (Course course : courses) {
			System.out.println("course ID : " + course.getId());
			System.out.println("course Name : " + course.getName());
			System.out.println("course Age : " + course.getFees());
			System.out.println("course Gender : " + course.getTrainer());
			System.out.println("course Phono : " + course.getDuration());
			System.out.println("--------------------------------------");
		}
	}
}
