package com.main;

import java.util.Scanner;

import com.abstractimpl.MembershipCard;
import com.abstractimpl.PaybackCard;

public class CardApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1 for Payback Card");
		System.out.println("Enter 2 for Membership Card");
		int choice=scanner.nextInt();
		scanner.nextLine();
		if(choice==1)
		{
			System.out.println("Enter the details");
			System.out.println("String holderName|String cardNumber|String expiryDate|int pointsEarned|double totalAmount");
			String data=scanner.nextLine();
			String[] entries=data.split("\\|");
			int pointsEarned =Integer.parseInt(entries[3]);
			
			double totalAmount=Double.parseDouble(entries[4]);
			PaybackCard paybackCard=new PaybackCard(entries[0], entries[1], entries[2], pointsEarned, totalAmount);
			System.out.println("PaybackCard details");
			System.out.println(paybackCard);
		}
		else if(choice==2)
		{
			System.out.println("Enter the details");
			System.out.println("String holderName|String cardNumber|String expiryDate|int rating");
			String data=scanner.nextLine();
			String[] entries=data.split("\\|");
			System.out.println(entries.length);
			int rating =Integer.parseInt(entries[3]);
			MembershipCard membershipCard=new MembershipCard(entries[0], entries[1], entries[2], rating);
			
		System.out.println("MembershipCard details");
		System.out.println(membershipCard);
		}
		else
		{
			System.out.println("Bad choice ");
		}
	}

}
