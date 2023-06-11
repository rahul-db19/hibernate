package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetStudentById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager =  entityManagerFactory.createEntityManager();

		Student student = entityManager.find(Student.class, 101);

		System.out.println("Student ID : "+student.getId());
		System.out.println("Student Name : "+student.getName());
		System.out.println("Student Age : "+student.getAge());
		System.out.println("Student Gender : "+student.getGender());
		System.out.println("Student Phono : "+student.getPhno());
		System.out.println("Student Marks : "+student.getMarks());
	}
}