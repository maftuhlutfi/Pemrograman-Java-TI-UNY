import java.util.*;

public class program7_34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan string: ");
		String s = input.next();
		System.out.print("Urutan string: " + sort(s));
	}

	public static String sort(String s) {
		// Membuat array integer masing" karakter string
		char[] str1 = new char[s.length()];
		char[] str2 = new char[s.length()];
		int[] sInt = new int[s.length()];
		for (int i = 0;i < s.length();i++) {
			str1[i] = s.charAt(i);
			str2[i] = s.charAt(i);
			sInt[i] = (int)(s.charAt(i));
		}

		// Memasukkan karakter yang urut ke str2
		for (int i = 0;i < s.length();i++) {
			for (int j = 0;j < s.length();j++) {
				if (sInt[j] == min(sInt)) {
					str2[i] = str1[j];
					sInt[j] = max(sInt) + 1;
					break;
				}
			}
		}

		// Memasukkan array str2 ke sebuah String
		String sorted = "";
		for (char st : str2) {
			sorted = sorted + st;
		}
		return sorted;
	}

	public static int max(int[] array) {
		int max = array[0];
		for (int i = 0;i < array.length;i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	public static int min(int[] array) {
		int min = array[0];
		for (int i = 0;i < array.length;i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}
}

/*
======
OUTPUT
======
Masukkan string: zebracross
Urutan string: abceorrssz
*/