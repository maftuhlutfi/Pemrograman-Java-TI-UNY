import java.util.*;

public class program7_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Array 100 angka 1-100
		int[] angka = new int[100];
		int[] jmlsama = new int[100];
		for (int i = 0;i < 100;i++) {
			angka[i] = i + 1;
		}

		// Masukkan angka
		System.out.println("Masukkan integer antara 1 - 100: ");
		while (0 < 1) {
			int j = input.nextInt();
			// Membandingkan dengan angka 1-100
			for (int i = 0;i < 100;i++) {
				// Jika sama jumlah sama nambah 1
				if (j == angka[i])
					jmlsama[i] += 1;
			}
			// Jika input 0 maka selesai
			if (j == 0)
				break;
		}
		// Menampilkan angka yang dimasukkan dan muncul brp kali
		for (int i = 0;i < 100;i++) {
			if (jmlsama[i] > 0)
				System.out.printf("%d muncul %d kali %n", angka[i], jmlsama[i]);
		}
	}
}

/*
======
OUTPUT
======
Masukkan integer antara 1 - 100:
4 2 4 5 2 4 0
2 muncul 2 kali
4 muncul 3 kali
5 muncul 1 kali
*/