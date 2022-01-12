package com.testrun;

public class SwapVariable 
{
	public void getSwap (int a, int b)
	{
		System.out.println("The value of A before the swap is: " +a);
		System.out.println("The value of B before the swap is: " +b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("The value of A after the swap is: " +a);
		System.out.println("The value of B after the swap is: " +b);
	}
	
	public static void main(String[] args) 
	{
		SwapVariable obj = new SwapVariable();
		obj.getSwap(10, 20);
	}
}
