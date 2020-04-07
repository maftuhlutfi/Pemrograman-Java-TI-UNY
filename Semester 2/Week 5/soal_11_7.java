/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/
import java.util.*;

public class soal_11_7 {
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

		Collections.shuffle(list);
		System.out.print("Shuffled list: "+ list.toString());
	}
}

/*
======
OUTPUT
======
Input integer and 0 for stop
1
2
3
0
Shuffled list: [2, 3, 1]
*/