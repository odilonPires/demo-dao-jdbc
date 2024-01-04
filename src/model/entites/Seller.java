package model.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String emaisl;
	private Date birtgdate;
	private Double baseSalary;
	
	private Department department;
	
	public Seller(){
	}

	public Seller(Integer id, String name, String emaisl, Date birtgdate, Double baseSalary, Department department) {
		this.id = id;
		this.name = name;
		this.emaisl = emaisl;
		this.birtgdate = birtgdate;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmaisl() {
		return emaisl;
	}

	public void setEmaisl(String emaisl) {
		this.emaisl = emaisl;
	}

	public Date getBirtgdate() {
		return birtgdate;
	}

	public void setBirtgdate(Date birtgdate) {
		this.birtgdate = birtgdate;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", emaisl=" + emaisl + ", birtgdate=" + birtgdate
				+ ", baseSalary=" + baseSalary + ", department=" + department + "]";
	}	
}
