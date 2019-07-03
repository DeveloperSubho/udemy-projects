package com.devsubho.student.dal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.devsubho.student.dal.entities.Student;
import com.devsubho.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("Subhajit");
		student.setCourse("Machine Learning");
		student.setFee(30000d);
		
		studentRepository.save(student);
	}
	
	@Test
	public void testFindStudentById() {
		Optional<Student> student = studentRepository.findById(1l);
		System.out.println(student);
	}
	
	@Test
	public void testUpdateStudent() {
		Optional<Student> optionalStudent = studentRepository.findById(1l);
		Student student = optionalStudent.get();
		student.setFee(25000d);
		studentRepository.save(student);
		System.out.println(student);
	}
	
	@Test
	public void testDeleteStudent() {
		Student student = new Student();
		student.setId(1l);
		studentRepository.delete(student);
	}

}
