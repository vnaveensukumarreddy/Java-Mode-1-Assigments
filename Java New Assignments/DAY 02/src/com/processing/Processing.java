package com.processing;

public class Processing {

	public static int smallestNumber(int firstNumber,int secondNumber,int thirdNumber)
	{
		int small=0;
		if(firstNumber<secondNumber) {
			if(firstNumber<thirdNumber)
			{
				small=firstNumber;
			}
			else
			{
				small=thirdNumber;
			}
		}
		else 
		{
			if(secondNumber<thirdNumber)
			{
				small=secondNumber;
			}
			else
			{
				small=thirdNumber;
			}
		}
		return small;
	}
	
	public static void middle(String str)
	{
		
		int length=str.length();
		int index=length/2;
		if(length%2==0)
		{
			
			System.out.println((char)str.charAt(index)+(char)str.charAt(index+1));
		}
		else
		{
			System.out.println(str.charAt(index));
		}
		
		
	}
	public static int noOfVowels(String string)
	{
		int number=0;
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)=='A' ||string.charAt(i)=='E' ||string.charAt(i)=='I' ||string.charAt(i)=='O' ||string.charAt(i)=='U' ||string.charAt(i)=='a' ||string.charAt(i)=='e' ||string.charAt(i)=='i' ||string.charAt(i)=='o'||string.charAt(i)=='u'   )
			{
				number++;
			}
		}
		return number;
	}
	
}
