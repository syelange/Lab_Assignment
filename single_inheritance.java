package inheritance;
public class single_inheritance 
{
	public int[] swapNumbers(int a,int b)
	{
		a = a + b;
		b = a - b;
		a = a - b;
		return new int[]{a, b};			//Returning the value of a and b after swapping
	}
}