import java.util.Scanner;

public class lab5 {
	public static void main(String[] args) {
		
		// input
		Scanner input = new Scanner(System.in);

		// boolean
		boolean boolean0 = true;
		boolean boolean1 = false;
		System.out.printf("boolean0 adalah %b %n", boolean0);
		System.out.printf("boolean1 adalah %b %n", boolean1);

		// comparison
		boolean equals = (11 == 33);
		boolean notequals = (22 != 44);
		boolean greaterthan = (15 > 25);
		boolean lessthan = (-11 < 13);
		System.out.printf("(11 == 33) is %b %n", equals);
		System.out.printf("(22 != 44) is %b %n", notequals);
		System.out.printf("(15 > 25) is %b %n", greaterthan);
		System.out.printf("(-11 < 13) is %b %n", lessthan);

		// conditional
		System.out.print("Masukkan angka pertama: ");
		int angka1 = input.nextInt();
		System.out.print("Masukkan angka kedua: ");
		int angka2 = input.nextInt();
		if (angka1 == angka2)
			System.out.println("angka1 dan angka2 sama besar");
		else if (angka1 > angka2) {
			System.out.println("angka1 lebih besar dari angka2");
		}
		else                                      
			System.out.println("angka2 lebih besar dari angka1");

		// switch
		System.out.print("Masukkan nama negara di USA: ");
		String negara = input.next();
		String negaralow = negara.toLowerCase();
		switch (negaralow) {
			case "alabama": case "florida" : System.out.println((negara.substring(0, 1).toUpperCase()) + (negara.substring(1).toLowerCase()) + " berada di bagian selatan"); break;
			case "colorado": case "utah" : System.out.println((negara.substring(0, 1).toUpperCase()) + (negara.substring(1).toLowerCase()) + " berada di bagian barat"); break;
			case "michigan": case "wisconsin" : System.out.println((negara.substring(0, 1).toUpperCase()) + (negara.substring(1).toLowerCase()) + " berada di bagian utara"); break;
			case "delaware": case "maine" : System.out.println((negara.substring(0, 1).toUpperCase()) + (negara.substring(1).toLowerCase()) + " berada di bagian timur"); break;
			default : System.out.println("Hambuh ya, paling bagian tengah kui"); break;
		}

	}
}