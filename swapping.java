package inheritance;
public class swapping extends initial_parent
{
	public void swapNumbers()
	{
		System.out.println("Program for Swapping");
		swap_value();		//Calling the function for user input from the Parent class for swapping
		System.out.println("Swapping Without the third variable");			
		System.out.println("Before Swapping: num1="+num1+",num2="+num2);
		process();		//calling the function for swapping without using third variable
		System.out.println("After Swapping: num1="+num1+",num2="+num2);
		System.out.println("Swapping With the third variable");
		System.out.println("Before Swap");
        	System.out.println("Num1 ="+num1);
        	System.out.println("Num2 ="+num2);
        	System.out.println("After swap");
        	swap();			//calling the function for swapping with using third variable
        	System.out.println("Num1 ="+num1);
        	System.out.println("Num2 ="+num2);
		
	}
	public void process()		//Without using third variable
	{
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;	
	}
	public void swap() 		//with using third variable
	{
		temp = num1;
        	num1 = num2;
        	num2 = temp;
	}
	
}