package com.Kiran.Assignment5;

public class Main {
	 public static void main(String[] args) {
	        BankAccount account = new BankAccount(12345, 500);
	        account.displayBalance();
	        try {
	            account.deposit(200);  
	            account.deposit(10000);
	            account.deposit(-50);  
	        } 
	        catch (InvalidAmountException e)
	        {
	            System.out.println("Error: " + e.getMessage());
	        } 
	        finally 
	        {
	            System.out.println("Deposit operation completed.");
	        }
	        try {
	            account.withdraw(100); 
	            account.withdraw(700);  
	        } catch (InvalidAmountException | InsufficientFundsException e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            System.out.println("Withdrawal operation completed.");
	        }
	        account.displayBalance();
	    }
	}


