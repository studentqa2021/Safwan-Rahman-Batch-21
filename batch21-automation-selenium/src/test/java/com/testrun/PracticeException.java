package com.testrun;

public class PracticeException 
{
	
	static String name = "saf";
	public static void main(String[] args)
	{
		System.out.println(name);
		System.out.println(name + " SmartTech");//math 
		try {
		System.out.println(name.concat(" SmartTech"));/*concat() -> Join two strings ->  
			To make this work the variable you are connecting this to must have a value set to it 
			-> stop */
			}catch(Exception e) {//e.printStackTrace();}
		try {
		Thread.sleep(2000);
			}catch(InterruptedException a) {}//There is an exception here and so code will stop here right after.
											 //Payment won't work anymore 
		
		System.out.println("Payment Method");// This will never happen because it stops before on line 11
		}
	
	/* Error = compilation error -> update my code -> works 
	 * Exception for concat() = NullPointerException
	 *Before Run -> No issues; can't see what exception needed for it to run
	 *After Run -> Exception shows up in console (handle -> try catch)
	 *
	 *Exception for Thread.sleep = InterruptedException(Run time exception)
	 *Before run-> you can see the exception needed(Compile time exception); will stop before the run and won't move forward
	 *-> Code stops there(handle -> Throws or try catch)
	*/
	}
}
