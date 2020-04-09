public class CheckingAccount extends Account implements InterestBaseRate {
	String debitCardNumber;
	String debitCardPin;

	CheckingAccount(String name, String sSN, double initialDeposit) {
		super(name, sSN, "Checking", initialDeposit);
		setDebitCard();
		setInterestRate();
		compound();
	}

	// set debit card 
	void setDebitCard() {
		debitCardNumber = String.format("%.0f", (Math.random() * Math.pow(10, 12)));
		debitCardPin = String.format("%04d", (int)(Math.random() * Math.pow(10, 4)));
	}

	// set interest rate
	void setInterestRate() {
		interestRate = getBaseRate() * .15;
	}
}