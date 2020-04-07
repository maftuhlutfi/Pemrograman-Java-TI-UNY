import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

// Test Assignment
// Author: Russ Wakefield
// Class:  CS163
// Email:  waker@cs.colostate.edu

public class strexpressiontest {

	public static void main(String[] args) {
		String expression = "Haha 12 12.0";
		String str, str1;
		Scanner input = new Scanner (expression);
		if (input.hasNext()) {
			str = input.next();
			System.out.println("1st token is a string: " + str);
		} else {
			System.out.println("nothing in string");
			System.exit(0);
		}
		
		if (input.hasNextInt()) {
			System.out.println("2nd token is an int: " + input.nextInt());
		} 
		
		if (input.hasNextInt()) {
			System.out.println("3rd token is a an int: " + input.nextInt());
		} else if (input.hasNextDouble()) {
			System.out.println("3rd token is a double: " + input.nextDouble());
		}
		
		if (!input.hasNext())
			System.out.println("No more input");
	}
	
}