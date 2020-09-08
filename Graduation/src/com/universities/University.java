package com.universities;

import java.util.List;

import com.address.Address;
import com.colleges.College;
import com.departments.Department;


public class University {

	private int universityId;
	private String universityName;
	private Address address;
	private List<College> colleges;
	private List<Department> departments;
	
	public University(int universityId, String universityName, Address address) {
		super();
		this.universityId = universityId;
		this.universityName = universityName;
		this.address = address;
		
	}
	public int getUniversityId() {
		return universityId;
	}
	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<College> getColleges() {
		return colleges;
	}
	public void setColleges(List<College> colleges) {
		this.colleges = colleges;
	}
	public List<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	@Override
	public String toString() {
		return "University [universityId=" + universityId + ", universityName=" + universityName + ", address="
				+ address + ", colleges=" + colleges + ", departments=" + departments + "]";
	}
	
	
	
	
}
