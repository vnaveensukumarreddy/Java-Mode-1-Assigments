package com.main;

import java.util.Scanner;

import com.processing.ArithmeticOperations;

public class CalculatorMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		ArithmeticOperations arithmeticOperations=new ArithmeticOperations();
		System.out.println("Enter the first Number");
		int firstNumber=scanner.nextInt();
		System.out.println("Enter the second Number");
		int secondNumber=scanner.nextInt();
        System.out.println("Addition of two numbers"+" "+arithmeticOperations.addition(firstNumber, secondNumber));
        System.out.println("Subtraction of two numbers"+" "+arithmeticOperations.subtraction(firstNumber, secondNumber));
        System.out.println("Multiply of two numbers"+" "+arithmeticOperations.multiplication(firstNumber, secondNumber));
        System.out.println("Divison of two numbers"+" "+arithmeticOperations.divison(firstNumber, secondNumber));
        System.out.println("Modulo of two numbers"+" "+arithmeticOperations.modulo(firstNumber, secondNumber));
	}

}
