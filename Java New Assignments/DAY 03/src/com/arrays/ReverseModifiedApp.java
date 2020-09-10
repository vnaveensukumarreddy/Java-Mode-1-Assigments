package com.arrays;

public class ReverseModifiedApp {

	public static String getString(String string,char character)
	{
	   String resultString= "";
	 
	   for(int i=string.length()-1;i>=0;i--)
	   {
		   if(i==0)
		   {
			   resultString=resultString+string.charAt(i);  
			   break;
		   }
		   resultString=resultString+string.charAt(i)+character;
		   
	   }
	return resultString;
	}
	
}
