import java.util.Scanner;

public class DecimaltoHexa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int decimal;

		// Masukkan angka decimal
		System.out.print("Decimal = ");
		decimal = input.nextInt();

		// Konversi ke hexa
		String hasil = "";
		String hexahuruf = "";
		String hexa = "";
		while (decimal != 0) {
			int hexasisa = decimal % 16;
			switch (hexasisa) {
				case 10 : hexahuruf = "A"; break;
				case 11 : hexahuruf = "B"; break;
				case 12 : hexahuruf = "C"; break;
				case 13 : hexahuruf = "D"; break;
				case 14 : hexahuruf = "E"; break;
				case 15 : hexahuruf = "F"; break;
			}
			if (hexasisa < 10) {
				hexa = Integer.toString(hexasisa);
			}
			else {
				hexa = hexahuruf;
			}
			hasil = hexa + hasil;
			decimal = decimal / 16;
		}

		// Print hexa
		System.out.printf("Hexadecimal = %s", hasil);
	}
}