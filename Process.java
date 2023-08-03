package interface1;
public class Process 
{
	public static void main(String[] args) 
	{
        String accountNumber="12345";
        double initialBalance=1000.0;
        CheckingAccount c=new CheckingAccount(accountNumber,initialBalance);
        c.deposit(500.0);
        c.withdraw(200.0);
        c.withdraw(1500.0);
    }
}