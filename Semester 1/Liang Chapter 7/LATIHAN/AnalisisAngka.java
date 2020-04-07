import java.util.Scanner;

public class AnalisisAngka {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Jumlah siswa: ");
		int siswa = input.nextInt();
		double angka[] = new double[siswa];
		double jumlah = 0;
		for (int i = 0;i < angka.length;i++) {
			System.out.print("Masukkan nilai" + (i+1) + ":");
			angka[i] = input.nextDouble();
			jumlah += angka[i];
		}
		double rata = jumlah / angka.length;
		int count = 0;
		for (int i = 0;i < angka.length;i++) {
			if (angka[i] > rata) {
				count++;
			}
		}
		System.out.printf("Rata ratanya adalah %.2f %n", rata);
		System.out.printf("Nilai yang diatas rata2 ada %d yaitu: ", count);
		for (int i = 0;i < angka.length;i++) {
			if (angka[i] > rata) {
				System.out.print(angka[i] + " ");
			}
		}
	}
}