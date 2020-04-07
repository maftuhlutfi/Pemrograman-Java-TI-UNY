import java.util.Scanner;

public class TabelPerkalian {
	public static void main(String[] args) {
		System.out.println("  1  2  3  4  5  6  7  8  9  10");
		for (int i = 1;i <= 10;i++) {
			System.out.print(i);
			for (int j = 1;j <= 10;j++) {
				System.out.printf(" %d ", (i * j));
			}
			System.out.println(" ");
		}
	}
}