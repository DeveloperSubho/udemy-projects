package com.devsubho.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.devsubho.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{

}
