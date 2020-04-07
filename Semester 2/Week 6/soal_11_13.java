/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

import java.util.*;

public class soal_11_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// ArrayList baru
		ArrayList<Integer> list = new ArrayList<>();
		
		// User memasukkan 5 angka
		System.out.print("Masukkan 10 angka: ");
		for (int i = 0;i < 10;i++) {
			list.add(input.nextInt());
		}

		// Memanggil method removeDuplicate()
		removeDuplicate(list);

		// Menampilkan list
		System.out.print("The distinct integer are ");
		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}

	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0;i < list.size() - 1;i++) {
			int cond = 0;
			for (int j = i + 1;j < list.size(); cond=cond == 1 ? j : j++) {
				if (list.get(i) == list.get(j)) {
					list.remove(j);
					cond = 1;
				}
			}
		}
	}
}

/*
======
OUTPUT
======

*/