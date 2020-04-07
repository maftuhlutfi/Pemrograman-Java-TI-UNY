/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

import java.util.*;

public class soal2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan angka integer(spasi)float? ");
		int i = input.nextInt();
		float f = input.nextFloat();
		System.out.printf("Hasil kalinya %.2f", i * f);
	}
}