package com.pavanschool.student;

import java.util.Arrays;

public class Student {

	private int studentId;
	private String studentFirstName;
	private String studentLastName;
	private int studentAge;
	private String studentGender;
	private float studentMarks[];
	
	private String studentMajor;
	
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
	
	public float[] getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(float[] studentMarks) {
		this.studentMarks = studentMarks;
	}
	public String getStudentMajor() {
		return studentMajor;
	}
	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentFirstName=" + studentFirstName + ", studentLastName="
				+ studentLastName + ", studentAge=" + studentAge + ", studentGender=" + studentGender
				+ ", studentMarks=" + Arrays.toString(studentMarks) + ", studentMajor=" + studentMajor + "]";
	}
	
	
	
	
}
