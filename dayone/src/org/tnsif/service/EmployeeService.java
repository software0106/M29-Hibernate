package org.tnsif.service;

import org.tnsif.dao.Employee;

public interface EmployeeService {
	void createEmployee(Employee emp);
	//create
	
	Employee retrieveEmployee(int id);//retrive
	void updateEmployee(Employee emp); //update
	void removeEmployee(Employee emp);//delete
	
	 void beginTransaction();
	    void commitTransaction();
	    
}
