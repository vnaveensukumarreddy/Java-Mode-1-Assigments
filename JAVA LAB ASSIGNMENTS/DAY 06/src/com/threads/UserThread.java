package com.threads;


import java.time.LocalTime;

public class UserThread extends Thread {

	
	public void run()
	{
		
		for(int i=0;i<2;i++)
		{
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {        // 2 Unhandled exception type InterruptedException when we do not surround the sleep with try catch 
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}
