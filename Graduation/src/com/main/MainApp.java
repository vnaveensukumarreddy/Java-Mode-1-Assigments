package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.colleges.College;
import com.colleges.CollegeAdministration;
import com.departments.Department;
import com.departments.DepartmentAdministration;
import com.display.Display;
import com.students.Student;
import com.students.StudentAdministration;
import com.universities.University;
import com.universities.UniversityAdministration;

public class MainApp {

	public static void main(String[] args) {
		List<University> universities = new ArrayList<>();
		UniversityAdministration universityAdministration = new UniversityAdministration();
		CollegeAdministration collegeAdministration=new CollegeAdministration();
		DepartmentAdministration departmentAdministration=new DepartmentAdministration();
		StudentAdministration studentAdministration=new StudentAdministration();
		Display display=new Display();
		Scanner scanner = new Scanner(System.in);
		
		boolean repeat = true;
		while (repeat) {
			System.out.println("press 1 for university registration");
			System.out.println("press 2 for adding new colleges in existing university");
			System.out.println("press 3 for adding new departments in existing university");
			System.out.println("press 4 for admission in University");
			System.out.println("press 5 for adding new departments in existing college");
			System.out.println("press 6 for admission  in college");
			System.out.println("Press 7 to displayUniversities  ");
			System.out.println("Press 8 to displayCollegesByUniversityName  ");
			System.out.println("Press 9 to displayUniversitiesAndCollegesByDepartmentName  ");
			System.out.println("press 10 to exit");
			
			System.out.println("");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
			    List<University> universities2=universityAdministration.addNewUniversity(universities);
			    System.out.println(universities2);
				break;
			case 2:
				List<College> colleges=collegeAdministration.addNewCollege(universities);
				break;
			case 3:
				List<Department> departmentsInUniversity=departmentAdministration.addNewDepartmentToUniversity(universities);
				break;
			case 4:
				List<Student> studentsInUniversitys=studentAdministration.addNewStudentToUniversity(universities);
				break;
			case 5:
				List<Department> departmentsInCollege=departmentAdministration.addNewDepartmentToCollege(universities);
				break;
			case 6:
				List<Student> studentsInCollege=studentAdministration.addNewStudenttoCollege(universities);
				break;
			case 7:
				 display.displayUniversities(universities);
				 break;
			case 8:
				display.displayCollegesByUniversityName(universities);
				break;
			case 9:
				display.displayUniversitiesAndCollegesByDepartmentName(universities);
				break;
			case 10:
				repeat=false;
				
			default:

				break;
			}
		}

	}

}
