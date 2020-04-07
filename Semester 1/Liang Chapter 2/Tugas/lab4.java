import java.util.Scanner;

public class lab4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;
		double akarnegatif, akarpositif;
		// Masukkan koefisien
		System.out.print("Masukkan koefisien A: ");
		a = input.nextInt();
		System.out.print("Masukkan koefisien B: ");
		b = input.nextInt();
		System.out.print("Masukkan koefisien C: ");
		c = input.nextInt();
		// Menampilkan Formula
		System.out.printf("Formulanya: %dx^2 + %dx + %d %n", a, b, c);
		// Menghitung Determinan dan akar
		int det = b * b - 4 * a * c;
		akarpositif = (-b + Math.sqrt(det)) / (2 * a);
		akarnegatif = (-b - Math.sqrt(det)) / (2 * a);
		// Menampilkan Akar
		System.out.printf("Akar Positif: %d %n", akarpositif);
		System.out.printf("Akar Negatif: %d %n", akarnegatif);
	}
}