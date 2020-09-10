package com.main;

import java.util.Scanner;

public class ToLowerCase {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter input String");
		String string=scanner.nextLine();
		System.out.println("String in lowercase");
		System.out.println(string.toLowerCase());

	}

}
