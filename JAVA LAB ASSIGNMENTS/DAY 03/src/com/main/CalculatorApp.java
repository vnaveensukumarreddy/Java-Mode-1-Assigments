package com.main;

import java.util.Scanner;

import com.hcl.Addition;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first Number");
		int firstNumber=scanner.nextInt();
		System.out.println("Enter the second Number");
		int secondNumber=scanner.nextInt();
      Addition addition=new Addition();
      System.out.println("Addition of two numbers "+ addition.add(firstNumber, secondNumber));
	}

}
