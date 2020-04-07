/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/
import java.util.*;

public class soal_11_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// ArrayList baru
		ArrayList<Double> list = new ArrayList<>();
		
		// User memasukkan 5 angka
		System.out.print("Masukkan 5 angka: ");
		for (int i = 0;i < 5;i++) {
			list.add(input.nextDouble());
		}

		// Memanggil dan menampilkan hasil method sum()
		System.out.println("Hasil sum: " + sum(list)); 
	}

	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (int i = 0;i < list.size();i++) {
			sum += list.get(i);
		}
		return sum;
	}
}

/*
======
OUTPUT
======
Masukkan 5 angka: 2 3 4 5 6
Hasil sum: 20.0
*/