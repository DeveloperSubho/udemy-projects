package com.devsubho.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.devsubho.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		// Create SessionFactory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		// Create Session
		Session session = factory.getCurrentSession();
		
		try {
			// Use the session object to save java object
			System.out.println("Creating new student object:");
			Student tempStudent = new Student("Subhajit","Sarkar","devsubho@gmail.com");
			
			// Create Student object
			
			// Start transaction
			session.beginTransaction();
			
			// Save the Student object
			System.out.println("Saving the object:");
			session.save(tempStudent);
			
			// Commit transaction
			session.getTransaction().commit();
			
			System.out.println("Student saved");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}

}
