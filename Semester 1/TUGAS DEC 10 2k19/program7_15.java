import java.util.*;

public class program7_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] angka = new int[10];

		// Memasukkan 10 angka
		System.out.println("Masukkan 10 angka:");
		for (int i = 0;i < 10;i++) {
			angka[i] = input.nextInt();
		}

		// Menampilkan angka distinct
		System.out.print("Angka distinct: ");
		for (int i : eliminateDuplicate(angka)) {
			if (i > 0)
				System.out.print(i + " ");
		}
	}

	public static int[] eliminateDuplicate(int[] list) {
		int[] elim = new int[list.length];
		for (int i = 0;i < list.length;i++) {
			if (!isExist(elim, list[i]))
				elim[i] = list[i];
		}
		return elim;
	}

	public static boolean isExist(int[] array, int a) {
		boolean exist = false;
		for (int i : array) {
			if (i == a)
				exist = true;
		}
		return exist;
	} 
}

/*
======
OUTPUT
======
Masukkan 10 angka:
2 1 3 4 6 2 7 8 9 1
Angka distinct: 2 1 3 4 6 7 8 9
*/