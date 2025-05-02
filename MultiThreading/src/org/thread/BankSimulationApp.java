/*Question1: 
Bank Account System with Multithreading
Scenario Overview: We have a bank account class where multiple threads are trying to access and modify
 the balance by performing deposit and  withdrawal operations. We need to ensure thread safety when these 
 operations are happening concurrently.

Program Steps:
Create a BankAccount Class: 
This class will have methods for deposit and withdrawal. We'll make these methods synchronized to avoid 
race conditions.
Create a Task Class: 
  This class will represent the deposit/withdrawal operation. It will implement the Runnable interface.

Run the Application: 
         We'll create multiple threads to simulate concurrent deposits and withdrawals on the same bank account.
Explanation:
BankAccount Class:
This class maintains a balance and provides synchronized methods of deposit and withdrawal to ensure that 
only one thread can modify the balance at a time, preventing race conditions.
The getBalance method is synchronized as well to ensure that the balance is accessed in a thread-safe manner.
BankTask Class:
This class implements the Runnable interface and represents a task that can either deposit or withdraw money
 from the bank account.
The constructor takes in the bank account a flag indicating whether it's a deposit or withdrawal, and the amount
 to be deposited or withdrawn.
BankSimulation Class (Main):
In this class, we create a BankAccount with an initial balance of 1000.
We then create and start multiple threads that will perform deposit or withdrawal operations concurrently.
We use join to make sure the main thread waits for all other threads to finish before printing the final balance.

Key Concepts you have to use in above application
Synchronization: The deposit and withdrawal methods are synchronized to ensure that only one thread can
access these methods at any time. This prevents issues like inconsistent or incorrect balances.
Multithreading: The example demonstrates how to create multiple threads that perform concurrent operations 
on the same resource (bank account).
Thread Safety: The program ensures that even though multiple threads are accessing and modifying the bank account,
 the balance remains consistent and free of race conditions.
*/
package org.thread;
import java.util.*;

class BankAccount {
	private int balance;
	public BankAccount(int balance) {
		this.balance = balance;
	}
	public synchronized void deposit(int amount) {
		balance = balance + amount;
		System.out.println(Thread.currentThread().getName()+"deposited"+amount+", Balance : "+balance);
	}
	public synchronized void withdraw(int amount) {
		if(amount <= balance) {
			balance = balance - amount;
			System.out.println(Thread.currentThread().getName()+ " withdraw "+ amount + " Balance: "+balance);
		}
		else {
			System.out.println(Thread.currentThread().getName()+  "Insufficient fund amount: " + amount +  "for  Balance: "+balance);
		}
	}
	public synchronized int getBalance() {
		return balance;
	}
}
class BankTask implements Runnable{
	private BankAccount account;
	private boolean isDeposit;
	private int amount;
	
	public BankTask( BankAccount account,boolean isDeposit,int amount) {
		this.account = account;
		this.isDeposit = isDeposit;
		this.amount = amount;
	}
	public void run() {
		if(isDeposit) {
			account.deposit(amount);
		}
		else {
			account.withdraw(amount);
		}
	}
}
public class BankSimulationApp {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		BankAccount bank =  new BankAccount(1000);
		Thread t1 =  new Thread(new BankTask(bank, true, 500),"Thraed 1");
		Thread t2 =  new Thread(new BankTask(bank, false, 200),"Thraed 2");
		Thread t3 =  new Thread(new BankTask(bank, true, 300),"Thraed 3");
		Thread t4 =  new Thread(new BankTask(bank, false, 1000),"Thraed 4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		
		System.out.println("Final Balance: "+ bank.getBalance());
	}

}
