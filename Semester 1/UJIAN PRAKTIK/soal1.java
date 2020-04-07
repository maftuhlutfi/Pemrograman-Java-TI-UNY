/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

import java.util.*;

public class soal1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Berapa meter? ");
		int meter = input.nextInt();
		System.out.printf("%d meter = %.2f inch", meter, meter * 39.37);
	}
}