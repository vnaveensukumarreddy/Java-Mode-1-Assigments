package com.main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter input String");
		String string=scanner.nextLine();
		
		Set<Character> charSet=new HashSet<Character>();

		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)!=' ')
			{
				charSet.add(string.charAt(i));
			}
		}
		
		if(charSet.size()>=26)
		{
			System.out.println("Pangram");
		}
		else
		{
			System.out.println("Not Pangram");
		}
	}

}
