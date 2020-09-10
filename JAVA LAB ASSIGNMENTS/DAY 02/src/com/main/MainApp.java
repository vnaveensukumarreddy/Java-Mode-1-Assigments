package com.main;

import java.util.Scanner;

import com.processing.Processing;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first Number");
		int firstNumber=scanner.nextInt();
		System.out.println("Enter the second Number");
		int secondNumber=scanner.nextInt();
		
		System.out.println("Enter third number ");
		int thirdNumber=scanner.nextInt();
		System.out.println("Smallest of three numbers  "+Processing.smallestNumber(firstNumber, secondNumber, thirdNumber));
		scanner.nextLine();
		System.out.println("Enter the String of to which middle character has to be found");
		String string=scanner.nextLine();
		Processing.middle(string);
		System.out.println("Enter the Sentence to which no of vowels has to be found");
		String sentence=scanner.nextLine();
		System.out.println("No of vowels in sentence"+Processing.noOfVowels(sentence));
		

	}

}
