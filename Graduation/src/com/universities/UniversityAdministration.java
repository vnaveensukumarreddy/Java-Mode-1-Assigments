package com.universities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.address.Address;
import com.departments.Department;



public class UniversityAdministration {
	Scanner scanner = new Scanner(System.in);
    Department department=new Department();
	public List<University> addNewUniversity(List<University> universities) {
		System.out.println("Enter University Id");
		int universityId = scanner.nextInt();
		System.out.println("Enter University Name");
		scanner.nextLine();
		String universityName = scanner.nextLine();
		System.out.println("Enter the University Address");
		System.out.println("Enter the door Number");
		String doorNumber = scanner.nextLine();
		System.out.println("Enter the city");
		String city = scanner.nextLine();
		System.out.println("Enter the district");
		String district = scanner.nextLine();
		System.out.println("Enter the state");
		String state = scanner.nextLine();
		System.out.println("Enter the country");
		String country = scanner.nextLine();
		Address address = new Address(doorNumber, city, district, state, country);
		University university = new University(universityId, universityName, address);
		universities.add(university);
		return universities;
	}

	
	

	

	

}
