/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

import java.util.*;

class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date(System.currentTimeMillis());

	// Constructor
	Account() {

	}

	Account(int id, int balance) {
		this.id = id;
		this.balance = balance;
	}

	// Accessor method
	int getId() {
		return id;
	}

	double getBalance() {
		return balance;
	}

	double getAnnualInterestRate() {
		return annualInterestRate;
	}

	Date getDateCreated() {
		return dateCreated;
	}

	// Mutator method
	void setId(int id) {
		this.id = id;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;
	}

	double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	void withdraw(double total) {
		balance -= total;
	}  

	void deposit(double total) {
		balance += total;
	}
}

class CheckingAccount extends Account {
	// Constructor
	CheckingAccount() {
		super();
	}

	CheckingAccount(int id, int balance) {
		super.setId(id);
		super.setBalance(balance);
	}

	void withdraw(double total) {
		double balance = super.getBalance();
		super.setBalance(balance -= total);
		System.out.println("Success withdraw " + total);
	}
}

class SavingAccount extends Account {
	// Constructor
	SavingAccount() {
		super();
	}

	SavingAccount(int id, int balance) {
		super.setId(id);
		super.setBalance(balance);
	}

	void withdraw(double total) {
		double balance = super.getBalance();
		if (total <= balance) {
			super.setBalance(balance -= total);
			System.out.println("Success withdraw " + total);
		}
		else {
			System.out.println("Your balance is insufficient.");
		}
	}
}

public class soal_11_3 {
	public static void main(String[] args) {
		CheckingAccount checkAccount = new CheckingAccount(1, 100);
		SavingAccount saveAccount = new SavingAccount(1, 100);
		checkAccount.withdraw(120);
		System.out.println("Your Balance: " + checkAccount.getBalance()); 
		saveAccount.withdraw(120);
		System.out.println("Your Balance: " + saveAccount.getBalance()); 
	}
}

/*
======
OUTPUT
======
Success withdraw 120.0
Your Balance: -20.0
Your balance is insufficient.
Your Balance: 100.0
*/