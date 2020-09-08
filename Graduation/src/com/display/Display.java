package com.display;

import java.util.List;
import java.util.Scanner;

import com.colleges.College;
import com.departments.Department;
import com.universities.University;

public class Display {
	Scanner scanner = new Scanner(System.in);

	public void displayUniversities(List<University> universities) {
		System.out.println("Total universities");
		for (University university : universities) {
			System.out.println(university);
		}

	}

	public void displayCollegesByUniversityName(List<University> universities) {
		System.out.println("Enter the University Name");
		String universityName = scanner.nextLine();
		System.out.println("colleges under" + universityName);
		for (University university : universities) {
			if (university.getUniversityName().equalsIgnoreCase(universityName)) {

				List<College> colleges = university.getColleges();
				for (College college : colleges) {
					System.out.println(college);
				}
			}
		}

	}

	public void displayUniversitiesAndCollegesByDepartmentName(List<University> universities) {
		System.out.println("Enter DepartmentName");
		String departmentName = scanner.nextLine();
		System.out.println("colleges and universities having" + departmentName + "Branch");
		for (University university : universities) {
			List<Department> departments = university.getDepartments();
			for (Department department : departments) {
				if (department.getDepartmentName().equalsIgnoreCase(departmentName)) {
					System.out.println(university.getUniversityName());
				}
			}
		}
		for (University university : universities) {
			List<College> colleges = university.getColleges();

			try
			{
			if (!colleges.isEmpty()) {

				for (College college : colleges) {
					List<Department> departments = college.getDepartments();
					if(!departments.isEmpty())
					{
					for (Department department : departments) {
						if (department.getDepartmentName().equalsIgnoreCase(departmentName)) {
							System.out.println(
									college.getCollegeName() + " under " + " " + university.getUniversityName());
						}
					}
					}
				}
			}
			}
			catch(Exception e)
			{
				
			}
		}

	}

}
