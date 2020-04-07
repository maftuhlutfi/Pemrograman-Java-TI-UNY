import java.util.*;

public class program7_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] angka = new double[10];
		System.out.println("Masukkan 10 angka double");
		for (int i = 0;i < 10;i++) {
			angka[i] = input.nextDouble();
		}
		System.out.println("Rata2nya adalah: " + average(angka));
	}

	public static int average(int[] array) {
		int total = 0;
		for (int i : array) {
			total += i;
		}
		return total / array.length;
	}

	public static double average(double[] array) {
		double total = 0;
		for (double i : array) {
			total += i;
		}
		return total / array.length;
	}
}

/*
======
OUTPUT
======
Masukkan 10 angka double
3.0 1.4 1.2 5.6 3.4 1.0 0.5 3.3 5.8 9.6
Rata2nya adalah: 3.4800000000000004
*/