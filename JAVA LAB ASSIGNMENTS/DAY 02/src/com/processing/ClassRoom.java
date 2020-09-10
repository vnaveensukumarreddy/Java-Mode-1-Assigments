package com.processing;

public class ClassRoom {

  private int roomNo;
  private String roomType;
  private int roomSize;
  private boolean acMachine;
  
  public void setData(int roomNo,String roomType,int roomSize,boolean acMachine)
  {
	  this.roomNo=roomNo;
	  this.roomType=roomType;
	  this.roomSize=roomSize;
	  this.acMachine=acMachine;
  }
  public void display()
  {
	  System.out.println("roomNo"+roomNo);
	  System.out.println("roomType"+roomType);
	  System.out.println("roomSize"+roomSize);
	  System.out.println("acMachine"+acMachine);
	  
  }
}
