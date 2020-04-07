import java.util.Scanner;

public class QuizMtkPengurangan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int answer = 0;
		int jumlahbenar = 0;
		int soal;
		// Looping soal
		for (int i = 1;i <= 5;i++) {
			// Ambil angka acak
			int a = (int) (Math.random() * 10);
			int b = (int) (Math.random() * 10);

			// swipe jika b > a
			if (b > a) {
				int temp = a;
				a = b;
				soal = a - temp;
				System.out.printf("%d - %d = ", a, temp);
			}
			// jika tidak
			else {
				soal = a - b;
				System.out.printf("%d - %d = ", a, b);
			}

			// Jawaban user
			answer = input.nextInt();

			// Benar atau salah
			if (answer == soal) {
				System.out.println("Jawaban benar");
				jumlahbenar++;
			}
			else {
				System.out.printf("Jawaban salah, yang benar %d %n", soal);
			}
		}
		// Menampilkan jumlah benar
		System.out.printf("Kamu berhasil menjawab %d soal", jumlahbenar);
	}
}