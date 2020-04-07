/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/
import java.util.*;

public class soal_11_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// ArrayList baru
		ArrayList<Integer> list = new ArrayList<>();
		
		// User memasukkan 5 angka
		System.out.print("Masukkan 5 angka: ");
		for (int i = 0;i < 5;i++) {
			list.add(input.nextInt());
		}

		// Memanggil method sort()
		sort(list);

		// Menampilkan list
		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}

	public static void sort(ArrayList<Integer> list) {
		// Menggunakan Collections.sort untuk sorting ArrayList
		Collections.sort(list);
	}
}

/*
======
OUTPUT
======
Masukkan 5 angka: 3 2 23 2 1
1 2 2 3 23
*/