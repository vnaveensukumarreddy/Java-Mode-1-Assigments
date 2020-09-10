package com.processing;

public class SumOfSquaresOfEvenDigits {

	public static int sumOfSquaresOfEvenDigits(int number)
	{
		int sum=0;
		while(number>0)
		{
			int n=number%10;
			if(n%2==0)
			{
			sum=sum+(n*n);
			}
			number=number/10;
		}
		return sum;
		
	}
}
