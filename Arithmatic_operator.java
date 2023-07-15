import java.util.Scanner;
//Akshay Goswami

public class Arithmatic_operator {

	public static void main(String[] args) {

		int a,b;
		double res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a :");
		a=sc.nextInt();
		System.out.println("Enter the value of b :");
		b=sc.nextInt();
		res=a+b;
		System.out.println("The Addition is : " + res);
		res=a-b;
		System.out.println("The Subtraction is : " + res);
		res=a*b;
		System.out.println("The Multiplication is : " + res);
		res=a/b;
		System.out.println("The Division is : " + res);
		res=a%b;
		System.out.println("The Modulo is : " + res);

	}

}
