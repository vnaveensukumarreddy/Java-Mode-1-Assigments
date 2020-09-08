package com.serviceImpl;

import java.util.List;
import java.util.Scanner;

import com.pojo.UserLogin;
import com.service.Service;

public class ServiceImpl implements Service {
Scanner scanner=new Scanner(System.in);
	@Override
	public String userPassword() {
	
			 String resultString=" ";
			 boolean repeat=true;
			 while(repeat)
			 {
				 String userPassword=scanner.nextLine();
				 if(userPassword.length()>=8 && userPassword.contains("@"))
				 {
					 resultString=userPassword;
					 repeat=false;
				 }
				 else
				 {
					 System.out.println("password length >=8   && password must contains @");
				 }
			 }
				
			
		return resultString;
	}

	@Override
	public String confirmUserPassword(String userPassword) {
		 String resultString=" ";
		 boolean repeat=true;
		 while(repeat)
		 {
			 String confirmUserPassword=scanner.nextLine();
			 if(userPassword.equals(userPassword))
			 {
				 resultString=confirmUserPassword;
				 repeat=false;
			 }
			 else
			 {
				 System.out.println("Passwords are not matching");
			 }
		 }
			
		
	return resultString;
	}

	@Override
	public boolean signInService(String userEmail, String userPassword, List<UserLogin> userLogins) {
		
		for(UserLogin userLogin:userLogins)
		{
			if(userLogin.getUserEmail().equalsIgnoreCase(userEmail))
			{
				if(userLogin.getUserpassword().equals(userPassword))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		return false;
	}



}
