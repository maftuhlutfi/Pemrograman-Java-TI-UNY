public class BilPrima {
	public static void main(String[] args) {
		
		int totalprima = 50;
		int totalprimabaris = 10;
		int i = 0, angka = 2;

		System.out.println("50 bilangan prima pertama adalah ");

		while (i <= totalprima) {
			boolean isPrima = true;
			
			// Test apakah prima
			for (int pembagi = 2;pembagi <= angka / 2; pembagi++) {
				if (angka % pembagi == 0) {
					isPrima = false;
					break;
				}
			}

			// Jika prima count nambah dan tampilkan
			if (isPrima) {
				i++;
				if (i % totalprimabaris == 0) 
					System.out.println(angka);
				else
					System.out.print(angka + " ");
			}

			angka++;

		}

	}
}