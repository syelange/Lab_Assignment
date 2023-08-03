package interface1;
//Abstract class BankAccount
public abstract class BankAccount {
	protected String accountNumber;
	protected double balance;
	
	//Constructor 
	public BankAccount(String accountNumber, double balance) {
	this.accountNumber = accountNumber;
	this.balance = balance;	
	}
	
	//Abstract methods
	public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

	public String getAccountNumber() {
		return accountNumber;
	}
}


