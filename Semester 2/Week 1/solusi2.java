import java.util.*;

public class solusi2 {

	public static void main(String[] args) {
		
		// Buat scanner
		Scanner input = new Scanner(System.in);

		// User memasukkan jumlah data
		System.out.print("Masukkan jumlah data: ");
		int totalData = input.nextInt();

		// Membuat object baru untuk memanggil non-static method
		Data data1 = new Data(totalData);

		// Memasukkan data ke array pada object yang telah dibuat
		System.out.print("Masukkan data: ");
		for (int i = 0;i < totalData;i++) {
			data1.setDataArray(i, input.nextInt());
		}

		// Menampilkan data terkecil
		System.out.println("Data terkecil adalah " + data1.cariMin());

		// Menampilkan data terbesar
		System.out.println("Data terbesar adalah " + data1.cariMax());

		// Menampilkan rata-rata
		System.out.println("Rata-ratanya adalah " + data1.cariAvg());
	}
	
}


class Data {
	
	private int totalData;
	private int[] dataArray;

	Data() {
		this.totalData = 0;
	}

	Data(int i) {
		this.totalData = i;
		this.dataArray = new int[totalData];
	}

	// Method untuk set dataArray
	public void setDataArray(int i, int value) {
		this.dataArray[i] = value;
	}

	// Method mencari data terkecil
	public int cariMin() {
		int min = dataArray[0];
		for (int i = 0;i < dataArray.length;i++) {
			if (min > dataArray[i]) {
				min = dataArray[i];
			}
		}
		return min;
	}

	// Method mencari data terbesar
	public int cariMax() {
		int max = dataArray[0];
		for (int i = 0;i < dataArray.length;i++) {
			if (max < dataArray[i]) {
				max = dataArray[i];
			}
		}
		return max;
	}

	// Method mencari rata-rata
	public double cariAvg() {
		double sum = 0;
		for (int i = 0;i < dataArray.length;i++) {
			sum += dataArray[i];
		}
		return sum / dataArray.length;
	}

}