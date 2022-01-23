package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayPractice 
{
	static int [] myArray = {2,3,4,5};
	// NO>> List obj = new List(); Interface cannot create a new obj because it is incomplete
	//String = variable & Class
	//number = variable = int, wrapper class = integer
	// fraction = variable = double, class = Double
	//condition = boolean, cClass = Boolean
	
	static List<Integer> myList = new ArrayList<>();
	
	public static void main(String[] args) 
	{
		myList.add(2);
		myList.add(3);
		myList.add(4);
		
		System.out.println(Arrays.toString(myArray)); 
		System.out.println(myList);
	}
}
