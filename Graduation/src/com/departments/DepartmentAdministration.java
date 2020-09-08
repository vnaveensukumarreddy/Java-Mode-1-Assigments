package com.departments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.colleges.College;
import com.universities.University;

public class DepartmentAdministration {
	Scanner scanner = new Scanner(System.in);

	public List<Department> addNewDepartmentToUniversity(List<University> universities) {
		List<Department> departments = new ArrayList<>();
		System.out.println("Enter the universityId");
		int universityId = scanner.nextInt();
		for (University university : universities) {

			if (universityId == university.getUniversityId()) {

				System.out.println("Enter Department Id");
				int departmentId = scanner.nextInt();
				System.out.println("Enter Department  Name");
				scanner.nextLine();
				String departmentName = scanner.nextLine();

				Department department = new Department(departmentId, departmentName);
				departments.add(department);
				university.setDepartments(departments);
			}
		}
		return departments;

	}

	public List<Department> addNewDepartmentToCollege(List<University> universities) {
		List<Department> departments = new ArrayList<>();
		System.out.println("Enter the UniversityId");
		int universityId = scanner.nextInt();
		System.out.println("Enter the College id");
		int collegeId = scanner.nextInt();
		for (University university : universities) {

			if (universityId == university.getUniversityId()) {

				System.out.println("Enter Department Id");
				int departmentId = scanner.nextInt();
				System.out.println("Enter Department  Name");
				scanner.nextLine();
				String departmentName = scanner.nextLine();

				Department department = new Department(departmentId, departmentName);
				departments.add(department);
				List<College> colleges = university.getColleges();
				for (College college : colleges) {
					if (college.getCollegeId() == collegeId) {
						college.setDepartments(departments);
					}
				}
			}
		}
		return departments;

	}
}
