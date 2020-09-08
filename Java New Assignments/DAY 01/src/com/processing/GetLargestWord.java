package com.processing;

public class GetLargestWord {

 public static String getLargestWord(String string)
 {
	 String str[]=string.split(" ");
	 int max=0;
	 String resultString=" ";
	 for(int i=0;i<str.length;i++)
	 {
		 if(str[i].length()>max)
		 {
			 max=str[i].length();
			 resultString=str[i];
		 }
	 }
	return resultString;
	 
 }
}
