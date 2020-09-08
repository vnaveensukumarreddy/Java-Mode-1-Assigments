package com.userinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pojo.UserLogin;

public class UserInterface {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean repeat=true;
		UserRegistration userRegistration=new UserRegistration();
		List<UserLogin> userLogins=new ArrayList<UserLogin>();
		UserSignIn userSignIn=new UserSignIn();
		while(repeat)
		{
			System.out.println("Enter 1 to register an account");
			System.out.println("Enter 2 to sign in if already have an account");
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				UserLogin userLogin=userRegistration.userDetails();
				userLogins.add(userLogin);				break;
			case 2:
				userSignIn.userSignIn(userLogins);
				break;
			case 3:
				repeat=false;
			}
		}

	}

}
