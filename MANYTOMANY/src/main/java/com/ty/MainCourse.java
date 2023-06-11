package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainCourse {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student student1 = new Student();
		student1.setName("Madhu");
		student1.setPhno(9632430866l);
		student1.setGender("Female");
		student1.setMarks(65);
		
		Student student2 = new Student();
		student2.setName("Madhusudhan");
		student2.setPhno(9632430877l);
		student2.setGender("Male");
		student2.setMarks(85);
		
		Student student3 = new Student();
		student3.setName("Madhan");
		student3.setPhno(9633330866l);
		student3.setGender("Male");
		student3.setMarks(95);
		
		Course course1  = new Course();
		course1.setName("Java Full Stack");
		course1.setFees(45999.0);
		course1.setTrainer("Keshav Era");

		Course course2  = new Course();
		course2.setName("MERN Stack");
		course2.setFees(45999.0);
		course2.setTrainer("Venkatesh");
		
		Course course3  = new Course();
		course3.setName("Python Full Stack");
		course3.setFees(45999.0);
		course3.setTrainer("Subhash");
		
		List<Course> list1 = new ArrayList<Course>();
		list1.add(course1);
		list1.add(course2);
		
		List<Course> list2 = new ArrayList<Course>();
		list2.add(course3);
		list2.add(course1);
		
		List<Course> list3 = new ArrayList<Course>();
		list3.add(course1);
		list3.add(course2);
		list3.add(course3);
		
		student1.setCourses(list1);
		student2.setCourses(list2);
		student3.setCourses(list3);
		
		entityTransaction.begin();
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityTransaction.commit();
	}

}
