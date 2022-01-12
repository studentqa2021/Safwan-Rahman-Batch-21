package com.testrun;

public class JavaCollectionPractice
{
	public void getDuplicate(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = (i + 1); j < array.length; j++)
			{
				if(array[i] == array[j])
				{
					System.out.println("The duplicate value is: " + array[j]);
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int [] array = {4,4,5,5,6,7};
		
		JavaCollectionPractice obj = new JavaCollectionPractice();
		obj.getDuplicate(array);
	}
}
	
	
