/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

import java.util.*;

public class soal3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan angka integer (input 0 dan enter untuk selesai): ");

		// Memasukkan angka
		String s = "";
		int inputI = 0;
		int pjgArray = 0; // Menentukan panjang array
		while (0 < 1) {
			inputI = input.nextInt();
			if (inputI == 0)
				break;
			s += " " + inputI;
			pjgArray++; // Menentukan panjang array
		}
		String s1 = s;

		// Membuat array sesuai panjangnya
		int[] array = new int[pjgArray];

		// Memasukkan angka ke array
		int i = 0;
		Scanner scanInt = new Scanner(s1);
		while (scanInt.hasNextInt()) {
				array[i] = scanInt.nextInt();
				i++;
			
		}

		// Mengonversi ke inch
		System.out.println("Angka tadi dalam inch:");
		for (int a : array) {
			System.out.printf("%.2f ", a * 39.37);
		}
	}
}