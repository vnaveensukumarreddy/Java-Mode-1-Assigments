package com.main;

import java.util.Scanner;

import com.arrays.ReverseModifiedApp;



public class ReverseModifiedString {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter input String");
		String string=scanner.nextLine();
		System.out.println("Enter input character");
		char character=scanner.nextLine().charAt(0);
		System.out.println("Modified reverse String   "+ReverseModifiedApp.getString(string, character));

	}

}
