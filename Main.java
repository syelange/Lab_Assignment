package Branch;
import java.util.Scanner;
public class Main extends Bank_Account{
	int choice,newpin;
	char ans;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Main obj=new Main();
		obj.ac();
	}
	public void ac()
	{
		System.out.println("Enter Bank Name: ");
		Bank_name=sc.next();
		System.out.println("Enter Branch Name: ");
		branch_name=sc.next();
		System.out.println("Enter Name: ");
		user_name=sc.next();
		System.out.println("Enter Account Number: ");
		setAc_no(sc.nextInt());
		System.out.println("Enter Pin No: ");
		newpin=sc.nextInt();
		if(newpin==getPin())
		{
			user_choice();
		}
		else
		{
			System.out.println("Invalid Pin.");
		}
	}
	public void transaction()
	{
		System.out.println("Enter Amount: ");
		amount=sc.nextInt();
		int bal=getBal();
		
		if(choice==2)
		{
			bal+=amount;
		}	
		else
		{
			bal-=amount;
		}
		setBal(bal);
	}
	public void loan() 
	{
		System.out.print("Enter Loan Amount: ");
		double loanAmount=sc.nextDouble();
		System.out.print("Enter Annual Interest Rate(%): ");
		double annualInterestRate=sc.nextDouble();
		System.out.print("Enter Loan Duration (in years): ");
		int loanDurationYears=sc.nextInt();
		int numberOfMonths=loanDurationYears*12;
		double monthlyInterestRate=annualInterestRate/(12*100);
		double monthlyPayment=calculateMonthlyPayment(loanAmount,monthlyInterestRate,numberOfMonths);
		double totalInterest=calculateTotalInterest(monthlyPayment,numberOfMonths,loanAmount);
		System.out.println("Monthly Payment: "+monthlyPayment);
		System.out.println("Total Interest: "+totalInterest);
	}
	public static double calculateMonthlyPayment(double loanAmount,double monthlyInterestRate,int numberOfMonths) 
	{
		return (loanAmount*monthlyInterestRate)/(1-Math.pow(1+monthlyInterestRate,-numberOfMonths));
	}
	public static double calculateTotalInterest(double monthlyPayment,int numberOfMonths,double loanAmount) 
	{
		return (monthlyPayment*numberOfMonths)-loanAmount;
	}
	public void user_choice()
	{
		do																			//options for performing various tasks
		{
			System.out.println("1:Check Balance\n2:Deposit\n3:Withdraw\n4.Loan");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Hello "+user_name+"\nYour account balance is ="+getBal());
					break;
				case 2: 
					transaction();
					System.out.println("Hello "+user_name+"\nYour account balance is ="+getBal());
					break;
				case 3:
					transaction();
					System.out.println("Hello "+user_name+"\nYour account balance is ="+getBal());
					break;
				case 4:
					loan();
					break;
				default:
					System.out.println("Invalid choice");
					break;
			}
			System.out.println("Do you want to continue (yes/no): ");
			ans=sc.next().charAt(0);
		}
		while(ans=='y');
	}

}