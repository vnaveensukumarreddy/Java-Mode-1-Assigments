package com.main;

import java.util.Scanner;

import com.processing.GetLargestWord;

public class GetLargestWordApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the sentence");
		
		String string=scanner.nextLine();
		System.out.println(GetLargestWord.getLargestWord(string));
	}

}
