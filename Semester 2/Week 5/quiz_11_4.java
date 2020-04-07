/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

import java.util.*;

public class quiz_11_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[0];
		
		System.out.println("Input integer and 0 for stop");
		while (1 < 2) {
			int userInt = input.nextInt();
			if (userInt == 0) {
				break;
			}

			int[] temp = array;
			array = new int[temp.length + 1];

			for (int i = 0;i < temp.length;i++) {
				array[i] = temp[i];
			}

			array[array.length - 1] = userInt;
		}

		System.out.println("The maximum is: " + max(array)); 
	}

	public static int max(int[] array) {
		if (array.length == 0) {
			return 0;
		} else {
			int max = array[0];
			for (int i : array) {
				if (max < i) {
					max = i;
				}
			}
			return max;
		}
	}
}

/*
======
OUTPUT
======
Input integer and 0 for stop
1 2 5 10 0
The maximum is: 10
*/