/*
================================
Nama	: Muchamad Lutfi Maftuh
NIM 	: 1953714023
Kelas	: I.1
================================
*/

public class R10 {
	public static void main(String[] args) {
		System.out.println(circleArea(7.0));
		System.out.printf("%.2f %n", sphereVolume(7.0));
		System.out.println(round(1.8));
		reverseCase("FC Barcelona 2019");
	}

	// Method menghitung luas lingkaran
	public static double circleArea(double radius) {
		double area = 22.0 / 7.0 * radius * radius;
		return area;
	}

	// Method menghitung volume bola
	public static double sphereVolume(double radius) {
		double volume = (4.0 / 3.0) * 3.14 * radius * radius * radius;
		return volume;
	}

	// Method untuk membulatkan bilangan desimal
	public static int round(double value) {
		double bulat = Math.floor(value + 0.5);
		return (int)bulat;
	}

	// Method membalik string
	public static String reverseCase(String s) {
		String reverseCase = "";
		for (int  i = 0;i < s.length();i++) {
			char j = s.charAt(i);
			if (Character.isLowerCase(j)) {
				reverseCase = reverseCase + Character.toUpperCase(j);
			}
			else if ((Character.isUpperCase(j))) {
				reverseCase = reverseCase + Character.toLowerCase(j);
			}
			else {
				reverseCase = reverseCase + j;
			}
		}
		System.out.print(reverseCase);
		return reverseCase;
	}
}

/*
======
OUTPUT
======
154.0
1436.03 
2
fc bARCELONA 2019
*/