package com.main;

import java.util.Scanner;

import com.processing.ClassRoom;

public class ClassRoomApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the roomNo");
		int roomNo=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the roomType");
		String roomType=scanner.nextLine();
		
		System.out.println("Enter the roomSize ");
		int roomSize=scanner.nextInt();
		System.out.println("Is ac in the class room");
		boolean acMachine=scanner.nextBoolean();
		ClassRoom classRoom=new ClassRoom();
		classRoom.setData(roomNo, roomType, roomSize, acMachine);
		classRoom.display();
		
	}

}
