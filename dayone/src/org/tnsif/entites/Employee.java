package org.tnsif.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	@Id
	private int id;
	private String name;
	
	//gaters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
