package com.threads;

public class Number implements Runnable {

	int multiple;
	public Number(int multiple)
	{
		this.multiple=multiple;
	}
@Override
public void run() {
	
	for(int i=1;i<=10;i++)
	{
		System.out.println(multiple +" * "+i+" :" +multiple*i);
	}
	
}

}
