import java.util.*;
import java.io.*;

public class jajal {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("i.txt"));
		while (scan.hasNextLine()) {
			if (scan.hasNextInt())
				System.out.println("Integer: " + scan.nextInt());
			else if (scan.hasNextDouble())
				System.out.println("Double: " + scan.nextDouble());
			else if (scan.hasNext())
				System.out.println("String: " + scan.next());
		}
	}
}