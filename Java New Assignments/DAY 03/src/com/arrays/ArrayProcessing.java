package com.arrays;

public class ArrayProcessing {

	
	public int[] ascendingOrder(int[] array)
	{
		
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]>array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}

public int search(int[] array,int number)
{
	int index=0;
	for (int i = 0; i < array.length; i++) {
		if(array[i]==number)
		{
			index=i;
			break;
		}
	}
	return index;
	
}
}