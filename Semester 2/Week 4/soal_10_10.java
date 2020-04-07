class Queue {
	int[] elements;
	int size;

	Queue() {
		elements = new int[8];
	}

	void enqueue(int v) {
		// Cek apakah elements sudah penuh
		if (size >= elements.length) {
			// Jika ya, gandakan dan copy
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		// Tambahkan v ke elements
		elements[size++] = v;
	}

	int dequeue() {
		int element = elements[0];
		int[] temp = new int[elements.length];
		// Buang elemen 1st dan shifting ke kiri
		System.arraycopy(elements, 1, temp, 0, elements.length - 1);
		elements = temp;
		size--;
		return element;
	}

	boolean empty() {
		return size == 0;
	}

	int getSize() {
		return size;
	}
}

public class soal_10_10 {
	public static void main(String[] args) {
		Queue queue = new Queue();
		// Add 1 to 20
		for (int i = 1;i <= 20;i++) {
			queue.enqueue(i);
		}

		// Check size dan tampilkan element"
		System.out.println("The size: " + queue.getSize());
		for (int i = 0;i < queue.getSize();i++) {
			System.out.print(queue.elements[i] + " ");
		}
		System.out.printf("%n%n");

		// Check dequeue
		int size = queue.getSize();
		for (int i = 0;i < size;i++) {
			System.out.print(queue.dequeue() + " ");
		}

		System.out.println("\nThe size: " + queue.getSize());
	}
}

/*
======
OUTPUT
======
The size: 20
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 

1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 
The size: 0
*/