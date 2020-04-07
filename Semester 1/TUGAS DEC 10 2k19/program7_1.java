/*
=============
Group 1 - I.1
=============
23. Muchamad Lutfi Maftuh
06. Lufia Aviyanti
07. Septian Nur Rohman
10. Muhammad Adzani F. P.
20. Amalia Hafizha
22. Bakhtiar Sulasmanto
*/

import java.util.*;

public class program7_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Memasukkan jumlah siswa
		System.out.print("Masukkan jumlah siswa: ");
		int jumsis = input.nextInt();
		double[] nilai = new double[jumsis];

		// Memasukkan nilai
		System.out.printf("Masukkan %d nilai: %n", jumsis);
		for (int i = 0;i < jumsis;i++) {
			nilai[i] = input.nextInt();
		}

		// Mencari best
		double best = nilai[0];
		for (int i = 1;i < jumsis;i++) {
			if (best < nilai[i])
				best = nilai[i];
		}

		// Mencari grade
		for (int i = 0;i < jumsis;i++) {
			if (nilai[i] >= best - 10)
				System.out.printf("Siswa %d nilainya A %n", i + 1);
			else if (nilai[i] >= best - 20)
				System.out.printf("Siswa %d nilainya B %n", i + 1);
			else if (nilai[i] >= best - 30)
				System.out.printf("Siswa %d nilainya C %n", i + 1);
			else if (nilai[i] >= best - 40)
				System.out.printf("Siswa %d nilainya D %n", i + 1);
		}
	}
}

/*
======
OUTPUT
======
Masukkan jumlah siswa: 3
Masukkan 3 nilai:
89 74 56
Siswa 1 nilainya A
Siswa 2 nilainya B
Siswa 3 nilainya D
*/