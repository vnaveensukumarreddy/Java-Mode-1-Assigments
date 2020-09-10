package com.main;

import java.util.Scanner;

import com.arrays.ArrayProcessing;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayProcessing arrayProcessing = new ArrayProcessing();
		System.out.println("Enter the Size of the Array");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the Elements of the Array");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		System.out.println("1 finding an element 2 sort an array");
		int choice=scanner.nextInt();
		if(choice==1)
		{
			System.out.println("Enter number to search");
			int number=scanner.nextInt();
			int index=arrayProcessing.search(array,number);
			System.out.println(number+" found at "+index);
			
		}
		else if(choice==2)
		{
		int[] resultArray = arrayProcessing.ascendingOrder(array);
		System.out.println("After sorting of an array");
		for (int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i] + "  ");
		}
		
		
		}
		
	}

}
