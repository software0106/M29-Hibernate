package org.tnsif.singletableinhertance;


import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table(name="Employee")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn name="Emp_type",discriminatorType=Discriminator
@DiscriminatorValue("EMP")

public class Employee {
	//private data members
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int empId;
	private String empName;
	private float salary;
	public int getEmpId();
	return empId();

}
