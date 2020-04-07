/*
=================================
Nama	: Muchamad Lutfi Maftuh
NIM		: 19537141023
Kelas	: I.1
=================================
*/

import java.util.Scanner;

public class P5 {
	public static void main(String[] args) {
		// Preliminary testing
    	printPrimes(1, 50);
    	System.out.println(removeVowels("BALONKU ADA LIMA RUPA RUPA WARNANYA"));
    	double result = evaluateExponent(2.0,16);
    	System.out.println("2.0 to the 16 = " + result);
    	computeStatistics(-1);
	}


// Method to check whether an integer is prime.
public static boolean isPrime(int number) {

    // DO NOT CHANGE THIS CODE!
    for(int i=2;i<=number/2;i++)
        if(number%i==0)
            return false;
    return true;
}

// Method to print primes in a specified range
public static void printPrimes(int start, int end) {
    for (int i = start;i <= end;i++) {
    	if (isPrime(i))
    		System.out.print(i + ", ");
    }
    System.out.println("");
}

// Method to remove vowels from a string
public static String removeVowels(String input) {
	String bknvokal = "";
	String input1 = input.toUpperCase();
    for (int i = 0;i < input1.length();i++) {
    	switch (input1.charAt(i)) {
    		case 'A': case 'I': case 'U': case 'E': case 'O': break;
    		default: bknvokal = bknvokal + input.charAt(i);
    	}
    }
    return bknvokal;
}

// Method to generate and print the value of a number raised to an exponent
public static double evaluateExponent(double number, int exponent) {
    double hasil = 1;
    int batas = 1;
    do {
        hasil = hasil * number;
        batas++;
    } while (batas <= exponent);
    return hasil;
}

// Method to find and print the minimum/maximum/mean of a set of positive numbers
public static void computeStatistics(int sentinel) {
    Scanner in = new Scanner(System.in);
    int value = 0, count = 0;
    double mean = 0;
    int minimum = Integer.MAX_VALUE;
    int maximum = Integer.MIN_VALUE;
    while (1 != 2) {
    	value = in.nextInt();
    	if (value == -1)
    		break;
    	if (value < minimum) 
    		minimum = value;
    	else if (value > maximum)
    		maximum = value;
    	mean = value + mean;
    	count++;
    }
    System.out.println("Count: " + count);
    System.out.println("Average: " + (mean / count));
    System.out.println("Maximum: " + maximum);
    System.out.println("Minimum: " + minimum);
}
}


/*


------
OUTPUT
------
1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
BLNK D LM RP RP WRNNY
2.0 to the 16 = 65536.0
25
55
86
76
-1
Count: 4
Average: 60.5
Maximum: 86
Minimum: 25


*/