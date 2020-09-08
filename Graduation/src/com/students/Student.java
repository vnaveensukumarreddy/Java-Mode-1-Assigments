package com.students;

import java.util.Arrays;

public class Student {

	private int studentId;
	private String studentFirstName;
	private String studentLastName;
	private int studentAge;
	private String studentGender;
	private String departmentName;
	
	
	
	public Student(int studentId, String studentFirstName, String studentLastName, int studentAge, String studentGender,
			String departmentName) {
		super();
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentAge = studentAge;
		this.studentGender = studentGender;
		this.departmentName = departmentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentFirstName() {
		return studentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	
	
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentFirstName=" + studentFirstName + ", studentLastName="
				+ studentLastName + ", studentAge=" + studentAge + ", studentGender=" + studentGender
				+ ", departmentName=" + departmentName + "]";
	}
	
	
	
	
}

