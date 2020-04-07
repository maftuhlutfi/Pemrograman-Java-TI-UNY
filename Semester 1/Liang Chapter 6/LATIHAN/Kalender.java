import java.util.Scanner;

public class Kalender {
	
	// Print kalender
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan tahun: ");
		int tahun = input.nextInt();
		System.out.print("Masukkan bulan (1-12): ");
		int bulan = input.nextInt();

		// Print heading
		printHeading(bulan, tahun);

		// Print body kalender

	}

	// Method print heading
	public static void printHeading(int bulan, int tahun) { 
		// System.out.println("        " + getNamaBulan(bulan) + " " + tahun);
		System.out.println(getNamaBulan(bulan) + " " + tahun);
		System.out.println("-----------------------------");
    	System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		// System.out.println("---------------------------");
		// System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	}

	// Method NamaBulan
	public static String getNamaBulan(int bulan) {
		String namabulan = "";
		switch (bulan) {
			case 1: System.out.print("Januari"); break;
			case 2: System.out.print("Februari"); break;
			case 4: System.out.print("April"); break;
			case 5: System.out.print("Mei"); break;
			case 6: System.out.print("Juni"); break;
			case 7: System.out.print("Juli"); break;
			case 8: System.out.print("Agustus"); break;
			case 9: System.out.print("September"); break;
			case 10: System.out.print("Oktober"); break;
			case 11: System.out.print("November"); break;
			case 12: System.out.print("Desember"); break;
		}
		return namabulan;
	}

}