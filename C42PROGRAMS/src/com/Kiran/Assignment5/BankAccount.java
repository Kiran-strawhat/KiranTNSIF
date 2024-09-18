package com.Kiran.Assignment5;
public class BankAccount {
	private int accountNumber; 
	private double balance;
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance can't be negative. Setting balance to 0");
            this.balance = 0;
        }
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid deposit amount.Amount must be greater than zero");
        }
        balance += amount;
        System.out.println("Deposit successful! New balance: $" + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException,InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid withdrawal amount. Amount must be greater than zero");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Available balance: $" + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: $" + balance);
    }
  
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Current Balance: $" + balance);
    }

}
