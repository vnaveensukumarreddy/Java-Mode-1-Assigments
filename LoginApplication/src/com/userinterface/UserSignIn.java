package com.userinterface;

import java.util.List;
import java.util.Scanner;

import com.pojo.UserLogin;
import com.serviceImpl.ServiceImpl;

public class UserSignIn {

	Scanner scanner=new Scanner(System.in);
	ServiceImpl serviceImpl=new ServiceImpl();
	Welcome welcome=new Welcome();
	public void userSignIn(List<UserLogin> userLogins)
	{
		System.out.println("Enter userEmail");
		String userEmail=scanner.nextLine();
		System.out.println("Enter userPassword");
		String userPassword=scanner.nextLine();
		if(serviceImpl.signInService(userEmail, userPassword, userLogins))
		{
			welcome.welcome(userEmail);
		}
		
	}
}
