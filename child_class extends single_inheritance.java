package inheritance;
import java.util.*;
public class child_class extends single_inheritance 
{
	int num1,num2;
	int [] result;
	public static void main(String[] args) 
	{
		child_class obj1=new child_class();
		obj1.process();
		
	}
	public void process()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		num1=sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		num2=sc.nextInt();
		System.out.println("Before Swapping: num1="+num1+",num2="+num2);
		result=swapNumbers(num1,num2);
		System.out.println("After Swapping: num1="+result[0]+",num2="+result[1]);
	}
}