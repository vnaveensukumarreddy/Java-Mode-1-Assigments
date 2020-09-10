package com.main;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter input String");
		String string=scanner.nextLine();
		StringBuffer stringBuffer=new StringBuffer(string);
		StringBuffer reverseString=stringBuffer.reverse();
		
		if(stringBuffer.equals(reverseString))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
