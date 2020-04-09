import java.util.*;

public class Account {
	String name;
	String sSN;
	String accountNumber;
	String accountType = " ";
	double balance;
	double interestRate;
	static int totalCheckingAccount = 0;
	static int totalSavingAccount = 0;
	ArrayList<Transaction> transactions = new ArrayList<>();
	Scanner input = new Scanner(System.in);

	// Constructor
	Account(String name, String sSN, String accountType, double initialDeposit) {
		this.name = name;
		this.sSN = sSN;
		this.accountType = accountType;
		balance = initialDeposit;
		accountNumber = generateAccountNumber(sSN, accountType);
	}

	// Generate 11-digit account number 
	static String generateAccountNumber(String sSN, String accountType) {
		// account type + lastTwoDigit of sSN +  5 digit uniqueID + random 3 digit
		String accountID = accountType.equals("Savings") ? "1" : "2";
		String lastTwoDigit = sSN.substring(sSN.length() - 2);
		String uniqueID = accountType.equals("Savings") ? String.format("%05d", totalSavingAccount++) : String.format("%05d", totalCheckingAccount++);
		String rand3digit = String.format("%03d", (int)(Math.random() * 1000));
		return accountID + lastTwoDigit + uniqueID + rand3digit;
	}

	// Compound method
	void compound() {
		balance += balance * (interestRate / 100);
	}

	// Transactions method
	void deposit(double amount) {
		balance += amount;
		System.out.printf("Successfully deposit $%.2f", amount);
		printBalance();
		transactions.add(new Transaction('D', amount, balance, "deposit"));
	}

	void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Your amount exceeds the balance");
		} else {
			balance -= amount;
			System.out.printf("Successfully withdraw $%.2f", amount);
			printBalance();
			transactions.add(new Transaction('W', amount, balance, "withdraw"));
		}
	}

	void transfer(Account accountDest, double amount) {
		System.out.printf("Transfer to %s? (Y/N) ", accountDest.name);
		if (input.next().equalsIgnoreCase("y")) {
			balance -= amount;
			accountDest.balance += amount;
			System.out.printf("Successfully transfer $%.2f to %s", amount, accountDest.name);
			printBalance();
			transactions.add(new Transaction('T', amount, balance, "transfer to " + accountDest.name));
		}
	}

	void printBalance() {
		System.out.printf("\nYour balance is: $%.2f", balance);
	}

	void showInfo() {
		System.out.print(
			"\n+--------------+" +
			"\n| Account Info |" +
			"\n+--------------+" +
			"\nName    : " + name +
			"\nType    : " + accountType +
			"\nRate    : " + interestRate + "%" +
			"\nBalance : $" + balance +
			"\nShow transactions info? (Y/N) "
			);
		if (input.next().equalsIgnoreCase("y")) {
			for (Transaction transaction : transactions) {
				System.out.println(transaction.toString()); 	
			}
		}
	}
}