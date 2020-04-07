import java.util.Scanner;

public class DisplayTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan detik: ");
		long detik = input.nextInt();
		long menit = detik % 60;
		long jam = detik / 3600;
		long sisadetik = detik % 60;
		System.out.printf("%n %d detik adalah %d jam %d menit %d detik", detik, jam, menit, sisadetik);
	}
}