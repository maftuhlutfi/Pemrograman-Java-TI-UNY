/*
================================
Nama	: Muchamad Lutfi Maftuh
NIM 	: 19537141023
Kelas	: I.1
================================
*/

import java.util.Arrays;

public class P7 {
	// Method createIntegers
	public static int[] createIntegers() {
		int[] i = {16, 21, 34, 49, 55, 60, 72, 83, 101};
		return i;
	}

	// Method createDoubles 
	public static double[] createDoubles() {
		double[] array1 = new double [7];
		double i = 10.0;
		int j = 0;
		while (i <= 13.0 && j < array1.length) {
			array1[j] = i * i;
			i += 0.5;
			j++;
		}
		return array1;
	}

	// Method createStrings
	public static String[] createStrings(String s) {
		String[] str = new String[4];
		str[0] = s;
		str[1] = s.toUpperCase();
		str[2] = s.toLowerCase();
		str[3] = s.substring(1);
		return str;
	}

	// Method createChars 
	public static char[] createChars(String s) {
		char[] uwu = new char[s.length()];
		for (int i = 0;i < uwu.length;i++)
			uwu[i] = s.charAt(i);
		return uwu;
	}

	// Method sumArray
	public static int sumArray(int[] uwu) {
		int sum = 0;
		for (int i = 0;i < uwu.length;i++) {
			sum += uwu[i];
		}
		return sum;
	}

	// Method findLargest
	public static double findLargest(double[] uwu) {
		double max = uwu[0];
		for (int i = 0;i < uwu.length;i++) {
			if (uwu[i] > max) {
				max = uwu[i];
			}
		}
		return max;
	}

	// Method charFrequency
	public static int charFrequency(String[] s, char c) {
		int count = 0;
		for (int i = 0;i < s.length;i++) {
			String str = s[i];
			for (int j = 0;j < str.length();j++) {
				if (str.charAt(j) == c) {
					count++;
				}
			}
		}
		return count;
	}

	// Method translateChars 
	public static int[] translateChars(char[] c) {
		int[] trans = new int[c.length];
		for (int i = 0;i < c.length;i++) {
			trans[i] = (int)(c[i]);
		}
		return trans;
	}

	// Main Method
	public static void main(String[] args) {

        // Create arrays
        int[] integerArray = createIntegers();
        System.out.println(Arrays.toString(integerArray));
        double[] doubleArray = createDoubles();
        System.out.println(Arrays.toString(doubleArray));
        String[] stringArray = createStrings("Teknologi Informasi");
        System.out.println(Arrays.toString(stringArray));
        char[] charArray = createChars("uny2019jaya!!!");
        System.out.println(Arrays.toString(charArray));

        // Test processing
        System.out.println("Sum of integer array = " + sumArray(integerArray));
        System.out.println("Largest of double array = " + findLargest(doubleArray));
        System.out.println("Frequency of 'i' dalam stringArray = " + charFrequency(stringArray, 'i'));
        System.out.println("Translated characters = " + Arrays.toString(translateChars(charArray)));
    }
}

/*
======
OUTPUT
======
[16, 21, 34, 49, 55, 60, 72, 83, 101]
[100.0, 110.25, 121.0, 132.25, 144.0, 156.25, 169.0]
[Teknologi Informasi, TEKNOLOGI INFORMASI, teknologi informasi, eknologi Informasi]
[u, n, y, 2, 0, 1, 9, j, a, y, a, !, !, !]
Sum of integer array = 491
Largest of double array = 169.0
Frequency of 'i' dalam stringArray = 7
Translated characters = [117, 110, 121, 50, 48, 49, 57, 106, 97, 121, 97, 33, 33, 33]
*/