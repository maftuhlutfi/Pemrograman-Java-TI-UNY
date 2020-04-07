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

public class program7_33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan tahun: ");
		int tahun = input.nextInt();
		String[] zodiac = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
		System.out.print("Chinese Zodiac: " + zodiac[tahun % 12]);
	}
}

/*
======
OUTPUT
======
-----
RUN 1
-----
Masukkan tahun: 2001
Chinese Zodiac: snake

-----
RUN 2
-----
Masukkan tahun: 1963
Chinese Zodiac: rabbit
*/