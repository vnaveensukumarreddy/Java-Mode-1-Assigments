package com.colleges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.address.Address;
import com.universities.University;

public class CollegeAdministration {
	
	Scanner scanner=new Scanner(System.in);
	public List<College> addNewCollege(List<University> universities) {
		
            List<College> colleges = new ArrayList<College>();
		     System.out.println("Enter the UniveristyId");
		    int universityId=scanner.nextInt();
		    for(University university:universities) {
		    	
		    	if(university.getUniversityId()==universityId)
		    	{
			System.out.println("Enter College Id");
			int collegeId = scanner.nextInt();
			System.out.println("Enter College Name");
			scanner.nextLine();
			String collegeName = scanner.nextLine();
			System.out.println("Enter the door Number");
			String doorNumber1 = scanner.nextLine();
			System.out.println("Enter the city");
			String city1 = scanner.nextLine();
			System.out.println("Enter the district");
			String district1 = scanner.nextLine();
			System.out.println("Enter the state");
			String state1 = scanner.nextLine();
			System.out.println("Enter the country");
			String country1 = scanner.nextLine();
			Address address1 = new Address(doorNumber1, city1, district1, state1, country1);
			College college = new College(collegeId, collegeName, address1);
			colleges.add(college);
			university.setColleges(colleges);
		    	}
		    }
		return colleges;
	}
	
}
