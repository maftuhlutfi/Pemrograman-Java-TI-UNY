import java.util.*;

class Email {
	private String firstName;
	private String lastName;
	private String email;
	private String alternateEmail;
	private String departement;
	private String password;
	private int defaultPassLength = 8;
	private int mailboxCapacity;
	Scanner input = new Scanner(System.in);

	Email() {
		System.out.print("Enter your first name: ");
		firstName = input.next();
		System.out.print("Enter your last name: ");
		lastName = input.next();
		setDepartement();
		setEmail();
		setPassword(defaultPassLength);
		setMailboxCapacity(100);
		setAlternateEmail();
	}

	Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		setDepartement();
		setEmail();
		setPassword(defaultPassLength);
		setMailboxCapacity(100);
		setAlternateEmail();
	}

	// Define departement
	void setDepartement() {
		String[] departements = new String[]{"", "sales", "development", "accounting"};
		System.out.print("\nCHOOSE DEPARTEMENT\n");
		System.out.print("0 None \n1 Sales \n2 Development \n3 Accounting\n");
		System.out.print("Enter departement: ");
		this.departement = departements[input.nextInt()];
	}

	// Generate email
	void setEmail() {
		email = firstName.toLowerCase() + "." + lastName.toLowerCase();
		if (departement.length() > 0) {
			email += "@" + departement + ".nyomskuy.com";
		} else {
			email += "@nyomskuy.com";
		}
		System.out.println("\nYour email is: " + email);
	}

	// Generate random password
	void setPassword(int length) {
		String passChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijlklmnopqrstuvwxyz1234567890";
		String password = "";
		for (int i = 0;i < length;i++) {
			int randCharAt = (int)(Math.random() * passChar.length());
			password += passChar.charAt(randCharAt);
		}
		System.out.println("Your password is: " + password);
		this.password = password;
	}

	// Set mailbox capacity
	void setMailboxCapacity(int capacity) {
		mailboxCapacity = capacity;
	}

	// set alternate mail
	void setAlternateEmail() {
		System.out.print("\nDid you have alternate email? (Y/N)");
		if (input.next().equalsIgnoreCase("y")) {
			System.out.print("Enter yout alternate email: ");
			alternateEmail = input.next();
		}
	}

	// display method
	void showInfo() {
		System.out.print("\n+-----------+\n| MAIL INFO |\n+-----------+\n");
		System.out.printf("First name: %s\nLast name: %s\nEmail: %s\nMailbox capacity: %dMB",
			firstName, lastName, email, mailboxCapacity);
	}
}