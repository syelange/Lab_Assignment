import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num,fact;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		num=sc.nextInt();
		fact=1;
		while(num>=1) {
			fact=fact*num;
			num--;
			
		}
		System.out.println("The factorial is: " + fact);
		}

}