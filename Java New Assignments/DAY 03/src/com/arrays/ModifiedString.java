package com.arrays;

public class ModifiedString {

	public static String getString(String string)
	{
		String resultString=" ";
		if(string.charAt(0)=='k' && string.charAt(1)=='b')
        {
			resultString="k"+"b"+string.substring(2);
		}
		else if(string.charAt(0)=='k')
		{
			resultString="k"+string.substring(2);
		}
		else if(string.charAt(1)=='b')
		{
			resultString="b"+string.substring(2);
		}
		else
		{
			resultString=string.substring(2);
		}
		return resultString;
	}
}
