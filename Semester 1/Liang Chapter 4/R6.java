// Muchamad Lutfi Maftuh
// Teknologi Informasi - I.1

public class R6 {
	public static void main(String[] args) {
		String myString0 = "Java";
		String myString1 = "Programming";
		String myString2 = "Language";
		System.out.println(myString0 + " is a " + myString1 + " " + myString2 + ".");
		System.out.println((myString1.length() + myString2.length()));
		System.out.println(myString1.charAt(1) + "," + myString1.charAt(3) + "," + myString1.charAt(6));
		System.out.println(myString0.indexOf("a"));
		System.out.println(myString2.toUpperCase());
		System.out.println(myString1.substring(2 , 8));
		String myString3 = new String ("Whatever!");
		String myString4 = new String ("Whatever!");
		System.out.println(myString3 == myString4);
		System.out.println(myString3.equals(myString4));
		char c0 = '^', c1 = 'G', c2 = '7';
		System.out.println(c0 + ";" + c1 + ";" + c2);
		System.out.println((int)c0 + "," + (int)c1 + "," + (int)c2);
	}
}