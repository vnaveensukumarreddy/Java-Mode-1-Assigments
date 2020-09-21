package com.main;

import java.util.Scanner;

import com.userdefinedexceptions.UserDefinedException;

public class UserDefinedExceptionApp {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter two Integers");
		try {
		int firstNumber=scanner.nextInt();
		int secondNumber=scanner.nextInt();
		if(firstNumber<=0 || secondNumber<=0)
		{
			throw new UserDefinedException("Both values must be greater than zero");
		}
		else
		{
			System.out.println(MyCalculator.power(firstNumber, secondNumber));
		}
		}
		catch(UserDefinedException e)
		
		{
			System.out.println(e);
		}
	}

}
