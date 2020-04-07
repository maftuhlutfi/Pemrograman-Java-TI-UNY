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
		if (total <= balance) {
			balance -= total;
			System.out.println("Success withdraw " + total);
		}
		else {
			System.out.println("Your balance is insufficient.");
		}
	}  

	void deposit(double total) {
		balance += total;
		System.out.println("Success deposit " + total);
	}
}

public class soal_10_7  {
	// Scanner
	static Scanner input = new Scanner(System.in);

	// Akun
	static Account[] akun = new Account[10];

	static {
		// Inisialisi id dan balance
		for (int i = 0;i < 10;i++) {
			akun[i] = new Account(i + 1, 100);
		}
	}

	public static void main(String[] args) {
		System.out.println(" ");

		// User masukkan ID
		int idFromUser = getIDFromUser() - 1;
		
		// Main menu
		mainMenu(idFromUser);
	}

	public static int getIDFromUser() {
		boolean isIDCorrect = false;
		int enterID = 0;
		while (isIDCorrect == false) {
			System.out.print("Enter an ID: ");
			enterID = input.nextInt();
			if (enterID > 0 && enterID <= 10) {
				isIDCorrect = true;
			}
			else {
				System.out.println("Wrong ID, enter the correct one.");
			}
		}
		return enterID;
	}

	// Method main menu
	public static void mainMenu(int id) {
		System.out.println("");
		System.out.println("Main menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
		System.out.print("Enter a choice: ");
		// Panggil method user choice
		int choice = input.nextInt();
		if (choice > 0 && choice <=4) {
			userChoice(id, choice);
		}
		else {
			mainMenu(id);
		}
	}

	// Method user choice
	public static void userChoice(int id, int choice) {
		switch (choice) {
			case 1: 
				System.out.printf("Your balance is: %.1f %n", akun[id].getBalance());
				mainMenu(id);
				break;
			case 2: 
				System.out.print("Enter ammount to withdraw: ");
				akun[id].withdraw(input.nextDouble());
				mainMenu(id);
				break;
			case 3:
				System.out.print("Enter ammount to deposit: ");
				akun[id].deposit(input.nextDouble());
				mainMenu(id);
				break;
			case 4:
				main(new String[0]);
				break;
		}
	}
}

/*
======
OUTPUT
======
Enter an ID: 11
Wrong ID, enter the correct one.
Enter an ID: 2

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 1
Your balance is: 100.0

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 2
Enter ammount to withdraw: 10
Success withdraw 10.0

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 1
Your balance is: 90.0

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 3
Enter ammount to deposit: 7
Success deposit 7.0

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 1
Your balance is: 97.0

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 4

Enter an ID: 5

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 1
Your balance is: 100.0
*/