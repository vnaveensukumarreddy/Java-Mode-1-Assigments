package com.main;

import java.util.Scanner;

public class AsciValueApp {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the character");
		
		char character=scanner.next().charAt(0);
		System.out.println("Ascii Value of "+character+ " is "+ (int)character);
	}

}
