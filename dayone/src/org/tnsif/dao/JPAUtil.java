package org.tnsif.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class JPAUtil {
private static EntityManagerFactory factory;
private static EntityManager em;

//entity manager
//create persist
//retrieve=finf
//update=merge
//delete=remove

static {
	factory=persistance.createEntityManagerFactory("JPA-PU") ;
	
}
//jpa lifecycle
public static EntityManager getEntitManager()

{
	if(em==null | | !em.isOpen())
	{
		em=factory.createEntityManager();
		
	}
	return em ;
}
}
