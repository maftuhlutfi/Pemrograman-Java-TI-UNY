/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

public class soal_10_3 {
	public static void main(String[] args) {
		MyInteger int1 = new MyInteger(4);
		MyInteger int2 = new MyInteger(5);

		// Test getter
		System.out.printf("int1 value is %d %n", int1.getValue());
		System.out.printf("int2 value is %d %n %n", int2.getValue());

		// Tes isEven(), isOdd(), isPrime()
		System.out.printf("is int1 value Even? %b %n", int1.isEven());
		System.out.printf("is int1 value Odd? %b %n", int1.isOdd());
		System.out.printf("is int1 value Prime? %b %n", int1.isPrime());
		System.out.printf("is int2 value Even? %b %n", int2.isEven());
		System.out.printf("is int2 value Odd? %b %n", int2.isOdd());
		System.out.printf("is int2 value Prime? %b %n %n", int2.isPrime());

		// Tes isEven(int), isOdd(int), isPrime(int)
		System.out.printf("is 6 value Even? %b %n", MyInteger.isEven(6));
		System.out.printf("is 6 value Odd? %b %n", MyInteger.isOdd(6));
		System.out.printf("is 6 value Prime? %b %n", MyInteger.isPrime(6));
		System.out.printf("is 7 value Even? %b %n", MyInteger.isEven(7));
		System.out.printf("is 7 value Odd? %b %n", MyInteger.isOdd(7));
		System.out.printf("is 7 value Prime? %b %n %n", MyInteger.isPrime(7));

		// Tes isEven(MyInteger), isOdd(MyInteger), isPrime(MyInteger)
		System.out.printf("is int1 Even? %b %n", MyInteger.isEven(int1));
		System.out.printf("is int1 Odd? %b %n", MyInteger.isOdd(int1));
		System.out.printf("is int1 Prime? %b %n", MyInteger.isPrime(int1));
		System.out.printf("is int2 Even? %b %n", MyInteger.isEven(int2));
		System.out.printf("is int2 Odd? %b %n", MyInteger.isOdd(int2));
		System.out.printf("is int2 Prime? %b %n %n", MyInteger.isPrime(int2));

		// Tes equals(int) dan equals(MyItenger)
		System.out.printf("is int1 value equals to 4? %b %n", int1.equals(4));
		System.out.printf("is int2 value equals to 4? %b %n", int2.equals(4));
		System.out.printf("is int1 equals to int2? %b %n %n", int1.equals(int2));

		// Tes parseInt(char[])
		System.out.printf("result of parseInt(['1', '2', '3']) is %d %n", MyInteger.parseInt(new char[] {'1', '2', '3'}));

		// Tes parseInt(String)
		System.out.printf("result of parseInt(456) is %d", MyInteger.parseInt("456"));
	}
}

class MyInteger {
	int value;

	MyInteger(int value) {
		this.value = value;
	}

	int getValue() {
		return value;
	}

	boolean isEven() {
		if (this.value % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	boolean isOdd() {
		if (this.value % 2 == 0) {
			return false;
		}
		else {
			return true;
		}
	} 

	boolean isPrime() {
		boolean a = true;
		for (int i = 2;i <= this.value / 2;i++) {
			if (this.value % i == 0) {
				a = false;
			}
		}
		return a;
	}

	static boolean isEven(int myInt) {
		if (myInt % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static boolean isOdd(int myInt) {
		if (myInt % 2 == 0) {
			return false;
		}
		else {
			return true;
		}
	} 

	static boolean isPrime(int myInt) {
		boolean a = true;
		for (int i = 2;i <= myInt / 2;i++) {
			if (myInt % i == 0) {
				a = false;
			}
		}
		return a;
	}

	static boolean isEven(MyInteger myInt) {
		if (myInt.getValue() % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static boolean isOdd(MyInteger myInt) {
		if (myInt.getValue() % 2 == 0) {
			return false;
		}
		else {
			return true;
		}
	} 

	static boolean isPrime(MyInteger myInt) {
		boolean a = true;
		for (int i = 2;i <= myInt.getValue() / 2;i++) {
			if (myInt.getValue() % i == 0) {
				a = false;
			}
		}
		return a;
	}

	boolean equals(int myInt) {
		if (myInt == this.value) {
			return true;
		}
		else {
			return false;
		}
	}

	boolean equals(MyInteger myInt) {
		if (myInt.getValue() == this.value) {
			return true;
		}
		else {
			return false;
		}
	}

	static int parseInt(char[] values) {
        int sum = 0;
        for (char i : values) {
            sum += Character.getNumericValue(i);
        }
        return sum;
    }

    static int parseInt(String value) {
        return Integer.parseInt(value);
    }
}

/*
======
OUTPUT
======

int1 value is 4 
int2 value is 5 
 
is int1 value Even? true 
is int1 value Odd? false 
is int1 value Prime? false 
is int2 value Even? false 
is int2 value Odd? true 
is int2 value Prime? true 
 
is 6 value Even? true 
is 6 value Odd? false 
is 6 value Prime? false 
is 7 value Even? false 
is 7 value Odd? true 
is 7 value Prime? true 
 
is int1 Even? true 
is int1 Odd? false 
is int1 Prime? false 
is int2 Even? false 
is int2 Odd? true 
is int2 Prime? true 
 
is int1 value equals to 4? true 
is int2 value equals to 4? false 
is int1 equals to int2? false 
 
result of parseInt(['1', '2', '3']) is 6 
result of parseInt(456) is 456
*/