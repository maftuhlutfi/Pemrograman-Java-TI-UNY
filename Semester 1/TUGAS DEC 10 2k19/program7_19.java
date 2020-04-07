import java.util.*;

public class program7_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Memasukkan angka
		System.out.print("Masukkan jumlah angka: ");
		int size = input.nextInt();
		int[] angka = new int[size];
		for (int i = 0;i < size;i++) {
			angka[i] = input.nextInt();
		}

		// Menampilkan angka yang diiinput
		System.out.print("Array => ");
		for (int i : angka) {
			System.out.print(i + " ");
		}
		System.out.println(" ");

		// Cek dan tampilkan isSort
		if (isSort(angka)) {
			System.out.print("Angka dalam array URUT");
		}
		else {
			System.out.print("Angka dalam array TIDAK URUT");
		}
	}

	public static boolean isSort(int[] array) {
		boolean sort = true;
		for (int i = 0;i < array.length;i++) {
			if (array[i] == min(array)) {
				array[i] = max(array) + 1;
			}
			else {
				sort = false;
				break;
			}
		}
		return sort;
	}

	public static int max(int[] array) {
		int max = array[0];
		for (int i = 0;i < array.length;i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	public static int min(int[] array) {
		int min = array[0];
		for (int i = 0;i < array.length;i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}
}

/*
======
OUTPUT
======
-----
RUN 1
-----
Masukkan jumlah angka: 4
34
22
33
56
Array => 34 22 33 56
Angka dalam array TIDAK URUT

-----
RUN 2
-----
Masukkan jumlah angka: 4
21
45
77
82
Array => 21 45 77 82
Angka dalam array URUT
*/