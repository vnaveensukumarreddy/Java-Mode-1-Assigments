package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pavanschool.student.Student;
import com.pavanschool.student.StudentDetails;

public class MainApp {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();
		StudentDetails studentDetails = new StudentDetails();
		Scanner scanner = new Scanner(System.in);
		int[] n=new int[5];
		boolean repeat = true;
		while (repeat) {
			System.out.println("Press 1 to add new student");
			System.out.println("Press 2 to know complete Student Details");
			System.out.println("Press 3 to know Full Name of a Student");
			System.out.println("Press 4 to know Age of a Student");
			System.out.println("press 5 to know Average Marks of a Student");
			System.out.println("Press 6 to know  Student total marks");
			System.out.println("Press 7 to seach Student by name");
			System.out.println("Press 8 to seach Student by id");
			System.out.println("Press 9 to Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				studentDetails.addnewStudent(studentList);
				break;
			case 2:
				studentDetails.studentCompleteDetails(studentList);
				break;
			case 3:
				studentDetails.studentFullName(studentList);
				break;
			case 4:
				studentDetails.studentAge(studentList);
				break;
			case 5:
				studentDetails.studentAverageMarks(studentList);
				break;
			case 6:
				studentDetails.studentTotalMarks(studentList);
				break;
			case 7:
				studentDetails.searchStudentById(studentList);
				break;
			case 8:
				studentDetails.searchStudentByName(studentList);
				break;
			case 9:
				repeat = false;
				break;
			default:
				break;
			}

		}

	}
}
