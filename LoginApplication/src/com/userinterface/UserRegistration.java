package com.userinterface;

import java.util.Scanner;

import com.pojo.UserLogin;
import com.serviceImpl.ServiceImpl;

public class UserRegistration {

	Scanner scanner=new Scanner(System.in);
	ServiceImpl serviceImpl=new ServiceImpl();
	public UserLogin userDetails()
	{
	  System.out.println("Enter User Email");
	  String userEmail=scanner.nextLine();
	  System.out.println("Enter User Name");
	  String userName=scanner.nextLine();
	  System.out.println("Enter User Mobile phone");
	  String userMobileNumber=scanner.nextLine();
	  System.out.println("Enter User Password");
	  String userPassword=serviceImpl.userPassword();
	  
	  System.out.println("Enter Confirm User Password");
	  String confirmUserPassword=serviceImpl.confirmUserPassword(userPassword);
	  UserLogin userLogin=new UserLogin(userEmail, userName, userMobileNumber, userPassword, confirmUserPassword);
	return userLogin;
	  
	}
}
