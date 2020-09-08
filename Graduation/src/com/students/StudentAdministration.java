package com.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.colleges.College;
import com.departments.Department;
import com.universities.University;

public class StudentAdministration {
	Scanner scanner = new Scanner(System.in);

	public List<Student> addNewStudentToUniversity(List<University> universities) {
		List<Student> students = new ArrayList<Student>();

		System.out.println("Enter the UniveristyId");
		int universityId = scanner.nextInt();

		for (University university : universities) {
			if (universityId == university.getUniversityId()) {

				System.out.println("Enter studentId");
				int studentId = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter studentFirstName ");
				String studentFirstName = scanner.nextLine();
				System.out.println("studentLastName");
				String studentLastName = scanner.nextLine();
				System.out.println("Enter Student Age ");
				int studentAge = scanner.nextInt();
				scanner.nextLine();
				System.out.println("studentGender");
				String studentGender = scanner.nextLine();
				
				System.out.println("Enter the department name");
				String departmentName = scanner.nextLine();
				Student student = new Student(studentId, studentFirstName, studentLastName, studentAge, studentGender,
						departmentName);
				students.add(student);
				List<Department> departments = university.getDepartments();
				for (Department department : departments) {
					if (department.getDepartmentName().equalsIgnoreCase(departmentName)) {
						department.setStudents(students);
					}
				}
			}
		}
		return students;

	}
	public List<Student> addNewStudenttoCollege(List<University> universities) {
		List<Student> students = new ArrayList<Student>();

		System.out.println("Enter the UniveristyId");
		int universityId = scanner.nextInt();
		System.out.println("Enter the CollegeId");
		int collegeId=scanner.nextInt();

		for (University university : universities) {
			if (universityId == university.getUniversityId()) {

				System.out.println("Enter studentId");
				int studentId = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter studentFirstName ");
				String studentFirstName = scanner.nextLine();
				System.out.println("studentLastName");
				String studentLastName = scanner.nextLine();
				System.out.println("Enter Student Age ");
				int studentAge = scanner.nextInt();
				scanner.nextLine();
				System.out.println("studentGender");
				String studentGender = scanner.nextLine();
				
				System.out.println("Enter the department name");
				String departmentName = scanner.nextLine();
				Student student = new Student(studentId, studentFirstName, studentLastName, studentAge, studentGender,
						departmentName);
				students.add(student);
				List<College> colleges=university.getColleges();
				for(College college:colleges)
				{
					if(college.getCollegeId()==collegeId)
					{
				
				List<Department> departments = college.getDepartments();
				for (Department department : departments) {
					if (department.getDepartmentName().equalsIgnoreCase(departmentName)) {
						department.setStudents(students);
					}
				}
					}
				}
			}
		}
		return students;

	}

}
