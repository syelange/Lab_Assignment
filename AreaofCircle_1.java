import java.util.Scanner;
//Sachin Yelange
public class AreaofCircle_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		double r= sc.nextDouble();
		double pi=3.14;
		double area=(22*r*r)/7;
		double coc= 2*(pi*r);
		System.out.println("Area of Circle is: " + area);
		System.out.println("Circumference of Circle:"+ coc);
	}

}
