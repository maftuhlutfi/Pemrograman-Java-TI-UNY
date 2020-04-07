/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

import java.util.*;

public class soal_11_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Input integer and 0 for stop");
		while (1 < 2) {
			int userInt = input.nextInt();
			if (userInt == 0) {
				break;
			}
			list.add(userInt);
		}

		if (list.size() == 0) {
			System.out.println("null");
		} else {
			int max = list.get(0);
			for (Integer i : list) {
				if (max < i) {
					max = i;
				}
			}
			System.out.println("The maximum is: " + max);
		}
	}
}

/*
======
OUTPUT
======
Input integer and 0 for stop
2
3
4
0
The maximum is: 4
*/