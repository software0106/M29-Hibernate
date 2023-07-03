package org.tnsif.tableperclassinheritance;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TablePerClassInheritance {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Citizen c=new Citizen();
		c.setAadharNo(123445614587L);
		c.setCity("Pune");
		c.setCity("Akola");
		em.persist(c);
		
		Person p=new Person();
		p.setAadharNo(546145879658L);
		p.setCity("Mumbai");
		p.setArea("Bandra");	
		em.persist(p);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully");
		em.close();
		factory.close();
	}


}
