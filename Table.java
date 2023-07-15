//Sachin Yelange
import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		int i, num, ans;
		Scanner sc = new Scanner(System.in);//Initializing variable
		
		System.out.println("Enter the number you want on the table: ");
		num = sc.nextInt();
		
		for(i=1; i<=10; i++) {//Print the table from for loop
			ans = num*i;
			System.out.println(num+"*"+i +" = "+ ans);
		}
	}
}