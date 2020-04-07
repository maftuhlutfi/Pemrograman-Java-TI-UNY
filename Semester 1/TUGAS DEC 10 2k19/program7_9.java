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

public class program7_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] angka = new double[10];

		// Memasukkan 10 angka
		System.out.println("Masukkan 10 angka double");
		for (int i = 0;i < 10;i++) {
			angka[i] = input.nextDouble();
		}

		// Menampilkan min dengan memanggil methodnya
		System.out.println("Angka minimal: " + min(angka));
	}

	public static double min(double[] array) {
		double min = array[0];
		for (double i : array) {
			if (min > i)
				min = i;
		}
		return min;
	}
}

/*
======
OUTPUT
======
Masukkan 10 angka double
2.5 3.1 1.2 5.2 8.2 5.1 0.2 1.5 2 3.2
Angka minimal: 0.2
*/