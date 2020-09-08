package com.main;

import java.util.Scanner;

public class SwapMainApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first Number");
		int firstNumber=scanner.nextInt();
		System.out.println("Enter the second Number");
		int secondNumber=scanner.nextInt();
		System.out.println("first number  "+ firstNumber);
		System.out.println("second number "+ secondNumber);
		
		int temp=firstNumber;
		firstNumber=secondNumber;
		secondNumber=temp;
		System.out.println("first number  "+ firstNumber);
		System.out.println("second number "+ secondNumber);
	}

}
