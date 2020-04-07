class MyString1 {
	// Data Fields
	private char[] chars;

	// Constructor
	/** Create Mystring1 object of specified characters */
	public MyString1(char[] chars) {
		this.chars = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			this.chars[i] = chars[i];
		}
	}

	// Methods
	/** Return the character at the specified index */
	public char charAt(int index) {
		return chars[index];
	}

	/** Return length */
	public int length() {
		return chars.length;
	}

	/** Return a substring of string with specified begin and end */
	public MyString1 substring(int begin, int end) {
		char[] ch = new char[end - begin];
		for (int i = begin, j = 0; i < end; i++, j++) {
		 	ch[j] = chars[i];
		}
		return new MyString1(ch); 
	}

	/** Return a new MyString1 of all LowerCase characters */
	public MyString1 toLowerCase() {
		char[] ch = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 'A' && chars[i] <= 'Z')
				ch[i] = (char)(chars[i] + 32);
			else
				ch[i] = chars[i];
		}
		return new MyString1(ch);
	}

	/** Return true if the two strings are equal */
	public boolean equals(MyString1 s) {
		if (chars.length != s.length())
			return false;
		for (int i = 0; i < chars.length; i++) {
			if(chars[i] != s.charAt(i))
				return false;
		}
		return true;
	}

	/** return i as a MyString object */
	public static MyString1 valueOf(int i) {
		// Count the number of digits in i
		int length = 0; 
		int n = i;
		while (n >= 1) {
			n /= 10;
			length++;
		}

		// Create a char array of the length of i
		char[] ch = new char[length];
		
		// Copy the digits in i to the array
		for (int j = 0, k = (int)Math.pow(10, length - 1); 
			j < length; j++, k /= 10) {
			ch[j] = Character.forDigit((i / k), 10);
			i %= k; 
		}

		return new MyString1(ch);
	}
}

public class soal_10_22 {
	/** Main method */
	public static void main(String[] args) {
		// Create to char arrays
		char[] test = {'T', 'e', 'S', 't'};
		char[] test2 = {'T', 'e', 'S', 't', '2'};

		// Create two MyString1 objects
		MyString1 str = new MyString1(test);
		MyString1 str2 = new MyString1(test2);

		// Display character at index 1 of MyString1 object 1
		System.out.println("\nCharacter at index 1 of MyString1 object 1: " 
			+ str.charAt(1));

		// Display the length of MyString1 object 1
		System.out.println("\nLength of MyString1 object 1: " + str.length());


		// Display a Substring from index 2 to 4 of MyString1 object 1
		System.out.println("\nSubstring from index 2 to 4 of MyString1 object 1: ");
		MyString1 substr = str.substring(2,4);
		for (int i = 0; i < substr.length(); i++) {
			System.out.print(substr.charAt(i));		
		}
		System.out.println();

		// Display MyString1 object 1 as lowercase:"
		System.out.println("\nMyString1 object 1 to lowercase:");
		MyString1 lower = str.toLowerCase();
		for (int i = 0; i < lower.length(); i++) {
			System.out.print(lower.charAt(i));		
		}
		System.out.println();

		// Test if MyString1 object 1 is equal to MyString1 object 2
		System.out.println("\nMyString1 object 1 is equal to MyString1 object 2? " 
			+ str.equals(str2));

		// Display the integer 145 as a MyString1 object
		System.out.println("\nDisplay the integer 145 as a MyString1 object: ");
		MyString1 value = str.valueOf(145);
		for (int i = 0; i < value.length(); i++) {
			System.out.print(value.charAt(i));		
		}
		System.out.println();

	}
}

/*
======
OUTPUT
======
Character at index 1 of MyString1 object 1: e

Length of MyString1 object 1: 4

Substring from index 2 to 4 of MyString1 object 1: 
St

MyString1 object 1 to lowercase:
test

MyString1 object 1 is equal to MyString1 object 2? false

Display the integer 145 as a MyString1 object: 
145
*/