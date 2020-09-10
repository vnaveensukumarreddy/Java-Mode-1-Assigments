package com.main;

import java.util.Scanner;

import com.arrays.ModifiedString;

public class ModifiedStringApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter input String");
		String string=scanner.nextLine();
		System.out.println("Modified String   "+ModifiedString.getString(string));
	}

}
