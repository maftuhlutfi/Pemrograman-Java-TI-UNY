import java.util.*;
import java.io.*;

public class R16 {
	public static ArrayList<String> str = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		if (args[0] != "" && args[1] != "") {
			readFile(args[0]);
			writeFile(args[1]);
		}

		writeFile1("stop");
		
	}

	public static void readFile(String inputFile) throws IOException {
		Scanner scan = new Scanner(new File(inputFile));
		while (scan.hasNextLine()) {
			str.add(scan.nextLine());
		}
	}

	public static void writeFile(String outputFile) throws IOException {
		PrintWriter output = new PrintWriter(new File(outputFile));
		ArrayList<Scanner> linescan = new ArrayList<>();

		for (int i = 0;i < str.size();i++) {
			linescan.add(new Scanner(str.get(i)));
		}

		for (int i = 0;i < linescan.size();i++) {
			while (linescan.get(i).hasNext()) {
				if (linescan.get(i).hasNextInt()) {
					output.println("Integer: " + linescan.get(i).nextInt());
				}
				else if (linescan.get(i).hasNextDouble()) {
					output.println("Double: " + linescan.get(i).nextDouble());
				}
				else if (linescan.get(i).hasNext()) {
					output.println("String: " + linescan.get(i).next());
				}
			}
		}

		output.close();
	}

	public static void writeFile1(String stopper) throws IOException {
		System.out.println("Enter text:");
		Scanner input = new Scanner(System.in);
		PrintWriter output = new PrintWriter(new File("ouput1.txt"));
		String s = "";
		while (0 < 1) { 
			s = input.nextLine();
			if (s.toLowerCase().equals(stopper))
				break;
			output.println(s);
		}
		output.close();
	}
}