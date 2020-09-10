package com.main;

import java.util.Scanner;

import com.processing.averageOfNumbers;

public class AverageMainApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first Number");
		int firstNumber=scanner.nextInt();
		System.out.println("Enter the second Number");
		int secondNumber=scanner.nextInt();
		System.out.println("Enter the third Number");
		int thirdNumber=scanner.nextInt();
		averageOfNumbers averageOfNumbers=new averageOfNumbers();
		System.out.println("Average of three Numbers"+ averageOfNumbers.average(firstNumber, secondNumber, thirdNumber));
	}

}
