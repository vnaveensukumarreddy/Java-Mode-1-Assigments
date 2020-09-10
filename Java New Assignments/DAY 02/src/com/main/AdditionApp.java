package com.main;

import java.util.Scanner;

import com.processing.Addition;

public class AdditionApp {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of an array");
	
		int n=scanner.nextInt();
		int[] arrayNumbers=new int[n];
		System.out.println("Enter array values");
		for(int i=0;i<n;i++)
		{
			arrayNumbers[i]=scanner.nextInt();
		}
		Addition.add(arrayNumbers);

	}

}
