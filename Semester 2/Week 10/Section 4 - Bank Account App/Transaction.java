import java.util.*;

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

	public String toString() {
		return String.format("%s | type: %s | amount: %.2f | balance: %.2f | description: %s%n",
				date.toString(), type, amount, balance, description);
	}
}