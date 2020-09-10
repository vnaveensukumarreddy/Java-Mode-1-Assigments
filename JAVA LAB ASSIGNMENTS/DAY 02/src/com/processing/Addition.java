package com.processing;

public class Addition {

	public static void add(int[] arrayNumbers)
	{
	   int sum=0;
		for(int i=0;i<arrayNumbers.length;i++)
		{
			sum=sum+arrayNumbers[i];
			if(i>0)
			{
				for(int j=0;j<=i;j++)
			{
				
				
				if(j==((i+1)-1))
				{
					System.out.print(arrayNumbers[j]);
					break;
				}	
				System.out.print(arrayNumbers[j]+"+");
				
			}
			
		 System.out.print(" = "+sum);
		 
	
		 System.out.println();
			}
		}
	}
}
