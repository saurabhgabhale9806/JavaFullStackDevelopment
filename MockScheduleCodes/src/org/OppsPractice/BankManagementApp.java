/*Q18. Bank Abstract Class
Problem: Create an abstract class Bank with the following methods:
deposit(double amount) — allows depositing an amount.
withdraw(double amount) — allows withdrawing an amount.
getBalance() — returns the current balance.
Then, create two subclasses:
SavingsBank — charges a fixed fee of $2 per transaction.
CurrentBank — charges a fixed fee of $5 per transaction.
Write a program that deposits and withdraws money from both types of banks and displays the balance after each transaction.
Explanation:
The abstract class Bank defines the common structure for the deposit, withdraw, and balance methods.
Each subclass applies a different transaction fee.
Logical operation: Use method overriding to show different transaction fees for each type of bank.
*/
package org.OppsPractice;

import java.util.*;

abstract class Bank {
    protected double balance;

    public Bank(double initialBalance) {
        this.balance = initialBalance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingBank extends Bank {
    private final double fee = 2.0;

    public SavingBank(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > fee) {
            balance += (amount - fee);
            System.out.println("Deposited to SavingBank: $" + amount + ", Fee: $" + fee);
        } else {
            System.out.println("Deposit amount too small to cover fee in SavingBank.");
        }
        System.out.println("Current Balance: $" + balance);
    }

    @Override
    public void withdraw(double amount) {
        if ((amount + fee) <= balance) {
            balance -= (amount + fee);
            System.out.println("Withdrawn from SavingBank: $" + amount + ", Fee: $" + fee);
        } else {
            System.out.println("Insufficient funds in SavingBank.");
        }
        System.out.println("Current Balance: $" + balance);
    }
}

class CurrentBank extends Bank {
    private final double fee = 5.0;

    public CurrentBank(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > fee) {
            balance += (amount - fee);
            System.out.println("Deposited to CurrentBank: $" + amount + ", Fee: $" + fee);
        } else {
            System.out.println("Deposit amount too small to cover fee in CurrentBank.");
        }
        System.out.println("Current Balance: $" + balance);
    }

    @Override
    public void withdraw(double amount) {
        if ((amount + fee) <= balance) {
            balance -= (amount + fee);
            System.out.println("Withdrawn from CurrentBank: $" + amount + ", Fee: $" + fee);
        } else {
            System.out.println("Insufficient funds in CurrentBank.");
        }
        System.out.println("Current Balance: $" + balance);
    }
}

public class BankManagementApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank saving = new SavingBank(100);
        Bank current = new CurrentBank(100);

        System.out.println("----SavingBank Transactions----");
        saving.deposit(50);
        saving.withdraw(30);
        

        System.out.println("\n----CurrentBank Transactions----");
        current.deposit(50);
        current.withdraw(30);
    }
}
