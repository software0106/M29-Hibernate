package org.tnsif.singletableinhertance;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class SingleTableInhertanceExecutor {
public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//CREATE EMPLOYEE
		Employee emp=new Employee();
		emp.setEmpName("Parag Gupta");
		emp.setSalary(50050.5f);
		em.persist(emp);
		
		//CREATE EMPLOYEE
		Employee emp1=new Employee();
		emp1.setEmpName("Pranita Gupta");
		emp1.setSalary(60050.5f);
		em.persist(emp1);

		//CREATE EMPLOYEE
		Manager m=new Manager();
		m.setEmpName("Shiwani k");
		m.setSalary(49500.6f);
		m.setDeptName("HR");
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully");
		em.close();
		factory.close();
	}

}
}
