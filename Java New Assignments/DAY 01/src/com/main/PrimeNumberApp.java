package com.main;

import java.util.Scanner;

import com.processing.PrimeNumber;

public class PrimeNumberApp {

	
	public static void main(String[] args)
	{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number");
	
	int number=scanner.nextInt();
	PrimeNumber primeNumber=new PrimeNumber();
	boolean isPrime=primeNumber.isPrime(number);
	if(isPrime)
	{
		System.out.println(number+" "+"is prime number");
	}
	else
	{
		System.out.println(number+ " "+"is not a prime number");
	}
	
	}
}
