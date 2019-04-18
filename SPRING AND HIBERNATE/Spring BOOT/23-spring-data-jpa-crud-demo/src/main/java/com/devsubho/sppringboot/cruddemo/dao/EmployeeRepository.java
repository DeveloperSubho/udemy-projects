package com.devsubho.sppringboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsubho.sppringboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
