package com.main;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter input String");
		String string=scanner.nextLine();
		System.out.println("Enter the indexes of a substring in string");
		System.out.println("StartIndex");
		int startIndex=scanner.nextInt();
		System.out.println("EndIndex");
		int endIndex=scanner.nextInt();
       System.out.println(string.substring(startIndex, endIndex));
	}

}
