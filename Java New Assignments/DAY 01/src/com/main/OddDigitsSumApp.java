package com.main;

import java.util.Scanner;

import com.processing.OddDigitCheckSum;

public class OddDigitsSumApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int sumOfOddDigits=0;
		int number=scanner.nextInt();
		while(number>0) {
			int n=number%10;
			if(n%2!=0)
			{
				sumOfOddDigits+=n;
			}
			number=number/10;
		}
		System.out.println(sumOfOddDigits);
		System.out.println(OddDigitCheckSum.checkSum(sumOfOddDigits));
		
	}

}
