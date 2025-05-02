/*Q19. Customer Abstract Class
Problem: Create an abstract class Customer with the following methods:
·        addTransaction(double amount) — adds a transaction amount.
·    	getBalance() — returns the current balance.
Then, create two subclasses:
·        PremiumCustomer — offers a 10% discount on all transactions.
·        RegularCustomer — no discount on transactions.
Write a program that adds transactions for both types of customers and shows their final balance after applying the discount.
Explanation:
·    	The abstract class Customer provides methods for adding transactions and checking balances.
·    	Each subclass implements the transaction logic differently by applying a discount.
·    	Logical operation: Method overriding to apply discounts and track customer balances.
*/
package org.OppsPractice;
import java.util.*;
abstract class CustomerApp {
	double balance = 0.0; 
	
	abstract void addTransaction(double amount);
	
	double getBalance() {
		return balance;
	} 
}
class PremiumCustomer extends CustomerApp{

	@Override
	void addTransaction(double amount) {
		// TODO Auto-generated method stub
		double disAmount = amount * 0.9;
		balance = balance + disAmount;
		
	}
	
}
class RegularCustomer extends CustomerApp{

	@Override
	void addTransaction(double amount) {
		// TODO Auto-generated method stub
		balance = balance + amount;
	}
	
}
public class CustomerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CustomerApp premium = new PremiumCustomer();
		CustomerApp regular = new RegularCustomer();
		
		premium.addTransaction(100);
		premium.addTransaction(200);
		
		regular.addTransaction(100);
		regular.addTransaction(200);
		
		System.out.println("Premium Customer Balance: $"+premium.getBalance());
		System.out.println("Regular Customer BalanceL: $"+regular.getBalance());
	}

}
