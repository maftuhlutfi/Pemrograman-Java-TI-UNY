import java.util.*;



public class solusi1 {

	public static void main(String[] args) {

		// Buat scanner
		Scanner input = new Scanner(System.in);

		// User memasukkan jumlah data
		System.out.print("Masukkan jumlah data: ");
		int totalData = input.nextInt();

		// Membuat array dengan panjang sesuai jumlah data
		int[] dataArray = new int[totalData];

		// Memasukkan data ke array
		System.out.print("Masukkan data: ");
		for (int i = 0;i < totalData;i++) {
			dataArray[i] = input.nextInt();
		}

		// Menampilkan data terkecil
		System.out.println("Data terkecil adalah " + cariMin(dataArray));

		// Menampilkan data terbesar
		System.out.println("Data terbesar adalah " + cariMax(dataArray));

		// Menampilkan rata-rata
		System.out.println("Rata-ratanya adalah " + cariAvg(dataArray));

	}
	

	// Method mencari data terkecil
	public static int cariMin(int[] array) {
		int min = array[0];
		for (int i = 0;i < array.length;i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

	// Method mencari data terbesar
	public static int cariMax(int[] array) {
		int max = array[0];
		for (int i = 0;i < array.length;i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	// Method mencari rata-rata
	public static double cariAvg(int[] array) {
		double sum = 0;
		for (int i = 0;i < array.length;i++) {
			sum += array[i];
		}
		return sum / array.length;
	}

}