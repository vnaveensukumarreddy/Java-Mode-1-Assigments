package com.main;

import java.util.Scanner;

public class ReplaceCharacter {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter input String");
		String string=scanner.nextLine();
		char oldChar='d';
		char newChar='h';
		
		System.out.println(string.replace(oldChar, newChar));

	}

}
