package org.tnsif.dao;

import javax.persistence.EntityManager;

public class EmployeeDaoimpl implements EmployeeDao {

	private EntityManager em;
	
	//default constructor5rrr555555
	public EmployeeDaoimpl() {
		em=JPAUtil.getEntitManager();
		
	}
//create or add
	@Override
	public void addEmployee(Employee emp) {
		em.persist(emp);
		
	}
	
	//retrive

	@Override
	public Employee getEmployee(int id) {
		Emplyee emp=em.find(Employee.class, id)
		return null;
	}
//update
	@Override
	public void updateEmployee(Employee emp) {
		em.merge(emp);
		
	}
//delete
	@Override
	public void deleteEmployee(Employee emp) {
		em.remove(emp);
		
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

}
