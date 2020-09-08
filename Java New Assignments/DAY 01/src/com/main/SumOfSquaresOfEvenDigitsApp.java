package com.main;

import java.util.Scanner;

import com.processing.SumOfSquaresOfEvenDigits;

public class SumOfSquaresOfEvenDigitsApp {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int number=scanner.nextInt();
		System.out.println("SumOfSquaresOfEvenDigits is  "+SumOfSquaresOfEvenDigits.sumOfSquaresOfEvenDigits(number));
	}

}
