class MyString2 {
	// Data fields
	private String s;

	/** Create a new Mystring2 object */
	public MyString2(String s) {
		this.s = "";
		for (int i = 0; i < s.length(); i++) {
			this.s += s.charAt(i) + "";
		}
	}

	/** Returns an integer greater than 0, equal to 0, 
	*   or less than 0 to indicate whether this string  
	*   is greater than, equal to, or less than this s */
	public int compare(String s) {
		int index = 0;
		if (this.s.length() < s.length())
			index = -1;
		if (s.length() < this.s.length())
			index = 1; 


		for (int i = 0; i < this.s.length(); i++) {
			if (this.s.charAt(i) < s.charAt(i))
				index = -(i + 1);
			if (this.s.charAt(i) > s.charAt(i))
				index = i + 1;
		}
		return index;
	}

	/** Return a new MyString2 object that is 
	*   a substring with a specified begin */
	public MyString2 substring(int begin) {
		String b = "";
		for (int i = begin, j = 0; i < s.length(); i++, j++) {
			b += s.charAt(i) + "";
		}
		return new MyString2(b);
	}

	/** Return a new MyString2 object in all Upper case */
	public MyString2 toUpperCase() {
		String n = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				n += String.valueOf((char)(s.charAt(i) - 32));
			else
				n += String.valueOf(s.charAt(i));
		}
		return new MyString2(n);
	}

	/** Return string as a character array */
	public char[] toChars() {
		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
		}
		return ch;
	}

	/** Return the boolean value as a MyString2 object */
	public static MyString2 valueOf(boolean b) {
		return (b ? new MyString2("true") : new MyString2("false"));
	}

}

public class soal_10_23 {
	/** Main method */
	public static void main(String[] args) {
		// Create two MyStirng2 objects
		MyString2 str1 = new MyString2("test1");
		MyString2 str2 = new MyString2("abcdefghijklm");

		// Test compare(String s)
		System.out.println("\nCompare str1 to \"test1\":");
		System.out.println(str1.compare("test1"));

		// Test substring(int begin);
		System.out.println("\nDisplay a substring if str2 beginning at index 5:");
		print(str2.substring(5));

		// Test toUpperCase()
		System.out.println("\nConvert str2 to upper case:");
		print(str2.toUpperCase());

		// Test valueOf(boolean b)
		System.out.println("\nDisplay the boolean value true as a MyStirng2 object:");
		print(MyString2.valueOf(true)); 
	}

	/** Display a MyString2 object */
	public static void print(MyString2 str) {
		print(str.toChars());
	}

	/** Display an array of characters */
	public static void print(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}
		System.out.println();
	}
}

/*
======
OUTPUT
======
Compare str1 to "test1":
0

Display a substring if str2 beginning at index 5:
fghijklm

Convert str2 to upper case:
ABCDEFGHIJKLM

Display the boolean value true as a MyStirng2 object:
true
*/