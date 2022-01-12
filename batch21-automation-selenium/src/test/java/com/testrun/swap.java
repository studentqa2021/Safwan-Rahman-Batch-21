package com.testrun;

public class swap {

	
	public void getSwap(int a, int b)
	{
		System.out.println("Before the swap A is: " + a + " and B is: " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After the swap A is: " + a + " and B is: " + b);
	}
	
	public static void main(String[] args)
	{
		swap obj = new swap();
		
		obj.getSwap(10, 20);
		
	}
}
