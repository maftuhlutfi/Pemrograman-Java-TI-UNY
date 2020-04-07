import java.util.Scanner;

public class FaktorTerbesar {
	public static void main(String[] args) {
		int n1, n2, k = 2, sisa1, sisa2, faktorbesar=1;
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan angka1: ");
		n1 = input.nextInt();
		System.out.print("Masukkan angka2: ");
		n2 = input.nextInt();
		if (n1 < n2) {
			while (k <= n1) {
				sisa1 = n1 % k;
				sisa2 = n2 % k;
				if ((sisa1 == 0) && (sisa2 == 0)) {
					faktorbesar = k;
				}
				k++;
			}
		}
		else if (n2 < n1) {
			while (k <= n2) {
				sisa1 = n1 % k;
				sisa2 = n2 % k;
				if ((sisa1 == 0) && (sisa2 == 0) ) {
					faktorbesar = k;
				}
				k++;
			}
		}
		System.out.printf("Faktor terbesarnya adalah %d", faktorbesar);
	}
}