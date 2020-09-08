package com.pavanschool.student;

import java.util.List;
import java.util.Scanner;

public class StudentDetails {

	Scanner scanner = new Scanner(System.in);

	public void studentCompleteDetails(List<Student> studentList) {
		for (Student student : studentList) {
			System.out.println(student);
		}
	}

	public void addnewStudent(List<Student> studentList) {
		Student student = new Student();
		System.out.println("Enter studentId");
		int studentId = scanner.nextInt();
		student.setStudentId(studentId);
		scanner.nextLine();
		System.out.println("Enter studentFirstName ");
		String studentFirstName = scanner.nextLine();
		student.setStudentFirstName(studentFirstName);
		System.out.println("studentLastName");
		String studentLastName = scanner.nextLine();
		student.setStudentLastName(studentLastName);
		System.out.println("Enter Student Age ");
		int studentAge = scanner.nextInt();
		student.setStudentAge(studentAge);
		scanner.nextLine();
		System.out.println("studentGender");
		String studentGender = scanner.nextLine();
		student.setStudentGender(studentGender);
		System.out.println("studentMarks");
		float studentLanguageSubjectMarks = scanner.nextFloat();
		float studentGroupSubjectMarks = scanner.nextFloat();
		float[] studentMarks=new float[2];
	    studentMarks[0]=studentLanguageSubjectMarks;
	    studentMarks[1]=studentGroupSubjectMarks;
		student.setStudentMarks(studentMarks);
		scanner.nextLine();
		System.out.println("Enter studentMajor");
		String studentMajor = scanner.nextLine();
		student.setStudentMajor(studentMajor);
		studentList.add(student);
	}

	public void studentFullName(List<Student> studentList) {
		System.out.println("Enter studentId");
		int studentId = scanner.nextInt();
		for (Student student : studentList) {
			if (student.getStudentId() == studentId) {
				System.out.println(student.getStudentFirstName() + " " + student.getStudentLastName());
			}
		}
	}

	public void studentAge(List<Student> studentList) {
		System.out.println("Enter studentId");
		int studentId = scanner.nextInt();
		for (Student student : studentList) {
			if (student.getStudentId() == studentId) {
				System.out.println("age is" + " " + student.getStudentAge());
			}
		}
	}

	public void studentTotalMarks(List<Student> studentList) {
		System.out.println("Enter studentId");
		int studentId = scanner.nextInt();
		for (Student student : studentList) {
			if (student.getStudentId() == studentId) {
				float[] studentMarks=student.getStudentMarks();
				float add=(studentMarks[0]+studentMarks[1]);
				System.out.println("Total Marks" + " " + add);
			}
		}
	}

	public void studentAverageMarks(List<Student> studentList) {
		System.out.println("Enter studentId");
		int studentId = scanner.nextInt();
		for (Student student : studentList) {
			if (student.getStudentId() == studentId) {
				float[] studentMarks=student.getStudentMarks();
				float add=(studentMarks[0]+studentMarks[1])/2;
				System.out.println("Total Marks" + " " + add);
			}
		}
	}

	public void searchStudentById(List<Student> studentList) {
		System.out.println("Enter studentId");
		int studentId = scanner.nextInt();
		for (Student student : studentList) {
			if (student.getStudentId() == studentId) {
				System.out.println(student);
			}
		}
	}

	public void searchStudentByName(List<Student> studentList) {
		System.out.println("Enter studentName");
		String studentName = scanner.nextLine();
		for (Student student : studentList) {
			if (student.getStudentFirstName() == studentName) {
				System.out.println(student);
			}
		}
	}

}
