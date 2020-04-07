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

public class program7_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] angka = new int[10];
		boolean[] isExist = new boolean[10];

		// Memasukkan 10 angka
		System.out.println("Masukkan 10 angka: ");

		for (int i = 0;i < 10;i++) {
			int k = input.nextInt();
			for (int j = 0;j < 10;j++) {
				// Jika angka sama maka isExist = true
				if (angka[j] == k) {
					isExist[i] = true;
					break;
				}
			}
		angka[i] = k;
		}

		// Menghitung angka yang sama dan tampilkan
		int distinct = 0;
		for (boolean i : isExist) {
			if (i == false)
				distinct++;
		}
		System.out.println("Jumlah angka yang distinct ada " + distinct);

		// Menampilkan angka yang sama
		System.out.print("Angka yang distinct adalah ");
		for (int i = 0;i < 10;i++) {
			if (isExist[i] == false)
			System.out.print(angka[i] + " ");
		}
		
	}
}

/*
======
OUTPUT
======
Masukkan 10 angka:
2 3 4 5 1 2 3 4 5 6 
Jumlah angka yang distinct ada 6
Angka yang distinct adalah 2 3 4 5 1 6
*/