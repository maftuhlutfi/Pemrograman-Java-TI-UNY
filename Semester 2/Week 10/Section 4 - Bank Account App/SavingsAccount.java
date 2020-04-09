public class SavingsAccount extends Account implements InterestBaseRate {
	String safetyDepositId;
	String safetyDepositKey;

	SavingsAccount(String name, String sSN, double initialDeposit) {
		super(name, sSN, "Savings", initialDeposit);
		setSafetyDepositBox();
		setInterestRate();
		compound();
	}

	// set deposit box 
	void setSafetyDepositBox() {
		safetyDepositId = String.format("%03d", (int)(Math.random() * Math.pow(10, 3)));
		safetyDepositKey = String.format("%04d", (int)(Math.random() * Math.pow(10, 4)));
	}

	// set interest rate
	void setInterestRate() {
		interestRate = getBaseRate() - .25;
	}
}