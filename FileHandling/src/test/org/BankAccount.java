package test.org;

abstract class BankAccount {
	abstract void deposite(double amount);
	abstract void withdraw(double amount);
	abstract void applyIntrest();
}
class SavingAccount extends BankAccount
{
	private String accountNumber;
	private double balance;
	 
	SavingAccount(){
		
	}
	
	SavingAccount(String accountNumber, double balance)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public void deposite(double amount) {
		if(amount<=0)
		{
			System.out.println("Invalid deposite amount");
		}
		else {
			balance=balance+amount;
			System.out.println("Amount deposited successfully ");
			System.out.println("\n***********************************************\n");
			System.out.println("Account no \t balance");
			System.out.println(accountNumber+"\t\t"+balance);
		}
			
	}


	public void withdraw(double amount) {
		if(amount>=0 && amount>balance)
		{
			System.out.println("Invalid withdrawal amount");
		}
		else {
			balance=balance-amount;
			System.out.println("Withdraw Succesfull");
			System.out.println("\n***********************************************\n");
			System.out.println("Account no \t balance");
			System.out.println(accountNumber+"\t\t"+balance);
		}
			
	}
	
	public void applyIntrest()
	{
		if(balance == 0) 
		{
			System.out.println("\nInsufficent Balance\n");
		}
		else {
			double intrest=(balance*10)/100;
			balance+=intrest;
			System.out.println("Total Bank Balance:  ");
			System.out.println("\n***********************************************\n");
			System.out.println("Account no \t balance");
			System.out.println(accountNumber+" \t\t "+balance);
		}
	}
	}