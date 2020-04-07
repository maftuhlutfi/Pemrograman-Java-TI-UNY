/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

import java.util.*;

public class soal_11_6 {
	public static void main(String[] args) {
		// Membuat arraylist object
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(new Loan());		
		list.add(new Date());		
		list.add(new String("Maftuh"));	
		list.add(new Circle());	

		// Menampilkan toString()
		for (int i = 0; i < list.size(); i++) {
			System.out.println((list.get(i)).toString());
		}
	}
}

class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	/** Default constructor */
	public Loan() {
		this(2.5, 1, 1000);
	}

	/** Construct a loan with specified annual interest rate, 
	    number of years, and loan amount
	 */
	public Loan(double annualInterestRate, int numberOfYears,
		double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** Set an new annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/** Return numberOfYears */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/** Set a new numberOfYears */
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	/** Return loanAmount */
	public double getLoanAmount() {
		return loanAmount;
	}

	/** Set a new loanAmount */
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	} 

	/** Find monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
			(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}

	/** Find total payment */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
	/** Return loan date */
	public java.util.Date getLoanDate() {
		return loanDate;
	}
}

class Circle {
	/** The radius of the circle */
	private double radius = 1;

	/** The number of objects created */
	private static int numberOfObjects = 0;

	/** Construct a circle with radius 1 */
	public Circle() {
		numberOfObjects++;
	}

	/** Construct a circle with a specified radius */
	public Circle(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}

	/** Return numberOfObjects */
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	/** Return the area of this circle */
	public double getArea() {
		return radius * radius * Math.PI;
	}
}

/*
======
OUTPUT
======
Loan@1db9742
Thu Mar 05 22:21:26 ICT 2020
Maftuh
Circle@647e05
*/