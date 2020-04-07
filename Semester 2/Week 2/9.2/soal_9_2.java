/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;

	Stock(String name, String symbol) {
		this.symbol = symbol;
		this.name = name;
	}

	double getChangePercent() {
		return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
	}
}

public class soal_9_2 {
	public static void main(String[] args) {
		Stock stock1 = new Stock("Oracle Corporation", "ORCL");
		stock1.currentPrice = 34.35;
		stock1.previousClosingPrice = 34.5;
		System.out.printf("The price-change percentage is %.2f%%", stock1.getChangePercent());
	}
}

/*

======
OUTPUT
======
The price-change percentage is 0.44%

*/