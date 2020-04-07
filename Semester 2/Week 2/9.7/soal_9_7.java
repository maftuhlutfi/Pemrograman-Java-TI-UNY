import java.util.*;

/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

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

public class soal_9_7 {
	public static void main(String[] args) {
		Account akun = new Account(1122, 20000);
		akun.setAnnualInterestRate(4.5);
		akun.withdraw(2500);
		akun.deposit(3000);
		System.out.println("-------------");
		System.out.println("YOUR ACCOUNT");
		System.out.println("-------------");
		System.out.printf("Balance: $%.2f%n", akun.getBalance());
		System.out.printf("Monthly interest: %.2f%n", akun.getMonthlyInterest());
		System.out.printf("Date created: %s", akun.getDateCreated());
	}
}

/*

======
OUTPUT
======
-------------
YOUR ACCOUNT
-------------
Balance: $20500.00
Monthly interest: 76.88
Date created: Fri Feb 07 14:49:36 ICT 2020

*/