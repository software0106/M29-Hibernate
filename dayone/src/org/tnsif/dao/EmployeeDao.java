package org.tnsif.dao;

public interface EmployeeDao {
//by default abstract method
	//user define method for CRUD OPERATION 
	void addEmployee(Employee emp);
	//create
	
	Employee getEmployee(int id);//retrive
	void updateEmployee(Employee emp); //update
	void deleteEmployee(Employee emp);//delete
	//jpa transaction 
	void beginTransaction();
	void commitTransaction();
}
