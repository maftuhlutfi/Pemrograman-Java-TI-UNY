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
	String name;
	ArrayList<Transaction> transactions = new ArrayList<>();

	// Constructor
	Account() {

	}

	Account(int id, int balance) {
		this.id = id;
		this.balance = balance;
	}

	Account(int id, int balance, String name) {
		this.id = id;
		this.balance = balance;
		this.name = name;
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
		transactions.add(new Transaction('W', total, balance, "Withdraw"));
	}  

	void deposit(double total) {
		balance += total;
		transactions.add(new Transaction('D', total, balance, "Deposit"));
	}
}

class Transaction {
	private Date date = new Date();
	private char type;
	private double amount;
	private double balance;
	private String description = "";

	Transaction(char type, double amount, double balance, String description) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}

	void setDate(Date date) {
		this.date = date;
	}

	void setType(char type) {
		this.type = type;
	}

	void setAmount(double amount) {
		this.amount = amount;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	void setDescription(String description) {
		this.description = description;
	}

	Date getDate() {
		return date;		
	}
	char getType() {
		return type;
	}
	double getAmount() {
		return amount;
	}
	double getBalance() {
		return balance;
	}
	String getDescription() {
		return description;
	}

}

public class soal_11_8 {
	public static void main(String[] args) {
		Account akun = new Account(1122, 1000, "George");
		akun.setAnnualInterestRate(1.5);
		akun.deposit(30);
		akun.deposit(40);
		akun.deposit(50);
		akun.withdraw(5);
		akun.withdraw(4);
		akun.withdraw(2);
		System.out.printf("Name: %s %nAnnualInterest: %.2f %nBalance: %.2f %nTransaction: %n", 
			akun.name, akun.getAnnualInterestRate(), akun.getBalance());
		for (Transaction transaction : akun.transactions) {
			System.out.printf("%s | type: %s | amount: %.2f | balance: %.2f | description: %s%n",
				transaction.getDate().toString(), transaction.getType(), transaction.getAmount(), transaction.getBalance(), transaction.getDescription());
		}
	}
}

/*
======
OUTPUT
======
Name: George 
AnnualInterest: 1.50 
Balance: 1109.00 
Transaction: 
Thu Mar 05 23:05:39 ICT 2020 | type: D | amount: 30.00 | balance: 1030.00 | description: Deposit
Thu Mar 05 23:05:39 ICT 2020 | type: D | amount: 40.00 | balance: 1070.00 | description: Deposit
Thu Mar 05 23:05:39 ICT 2020 | type: D | amount: 50.00 | balance: 1120.00 | description: Deposit
Thu Mar 05 23:05:39 ICT 2020 | type: W | amount: 5.00  | balance: 1115.00 | description: Withdraw
Thu Mar 05 23:05:39 ICT 2020 | type: W | amount: 4.00  | balance: 1111.00 | description: Withdraw
Thu Mar 05 23:05:39 ICT 2020 | type: W | amount: 2.00  | balance: 1109.00 | description: Withdraw
*/