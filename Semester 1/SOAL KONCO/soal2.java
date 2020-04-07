import java.util.Scanner;

public class soal2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("================");
		System.out.println("MENGHITUNG LUAS");
		System.out.println("================");
		System.out.println("1. Luas Persegi");
		System.out.println("2. Luas Segitiga");
		System.out.println("3. Luas Lingkaran");
		System.out.print("Mau hitung yang mana? ");

		int i = input.nextInt();
		switch (i) {
			case 1 : System.out.println("================");
					 System.out.println("LUAS PERSEGI");
					 System.out.println("================");
					 System.out.print("Masukkan sisi: ");
					 double s = input.nextDouble();
					 System.out.printf("Luas persegi adalah %.2f cm persegi", luasPersegi(s));
					 break;
			case 2 : System.out.println("================");
					 System.out.println("LUAS SEGITIGA");
					 System.out.println("================");
					 System.out.print("Masukkan alas: ");
					 double a = input.nextDouble();
					 System.out.print("Masukkan tinggi: ");
					 double t = input.nextDouble();
					 System.out.printf("Luas segitiga adalah %.2f cm persegi", luasSegitiga(a, t));
					 break;
			case 3 : System.out.println("================");
					 System.out.println("LUAS LINGKARAN");
					 System.out.println("================");
					 System.out.print("Masukkan jari-jari: ");
					 double r = input.nextDouble();
					 System.out.printf("Luas lingkaran adalah %.2f cm persegi", luasLingkaran(r));
					 break;
		}
	}

	public static double luasLingkaran(double r) {
		return 3.14 * r * r;
	}

	public static double luasSegitiga(double a, double t) {
		return 1.0 / 2.0 * a * t;
	}

	public static double luasPersegi(double s) {
		return s * s;
	}
}

/*
======
OUTPUT
======

E:\SEKOLAH\UNY\Semester 1\PEMROGRAMAN\JAVA\LIANG\SOAL KONCO>java soal2
================
MENGHITUNG LUAS
================
1. Luas Persegi
2. Luas Segitiga
3. Luas Lingkaran
Mau hitung yang mana? 1
================
LUAS PERSEGI
================
Masukkan sisi: 3
Luas persegi adalah 9.00 cm persegi

E:\SEKOLAH\UNY\Semester 1\PEMROGRAMAN\JAVA\LIANG\SOAL KONCO>java soal2
================
MENGHITUNG LUAS
================
1. Luas Persegi
2. Luas Segitiga
3. Luas Lingkaran
Mau hitung yang mana? 2
================
LUAS SEGITIGA
================
Masukkan alas: 2
Masukkan tinggi: 3
Luas segitiga adalah 3.00 cm persegi

E:\SEKOLAH\UNY\Semester 1\PEMROGRAMAN\JAVA\LIANG\SOAL KONCO>java soal2
================
MENGHITUNG LUAS
================
1. Luas Persegi
2. Luas Segitiga
3. Luas Lingkaran
Mau hitung yang mana? 3
================
LUAS LINGKARAN
================
Masukkan jari-jari: 5
Luas lingkaran adalah 78.50 cm persegi
*/