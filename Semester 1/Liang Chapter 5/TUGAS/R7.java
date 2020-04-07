/*
=================================
Nama	: Muchamad Lutfi Maftuh
NIM		: 19537141023
Kelas	: I.1
=================================

Question 1) What does the following loop output?
for(int i = 5; i < 30; i+=5)
    System.out.println(i);
Answer:
5
10
15
20
25

Question 2) What does the following loop output?
int j = 0;
while (j <= 8) {
    System.out.println(++j); // preincrement operator!
}
Answer:
1
2
3
4
5
6
7
8
9

Question 3) What does the following loop output?
for (int k = 7; k >= 0; k--); 
    System.out.println(k); // are you sure?
Answer:
Error karena ada close statement setelah for
Apabila kodenya:
for (int k = 7; k >= 0; k--) 
    System.out.println(k);
Outputnya:
7
6
5
4
3
2
1
0


Question 4) What does the following loop output?
for (int l = 0; l > 0; l++)
    System.out.println(l);
Answer:
Output kosong karena kondisi loop tidak memenuhi

Question 5) What does the following loop output?
int m = 0;
do {
    System.out.println(m--); // postincrement operator
}
while (m > 0);
Answer:
0

*/
public class R7 {
	public static void reverseString(String s) {
    int totalhuruf = s.length();
    String reverse = "";
    for(int i = 0;i < totalhuruf;i++)
    	reverse = s.charAt(i) + reverse;
    System.out.println(reverse);
	}

	public static void printAscii(char start, char end) {
    int mulai = (int)(start);
    int selesai = (int)(end);
    for (int i = mulai;i <= selesai;i++)
    	System.out.println(i + ": " + ((char)(i)));
	}

	public static double raiseToPower(double number, int exponent) {
    double hasil = 1;
    int batas = 1;
    while (batas <= exponent) {
        hasil = hasil * number;
        batas++;
    }
    return hasil;
	}

	public static void main(String[] args) {
	// Test reverseString
    String forward = "Java Programming rules!";
    System.out.print("Forward string: ");
    System.out.println(forward);
    System.out.print("Reverse string: ");
    reverseString(forward);
          
    // Test printAscii
    System.out.println("ASCII Table");
    printAscii('!', '9');
        
    // Test raiseToPower
    System.out.printf("3.0 to the 5 = %.3f\n", raiseToPower(3.0, 5));
    System.out.printf("2.5 to the 2 = %.3f\n", raiseToPower(2.5, 2));
	}
}

/*
-------
Output:
-------
Forward string: Java Programming rules!
Reverse string: !selur gnimmargorP avaJ
ASCII Table
33: !
34: "
35: #
36: $
37: %
38: &
39: '
40: (
41: )
42: *
43: +
44: ,
45: -
46: .
47: /
48: 0
49: 1
50: 2
51: 3
52: 4
53: 5
54: 6
55: 7
56: 8
57: 9
3.0 to the 5 = 243.000
2.5 to the 2 = 6.250
*/

