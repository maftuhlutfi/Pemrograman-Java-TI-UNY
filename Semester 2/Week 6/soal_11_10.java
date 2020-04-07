/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

import java.util.*;

class MyStack extends ArrayList {

	private ArrayList<Object> list;

	// Constructor
	public MyStack() {
		list = new ArrayList<>();
	}

	public void push(Object o) {
		list.add(0, o);
	}

	public Object peek() {
		return list.get(0);
	}

	public Object pop() {
		Object o = list.get(0);
		list.remove(0);
		return o;
	}

	public String toString() {
		return "stack: " + list.toString();
	}
}

public class soal_11_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		MyStack stack = new MyStack();

		System.out.print("Masukkan 5 string: ");
		for (int i = 0;i < 5;i++) {
			stack.push(input.next());
		}

		System.out.print(stack.toString());
	}
}

/*
======
OUTPUT
======
Masukkan 5 string: a b c d e
stack: [e, d, c, b, a]
*/