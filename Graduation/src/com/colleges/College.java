package com.colleges;

import java.util.List;

import com.address.Address;
import com.departments.Department;


public class College {

	private int collegeId;
	private String collegeName;
	private Address address;
	private List<Department> departments;
	public College(int collegeId, String collegeName, Address address) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.address = address;
		
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", address=" + address
				+ ", departments=" + departments + "]";
	}
	
}
