package com.devsubho.sppringboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.devsubho.sppringboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	
	// Define field for entitymanager
	private EntityManager entityManager;
	
	// Set up constructor injection
	@Autowired
	public EmployeeDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Override
	public List<Employee> findAll() {
		// Get the current hibernate session
		Session currentSesson = entityManager.unwrap(Session.class);
		
		// Create a query
		Query<Employee> theQuery = 
				currentSesson.createQuery("from Employee", Employee.class);
		
		// Execute the query an get the result list
		List<Employee> employees = theQuery.getResultList();
		
		// Return the results
		return employees;
	}

	@Override
	public Employee findById(int theId) {

		// Get the current hibernate session
		Session currentSesson = entityManager.unwrap(Session.class);
		
		// Get the employee
		Employee theEmployee = 
				currentSesson.get(Employee.class, theId);
		
		// Return the employee
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		// Get the current hibernate session
		Session currentSesson = entityManager.unwrap(Session.class);
				
		// Save employee
		currentSesson.saveOrUpdate(theEmployee);	
	}

	@Override
	public void deleteById(int theId) {
		// Get the current hibernate session
		Session currentSesson = entityManager.unwrap(Session.class);
						
		// Delete Employee
		Query theQuery = 
		currentSesson.createQuery("delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId", theId);
		theQuery.executeUpdate();
	}

}
