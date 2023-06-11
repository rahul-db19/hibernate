package com.ty;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllData {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

//		Query query = entityManager.createQuery("select s from Student s");
//		List<Student> students = query.getResultList();

		Query query = entityManager.createQuery("select s from Student s where s.gender=?1 and s.age=?2");
		query.setParameter(1, "male");
		query.setParameter(2,23 );
		List<Student> students = query.getResultList();

		for (Student student : students) {
			System.out.println("Student ID : " + student.getId());
			System.out.println("Student Name : " + student.getName());
			System.out.println("Student Age : " + student.getAge());
			System.out.println("Student Gender : " + student.getGender());
			System.out.println("Student Phono : " + student.getPhno());
			System.out.println("Student Marks : " + student.getMarks());
			System.out.println("--------------------------------------");
		}
	}

}
