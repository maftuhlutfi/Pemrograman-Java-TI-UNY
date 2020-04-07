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

public class program7_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// User memasukkan data siswa
		System.out.print("Masukkan jumlah siswa: ");
		int jmlsiswa = input.nextInt();
		int[] nilai = new int[jmlsiswa];
		String[] nama = new String[jmlsiswa];

		for (int i = 0;i < jmlsiswa;i++) {
			System.out.printf("Masukkan nama siswa %d: ", i + 1);
			nama[i] = input.next();
			System.out.printf("Masukkan nilai siswa %d: ", i + 1);
			nilai[i] = input.nextInt();
		}

		// Memasukkan array nilai ke array nilai1(baru)
		int[] nilai1 = new int[jmlsiswa];
		for (int i = 0;i < jmlsiswa;i++) {
			nilai1[i] = nilai[i];
		}

		// Memanggil method mengurutkan nilai untuk dimasukkan ke array baru
		int[] nilaiurut = urutnilai(nilai1);

		// Memanggil method mengurutkan nama untuk dimasukkan ke array baru
		String[] namaurut = urutnama(nilai, nilaiurut, nama);

		// Menampilkan hasil pengurutan
		System.out.println("=============");
		System.out.println("URUTAN NILAI");
		System.out.println("=============");
		System.out.println("Nama\tNilai");
		for (int i = 0;i < nilai.length;i++) {
			System.out.println(namaurut[i] + "\t" + nilaiurut[i]);
		}
	}

	// Method mengurutkan nilai
	public static int[] urutnilai(int[] nilaiawal) {
		int[] newnilai = new int[nilaiawal.length];
		for (int i = 0;i < nilaiawal.length;i++) {
			int max = max(nilaiawal);
			for (int j = 0;j < nilaiawal.length;j++) {
				if (nilaiawal[j] == max) {
					newnilai[i] = max;
					nilaiawal[j] = -1;
					break;
				}
			}
		}
		return newnilai;
	}

	// Method menentukan nilai max pada array
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 0;i < array.length;i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	// Method mengurutkan nama
	public static String[] urutnama(int[] nilaiawal, int[] nilaiurut, String[] namaawal) {
		String[] namaurut = new String[namaawal.length];
		for (int i = 0;i < namaawal.length;i++) {
			for (int j = 0;j < namaawal.length;j++) {
				if (nilaiurut[i] == nilaiawal[j]) {
					namaurut[i] = namaawal[j];
					nilaiawal[j] = -1;
					break;
				}
			}
		}
		return namaurut;
	}
}

/*
======
OUTPUT
======
Masukkan jumlah siswa: 4
Masukkan nama siswa 1: ani
Masukkan nilai siswa 1: 60
Masukkan nama siswa 2: budi
Masukkan nilai siswa 2: 86
Masukkan nama siswa 3: cecep
Masukkan nilai siswa 3: 60
Masukkan nama siswa 4: deni
Masukkan nilai siswa 4: 70
=============
URUTAN NILAI
=============
Nama    Nilai
budi    86
deni    70
ani     60
cecep   60
*/