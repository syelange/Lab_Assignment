package interface1;

public class CheckingAccount extends BankAccount
{
	public CheckingAccount(String accountNumber,double balance) {
        super(accountNumber,balance);
    }
	
    @Override
    public void deposit(double amount) 
    {
        balance+=amount;
        System.out.println("Deposited "+amount+". New balance: "+balance);
    }
    
    @Override
    public void withdraw(double amount) 
    {
        if (amount<=balance)
        {
            balance-=amount;
            System.out.println("Withdrew "+amount+". New balance: "+balance);
        } 
        else
        {
            System.out.println("Insufficient funds. Withdrawal cancelled.");
        }
    }
}