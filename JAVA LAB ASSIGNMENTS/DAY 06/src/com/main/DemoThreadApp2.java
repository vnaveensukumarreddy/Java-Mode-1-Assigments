package com.main;

import com.threads.DemoThread2;


public class DemoThreadApp2 {

	public static void main(String[] args) {
		
		Thread thread1 =new Thread(new DemoThread2());  
		Thread thread2 = new Thread(new DemoThread2());
		Thread thread3 = new Thread(new DemoThread2());
		thread1.start();
		thread2.start();
		thread3.start();
		thread1.setName("Naveen");
		thread2.setName("sukumar");
		thread3.setName("reddy");
	}

}
