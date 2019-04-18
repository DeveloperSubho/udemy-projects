package com.devsubbho.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsubbho.springdemo.entity.Student;
import com.devsubbho.springdemo.entity.StudentErrorResponse;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	List<Student> theStudent;
	
	// Define Post
	@PostConstruct
	public void loadData() {
		
		theStudent = new ArrayList<Student>();
		theStudent.add(new Student("Subhajit","Sarkar"));
		theStudent.add(new Student("Virat","Kohli"));
		theStudent.add(new Student("Sachin","Tendulkar"));
		theStudent.add(new Student("Sourav","Ganguly"));
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return theStudent;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		if(studentId >= theStudent.size() || studentId<0) {
			throw new StudentNotFoundException("Student Id not found: "+studentId);
		}
		return theStudent.get(studentId);
	}
}
