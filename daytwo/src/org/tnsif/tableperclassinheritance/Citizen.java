package org.tnsif.tableperclassinheritance;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

//PARAENT CLASS
@Entity
@Table(name="Citizen")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Citizen {
	
	private long aadharNo;
	private String City;
	private String area;
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	

}
