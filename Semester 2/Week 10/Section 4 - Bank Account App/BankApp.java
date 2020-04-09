import java.util.*;
import java.io.*;

public class BankApp {
	public static void main(String[] args) {
		ArrayList<Account> accounts = new ArrayList<>();
		ArrayList<String[]> accountHolders = new ArrayList<>();
		
		try {
			Scanner scanCSV = new Scanner(new File("accounts.csv"));
			while(scanCSV.hasNextLine()) {
				String csvLine = scanCSV.nextLine();
				String[] account = csvLine.split(",");
				accountHolders.add(account);
			}
		} 

		catch (FileNotFoundException e) {
			System.out.print("Can't find the file.");
			System.exit(-1);
		}

		for (String[] accountHolder : accountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initialDeposit = Double.parseDouble(accountHolder[3]);
			if (accountType.equals("Checking")) {
				accounts.add(new CheckingAccount(name, sSN, initialDeposit));
			} else {
				accounts.add(new SavingsAccount(name, sSN, initialDeposit));
			}
			
		}

		// For Testing
		accounts.get(0).transfer(accounts.get(1), 200);
		accounts.get(0).deposit(2000);
		accounts.get(0).withdraw(123000);
		accounts.get(0).withdraw(1000);
		accounts.get(0).showInfo();		

		/*for (int i = 0;i < accounts.size();i++) {
			accounts.get(i).showInfo();
			System.out.println("\n" + accounts.get(i).accountNumber);
			if (accounts.get(i) instanceof CheckingAccount) {
				System.out.print("\n" + ((CheckingAccount)accounts.get(i)).debitCardNumber + "\n" + ((CheckingAccount)accounts.get(i)).debitCardPin);
			}

			if (accounts.get(i) instanceof SavingsAccount) {
				System.out.print("\n" + ((SavingsAccount)accounts.get(i)).safetyDepositId + "\n" + ((SavingsAccount)accounts.get(i)).safetyDepositKey);
			}
		}*/
	}
}