package com.main;

import java.util.Scanner;

import com.abstractimpl.MyCalculator;

public class MyCalculatorApp {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		MyCalculator myCalculator=new MyCalculator();
		System.out.println("Enter the Number");
		int n=scanner.nextInt();
		System.out.println("Sum of Divisors of "+n+" is "+ myCalculator.divisor_sum(n));

	}

}
