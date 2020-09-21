package com.main;
import com.threads.Number;
public class NumberApp {

	public static void main(String[] args) {
		
		Thread thread1=new Thread(new Number(2));
		Thread thread2=new Thread(new Number(5));
		Thread thread3=new Thread(new Number(8));
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread2.start();
		thread3.start();
		

	}

}
