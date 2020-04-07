// Muchamad Lutfi Maftuh
// Teknologi Informasi - I.1
// P4 (24 September 2019)

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Deklarasi
		double gross_salary, interest_income, capital_gains;
		int exemption;
		double total_income, adjusted_income, federal_tax, state_tax;

		// Input data 
		System.out.print("Enter Gross Salary: ");
		gross_salary = input.nextDouble();
		System.out.print("Enter Exemption: ");
		exemption = input.nextInt();
		System.out.print("Enter Interest Income: ");
		interest_income = input.nextDouble();
		System.out.print("Enter Capital Gains Income: ");
		capital_gains = input.nextDouble();

		// Hitung total income
		total_income = gross_salary + interest_income + capital_gains - 5000;

		// Hitung adjusted income
		if (exemption >= 6)
			adjusted_income = total_income - (6 * 1500);
			else
			adjusted_income = total_income - (exemption * 1500);

		// Hitung federal tax
		federal_tax = adjusted_income;
		if (20000 <= adjusted_income && adjusted_income < 35000) {
			federal_tax = (13.0 / 100 * adjusted_income);
		}
		else if (35000 <= adjusted_income && adjusted_income < 50000) {
			federal_tax = (23.0 / 100 * adjusted_income);
		}
		else if (adjusted_income >= 50000) {
			federal_tax = (28.0 / 100 * adjusted_income);
		}

		// Hitung State Tax
		state_tax = 6.5 / 100 * federal_tax;

		// Menampilkan total income, adjusted income, federal tax, state tax
		System.out.printf("Total Income: $%.2f %n", total_income);
		System.out.printf("Adusted Income: $%.2f %n", adjusted_income);
		System.out.printf("Total Tax: $%.2f %n", federal_tax);
		System.out.printf("State Tax: $%.2f %n", state_tax);

	}
}

// Output
/*
Enter Gross Salary: 70000
Enter Exemption: 7
Enter Interest Income: 2500
Enter Capital Gains Income: 5000
Total Income: $72500.00
Adusted Income: $63500.00
Total Tax: $17780.00
State Tax: $1155.70
*/