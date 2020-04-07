import java.util.Scanner;

public class soal1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan angka: ");
		int i = input.nextInt();
		if (isPrime(i))
			System.out.print(i + " adalah bilangan prima");
		else
			System.out.print(i + " bukan bilangan prima");
	}

	public static boolean isPrime(int number) {
	    for(int i=2;i<=number/2;i++)
	        if(number%i==0)
	            return false;
	    return true;
	}
}

/*
======
OUTPUT0
======
E:\SEKOLAH\UNY\Semester 1\PEMROGRAMAN\JAVA\LIANG\SOAL KONCO>java soal1
Masukkan angka: 5
5 bilangan prima
E:\SEKOLAH\UNY\Semester 1\PEMROGRAMAN\JAVA\LIANG\SOAL KONCO>java soal1
Masukkan angka: 4
4 bukan bilangan prima
*/